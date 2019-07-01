package com.demo.api.taskmanagement.swagger.model;

import java.util.Objects;
import com.demo.api.taskmanagement.swagger.model.Info;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseWrapper
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-07-01T11:45:26.088+03:00")

public class ResponseWrapper   {
  @JsonProperty("errors")
  private List<Info> errors = null;

  @JsonProperty("infos")
  private List<Info> infos = null;

  public ResponseWrapper errors(List<Info> errors) {
    this.errors = errors;
    return this;
  }

  public ResponseWrapper addErrorsItem(Info errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<Info>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Info> getErrors() {
    return errors;
  }

  public void setErrors(List<Info> errors) {
    this.errors = errors;
  }

  public ResponseWrapper infos(List<Info> infos) {
    this.infos = infos;
    return this;
  }

  public ResponseWrapper addInfosItem(Info infosItem) {
    if (this.infos == null) {
      this.infos = new ArrayList<Info>();
    }
    this.infos.add(infosItem);
    return this;
  }

   /**
   * Get infos
   * @return infos
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Info> getInfos() {
    return infos;
  }

  public void setInfos(List<Info> infos) {
    this.infos = infos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseWrapper responseWrapper = (ResponseWrapper) o;
    return Objects.equals(this.errors, responseWrapper.errors) &&
        Objects.equals(this.infos, responseWrapper.infos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, infos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseWrapper {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    infos: ").append(toIndentedString(infos)).append("\n");
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

