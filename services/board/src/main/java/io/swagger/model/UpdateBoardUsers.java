package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateBoardUsers
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-02T14:20:23.582Z[GMT]")


public class UpdateBoardUsers   {
  @JsonProperty("userId")
  private Integer userId = null;

  @JsonProperty("privileges")
  private String privileges = null;

  public UpdateBoardUsers userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(description = "")
  
    public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public UpdateBoardUsers privileges(String privileges) {
    this.privileges = privileges;
    return this;
  }

  /**
   * Get privileges
   * @return privileges
   **/
  @Schema(example = "observer", description = "")
  
    public String getPrivileges() {
    return privileges;
  }

  public void setPrivileges(String privileges) {
    this.privileges = privileges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateBoardUsers updateBoardUsers = (UpdateBoardUsers) o;
    return Objects.equals(this.userId, updateBoardUsers.userId) &&
        Objects.equals(this.privileges, updateBoardUsers.privileges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, privileges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBoardUsers {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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
