package com.binary.mindset.contracts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-07T16:00:33.009+01:00[Europe/Paris]")

@Controller
@RequestMapping("${openapi.tasklistManagement.base-path:/tasklist-management/api}")
public class ProjectsApiController implements ProjectsApi {

    private final ProjectsApiDelegate delegate;

    public ProjectsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ProjectsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProjectsApiDelegate() {});
    }

    @Override
    public ProjectsApiDelegate getDelegate() {
        return delegate;
    }

}
