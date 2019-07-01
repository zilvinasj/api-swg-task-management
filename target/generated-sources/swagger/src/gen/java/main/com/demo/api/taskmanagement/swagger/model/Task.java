package com.demo.api.taskmanagement.swagger.model;

import java.util.Objects;
import com.demo.api.taskmanagement.swagger.model.SubTask;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Task
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-01T11:45:26.088+03:00")

public class Task   {
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

  @JsonProperty("subTasks")
  private List<SubTask> subTasks = null;

  public Task id(Long id) {
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

  public Task taskName(String taskName) {
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

  public Task timeSpent(Long timeSpent) {
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

  public Task taskGroup(String taskGroup) {
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

  public Task assignee(String assignee) {
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

  public Task finished(Boolean finished) {
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

  public Task subTasks(List<SubTask> subTasks) {
    this.subTasks = subTasks;
    return this;
  }

  public Task addSubTasksItem(SubTask subTasksItem) {
    if (this.subTasks == null) {
      this.subTasks = new ArrayList<SubTask>();
    }
    this.subTasks.add(subTasksItem);
    return this;
  }

   /**
   * Get subTasks
   * @return subTasks
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SubTask> getSubTasks() {
    return subTasks;
  }

  public void setSubTasks(List<SubTask> subTasks) {
    this.subTasks = subTasks;
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
    return Objects.equals(this.id, task.id) &&
        Objects.equals(this.taskName, task.taskName) &&
        Objects.equals(this.timeSpent, task.timeSpent) &&
        Objects.equals(this.taskGroup, task.taskGroup) &&
        Objects.equals(this.assignee, task.assignee) &&
        Objects.equals(this.finished, task.finished) &&
        Objects.equals(this.subTasks, task.subTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskName, timeSpent, taskGroup, assignee, finished, subTasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    taskGroup: ").append(toIndentedString(taskGroup)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
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

