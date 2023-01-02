package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UpdateBoardUsers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewBoard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-02T14:20:23.582Z[GMT]")


public class NewBoard   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("users")
  @Valid
  private List<UpdateBoardUsers> users = null;

  public NewBoard name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Board Name", description = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NewBoard users(List<UpdateBoardUsers> users) {
    this.users = users;
    return this;
  }

  public NewBoard addUsersItem(UpdateBoardUsers usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<UpdateBoardUsers>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
   **/
  @Schema(description = "")
      @Valid
    public List<UpdateBoardUsers> getUsers() {
    return users;
  }

  public void setUsers(List<UpdateBoardUsers> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBoard newBoard = (NewBoard) o;
    return Objects.equals(this.name, newBoard.name) &&
        Objects.equals(this.users, newBoard.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBoard {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
