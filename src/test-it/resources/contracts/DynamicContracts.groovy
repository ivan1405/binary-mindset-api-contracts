package contracts

import org.springframework.cloud.contract.spec.Contract

def PATTERN_ANY_STRING_NUMBER = "([0-9]*)"

def contracts = []

contracts << Contract.make {
    priority(2)
    name("get project by id should return 200 code and the project information")
    description('''
given:
when:
    get /project/{project-id} is called
then:
    should answer with http 200 and the project information
''')
    request {
        method("GET")
        urlPath $(consumer(regex("/tasklist-management/api/projects/$PATTERN_ANY_STRING_NUMBER")),
                producer("/tasklist-management/api/projects/1"))
    }
    response {
        status(200)
        headers {
            contentType(applicationJson())
        }
        body([
                projectId  : $(consumer(1), producer(anyInteger())),
                title      : $(consumer('My awesome project 1'), producer(anyNonEmptyString())),
                description: $(consumer('This is the first project created with the best api'), producer(anyNonEmptyString()))
        ]
        )
    }
}

contracts
