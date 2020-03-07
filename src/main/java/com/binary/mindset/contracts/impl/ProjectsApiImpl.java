package com.binary.mindset.contracts.impl;

import com.binary.mindset.contracts.ProjectsApiDelegate;
import com.binary.mindset.contracts.model.Project;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectsApiImpl implements ProjectsApiDelegate {

    @Override
    public ResponseEntity<List<Project>> getProjects() {
        Project project = new Project();
        project.setProjectId(1);
        project.setTitle("My awesome project 1");
        project.setDescription("This is the first project created with the best api");

        List<Project> projects = new ArrayList<Project>(){{
            add(project);
        }};
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
}
