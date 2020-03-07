package com.binary.mindset.contracts;

import com.binary.mindset.contracts.model.Project;
import com.binary.mindset.contracts.model.Task;
import com.binary.mindset.contracts.model.TaskInformation;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ProjectsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-07T16:00:33.009+01:00[Europe/Paris]")

public interface ProjectsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /projects : Creates a new project
     *
     * @param project Information about the project which will be created (required)
     * @return Project created successfully (status code 201)
     * @see ProjectsApi#createProject
     */
    default ResponseEntity<Project> createProject(Project project) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"description\" : \"description\", \"title\" : \"title\", \"projectId\" : 0, \"tasks\" : [ { \"modificationDate\" : \"2000-01-23\", \"information\" : { \"description\" : \"description\", \"title\" : \"title\", \"status\" : \"CREATED\" }, \"creationDate\" : \"2000-01-23\", \"taskId\" : 6 }, { \"modificationDate\" : \"2000-01-23\", \"information\" : { \"description\" : \"description\", \"title\" : \"title\", \"status\" : \"CREATED\" }, \"creationDate\" : \"2000-01-23\", \"taskId\" : 6 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /projects/{project-id} : Deletes a specific project
     *
     * @param projectId Id of the project to delete (required)
     * @return Project deleted successfully (status code 200)
     * @see ProjectsApi#deleteProject
     */
    default ResponseEntity<Void> deleteProject(Integer projectId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /projects/{project-id}/tasks/{task-id} : Deletes a specific task
     *
     * @param projectId Id of the project to request (required)
     * @param taskId Id of the task to delete (required)
     * @return Task deleted successfully (status code 200)
     * @see ProjectsApi#deleteTask
     */
    default ResponseEntity<Void> deleteTask(Integer projectId,
        Integer taskId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /projects/{project-id} : Returns a specific project
     *
     * @param projectId Id of the project to request (required)
     * @return Project found successfully (status code 200)
     * @see ProjectsApi#getProject
     */
    default ResponseEntity<Project> getProject(Integer projectId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"description\" : \"description\", \"title\" : \"title\", \"projectId\" : 0, \"tasks\" : [ { \"modificationDate\" : \"2000-01-23\", \"information\" : { \"description\" : \"description\", \"title\" : \"title\", \"status\" : \"CREATED\" }, \"creationDate\" : \"2000-01-23\", \"taskId\" : 6 }, { \"modificationDate\" : \"2000-01-23\", \"information\" : { \"description\" : \"description\", \"title\" : \"title\", \"status\" : \"CREATED\" }, \"creationDate\" : \"2000-01-23\", \"taskId\" : 6 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /projects : Returns the list of existing projects
     *
     * @return List of existing projects (status code 200)
     * @see ProjectsApi#getProjects
     */
    default ResponseEntity<List<Project>> getProjects() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"description\" : \"description\", \"title\" : \"title\", \"projectId\" : 0, \"tasks\" : [ { \"modificationDate\" : \"2000-01-23\", \"information\" : { \"description\" : \"description\", \"title\" : \"title\", \"status\" : \"CREATED\" }, \"creationDate\" : \"2000-01-23\", \"taskId\" : 6 }, { \"modificationDate\" : \"2000-01-23\", \"information\" : { \"description\" : \"description\", \"title\" : \"title\", \"status\" : \"CREATED\" }, \"creationDate\" : \"2000-01-23\", \"taskId\" : 6 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /projects/{project-id}/tasks/{task-id} : Returns a specific task
     *
     * @param projectId Id of the project to request (required)
     * @param taskId Id of the task to request (required)
     * @return Task found successfully (status code 200)
     * @see ProjectsApi#getTask
     */
    default ResponseEntity<Task> getTask(Integer projectId,
        Integer taskId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"modificationDate\" : \"2000-01-23\", \"information\" : { \"description\" : \"description\", \"title\" : \"title\", \"status\" : \"CREATED\" }, \"creationDate\" : \"2000-01-23\", \"taskId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /projects/{project-id}/tasks : Returns the list of tasks which belong to a project
     *
     * @param projectId Id of the project to request (required)
     * @return Tasks found successfully (status code 200)
     * @see ProjectsApi#getTasks
     */
    default ResponseEntity<List<Task>> getTasks(Integer projectId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"modificationDate\" : \"2000-01-23\", \"information\" : { \"description\" : \"description\", \"title\" : \"title\", \"status\" : \"CREATED\" }, \"creationDate\" : \"2000-01-23\", \"taskId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /projects/{project-id}/tasks/{task-id}/info : Modify the information of a specific task
     *
     * @param projectId Id of the project to request (required)
     * @param taskId Id of the task to modify (required)
     * @param taskInformation Information about the project which will be created (required)
     * @return Task modified successfully (status code 200)
     * @see ProjectsApi#modifyTask
     */
    default ResponseEntity<Task> modifyTask(Integer projectId,
        Integer taskId,
        TaskInformation taskInformation) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"modificationDate\" : \"2000-01-23\", \"information\" : { \"description\" : \"description\", \"title\" : \"title\", \"status\" : \"CREATED\" }, \"creationDate\" : \"2000-01-23\", \"taskId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
