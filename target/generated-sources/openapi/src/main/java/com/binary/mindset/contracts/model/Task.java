package com.binary.mindset.contracts.model;

import java.util.Objects;
import com.binary.mindset.contracts.model.TaskInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Task
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-03-07T16:00:33.009+01:00[Europe/Paris]")

public class Task   {
  @JsonProperty("taskId")
  private Integer taskId;

  @JsonProperty("information")
  private TaskInformation information;

  @JsonProperty("creationDate")
  private LocalDate creationDate;

  @JsonProperty("modificationDate")
  private LocalDate modificationDate;

  public Task taskId(Integer taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
  */
  @ApiModelProperty(value = "")


  public Integer getTaskId() {
    return taskId;
  }

  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }

  public Task information(TaskInformation information) {
    this.information = information;
    return this;
  }

  /**
   * Get information
   * @return information
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskInformation getInformation() {
    return information;
  }

  public void setInformation(TaskInformation information) {
    this.information = information;
  }

  public Task creationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDate creationDate) {
    this.creationDate = creationDate;
  }

  public Task modificationDate(LocalDate modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

  /**
   * Get modificationDate
   * @return modificationDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalDate getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(LocalDate modificationDate) {
    this.modificationDate = modificationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.taskId, task.taskId) &&
        Objects.equals(this.information, task.information) &&
        Objects.equals(this.creationDate, task.creationDate) &&
        Objects.equals(this.modificationDate, task.modificationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, information, creationDate, modificationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    information: ").append(toIndentedString(information)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

