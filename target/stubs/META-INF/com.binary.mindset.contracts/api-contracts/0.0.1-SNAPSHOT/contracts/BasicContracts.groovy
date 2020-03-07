package contracts

import org.springframework.cloud.contract.spec.Contract

def contracts = []

contracts << Contract.make {
    name("get projects should return 200 code and list of projects")
    description('''
given:
when:
    get /projects is called
then:
    should answer with http 200 and the list of projects
''')
    request {
        method("GET")
        urlPath "/tasklist-management/api/projects"
    }
    response {
        status(200)
        headers {
            contentType(applicationJson())
        }
        body([
                [
                        projectId  : 1,
                        title      : 'My awesome project 1',
                        description: 'This is the first project created with the best api',
                ]
        ]

        )
    }

}

contracts
