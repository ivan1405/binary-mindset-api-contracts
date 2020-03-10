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
                ],
                [
                        projectId  : 2,
                        title      : 'My second project',
                        description: 'Another awesome project',
                ]
        ]
        )
    }
}

contracts << Contract.make {
    priority(1)
    name("get project by id should return 200 code and a project with tasks")
    description('''
given:
when:
    get /project/{project-id} is called
then:
    should answer with http 200 and the a project with tasks
''')
    request {
        method("GET")
        urlPath "/tasklist-management/api/projects/99"
    }
    response {
        status(200)
        headers {
            contentType(applicationJson())
        }
        body([
                projectId  : 99,
                title      : 'My awesome project edge case',
                description: 'This project contains tasks!'
        ]
        )
    }
}

contracts
