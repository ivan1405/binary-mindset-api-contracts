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
        Project project1 = new Project();
        project1.setProjectId(1);
        project1.setTitle("My awesome project 1");
        project1.setDescription("This is the first project created with the best api");

        Project project2 = new Project();
        project2.setProjectId(2);
        project2.setTitle("My second project");
        project2.setDescription("Another awesome project");

        List<Project> projects = new ArrayList<Project>(){{
            add(project1);
            add(project2);
        }};
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
}
