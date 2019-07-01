package com.demo.api.taskmanagement.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SubTask
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-01T11:45:26.088+03:00")

public class SubTask   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("taskName")
  private String taskName = null;

  @JsonProperty("timeSpent")
  private Long timeSpent = null;

  @JsonProperty("taskGroup")
  private String taskGroup = null;

  @JsonProperty("assignee")
  private String assignee = null;

  @JsonProperty("finished")
  private Boolean finished = false;

  public SubTask id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SubTask taskName(String taskName) {
    this.taskName = taskName;
    return this;
  }

   /**
   * Get taskName
   * @return taskName
  **/
  @ApiModelProperty(value = "")


  public String getTaskName() {
    return taskName;
  }

  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }

  public SubTask timeSpent(Long timeSpent) {
    this.timeSpent = timeSpent;
    return this;
  }

   /**
   * Get timeSpent
   * @return timeSpent
  **/
  @ApiModelProperty(value = "")


  public Long getTimeSpent() {
    return timeSpent;
  }

  public void setTimeSpent(Long timeSpent) {
    this.timeSpent = timeSpent;
  }

  public SubTask taskGroup(String taskGroup) {
    this.taskGroup = taskGroup;
    return this;
  }

   /**
   * Get taskGroup
   * @return taskGroup
  **/
  @ApiModelProperty(value = "")


  public String getTaskGroup() {
    return taskGroup;
  }

  public void setTaskGroup(String taskGroup) {
    this.taskGroup = taskGroup;
  }

  public SubTask assignee(String assignee) {
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @ApiModelProperty(value = "")


  public String getAssignee() {
    return assignee;
  }

  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }

  public SubTask finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Get finished
   * @return finished
  **/
  @ApiModelProperty(value = "")


  public Boolean getFinished() {
    return finished;
  }

  public void setFinished(Boolean finished) {
    this.finished = finished;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubTask subTask = (SubTask) o;
    return Objects.equals(this.id, subTask.id) &&
        Objects.equals(this.taskName, subTask.taskName) &&
        Objects.equals(this.timeSpent, subTask.timeSpent) &&
        Objects.equals(this.taskGroup, subTask.taskGroup) &&
        Objects.equals(this.assignee, subTask.assignee) &&
        Objects.equals(this.finished, subTask.finished);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskName, timeSpent, taskGroup, assignee, finished);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubTask {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    taskGroup: ").append(toIndentedString(taskGroup)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
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

