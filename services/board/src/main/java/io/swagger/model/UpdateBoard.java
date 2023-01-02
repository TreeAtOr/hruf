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
 * UpdateBoard
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-02T14:20:23.582Z[GMT]")


public class UpdateBoard   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("users")
  @Valid
  private List<UpdateBoardUsers> users = null;

  public UpdateBoard id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "53hEH8shXxLmiVK8TwPaIqDqRfUQdqG2", required = true, description = "")
      @NotNull

    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateBoard name(String name) {
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

  public UpdateBoard users(List<UpdateBoardUsers> users) {
    this.users = users;
    return this;
  }

  public UpdateBoard addUsersItem(UpdateBoardUsers usersItem) {
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
    UpdateBoard updateBoard = (UpdateBoard) o;
    return Objects.equals(this.id, updateBoard.id) &&
        Objects.equals(this.name, updateBoard.name) &&
        Objects.equals(this.users, updateBoard.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBoard {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
