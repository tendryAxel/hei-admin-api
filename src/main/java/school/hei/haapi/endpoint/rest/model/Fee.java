/*
 * HEI Admin API
 * _Programmatically connect to a computer programming [school](https://hei.school)._ After [joining us](mailto:contact@hei.school), you can get an identification token from our [dev](https://dev-hei-admin.auth.eu-west-3.amazoncognito.com/oauth2/authorize?client_id=5s8cg50doahmu855rlc8fr6qmp&response_type=token&scope=email+openid&redirect_uri=https%3A%2F%2Fapi-dev.hei.school%2Fwhoami) or [prod](https://prod-hei-admin.auth.eu-west-3.amazoncognito.com/oauth2/authorize?client_id=i8bg538jpfu6mqmqb61m26trd&response_type=token&scope=email+openid&redirect_uri=https%3A%2F%2Fapi-prod.hei.school%2Fwhoami) authentication service. Then, start playing with our system!  The implementation of our API is [publicly disclosed](https://github.com/hei-school/hei-admin-api). You are welcome to try and compromise it. Happy hacking! 
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package school.hei.haapi.endpoint.rest.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import school.hei.haapi.endpoint.rest.model.CreateFee;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Fee
 */
@JsonPropertyOrder({
  Fee.JSON_PROPERTY_ID,
  Fee.JSON_PROPERTY_STUDENT_ID,
  Fee.JSON_PROPERTY_REMAINING_AMOUNT,
  Fee.JSON_PROPERTY_STATUS,
  Fee.JSON_PROPERTY_UPDATED_AT,
  Fee.JSON_PROPERTY_TYPE,
  Fee.JSON_PROPERTY_COMMENT,
  Fee.JSON_PROPERTY_TOTAL_AMOUNT,
  Fee.JSON_PROPERTY_CREATION_DATETIME,
  Fee.JSON_PROPERTY_DUE_DATETIME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T21:29:18.718768+01:00[Europe/Paris]")
public class Fee {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_STUDENT_ID = "student_id";
  private String studentId;

  public static final String JSON_PROPERTY_REMAINING_AMOUNT = "remaining_amount";
  private Integer remainingAmount;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    UNPAID("UNPAID"),
    
    PAID("PAID"),
    
    LATE("LATE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private java.time.Instant updatedAt;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    TUITION("TUITION"),
    
    HARDWARE("HARDWARE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT = "total_amount";
  private Integer totalAmount;

  public static final String JSON_PROPERTY_CREATION_DATETIME = "creation_datetime";
  private java.time.Instant creationDatetime;

  public static final String JSON_PROPERTY_DUE_DATETIME = "due_datetime";
  private java.time.Instant dueDatetime;


  public Fee id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Fee studentId(String studentId) {
    this.studentId = studentId;
    return this;
  }

   /**
   * Get studentId
   * @return studentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STUDENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStudentId() {
    return studentId;
  }


  @JsonProperty(JSON_PROPERTY_STUDENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }


  public Fee remainingAmount(Integer remainingAmount) {
    this.remainingAmount = remainingAmount;
    return this;
  }

   /**
   * Get remainingAmount
   * @return remainingAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REMAINING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRemainingAmount() {
    return remainingAmount;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemainingAmount(Integer remainingAmount) {
    this.remainingAmount = remainingAmount;
  }


  public Fee status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Fee updatedAt(java.time.Instant updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.time.Instant getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(java.time.Instant updatedAt) {
    this.updatedAt = updatedAt;
  }


  public Fee type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Fee comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public Fee totalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalAmount() {
    return totalAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }


  public Fee creationDatetime(java.time.Instant creationDatetime) {
    this.creationDatetime = creationDatetime;
    return this;
  }

   /**
   * Get creationDatetime
   * @return creationDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATION_DATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.time.Instant getCreationDatetime() {
    return creationDatetime;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDatetime(java.time.Instant creationDatetime) {
    this.creationDatetime = creationDatetime;
  }


  public Fee dueDatetime(java.time.Instant dueDatetime) {
    this.dueDatetime = dueDatetime;
    return this;
  }

   /**
   * Get dueDatetime
   * @return dueDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DUE_DATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.time.Instant getDueDatetime() {
    return dueDatetime;
  }


  @JsonProperty(JSON_PROPERTY_DUE_DATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueDatetime(java.time.Instant dueDatetime) {
    this.dueDatetime = dueDatetime;
  }


  /**
   * Return true if this Fee object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fee fee = (Fee) o;
    return Objects.equals(this.id, fee.id) &&
        Objects.equals(this.studentId, fee.studentId) &&
        Objects.equals(this.remainingAmount, fee.remainingAmount) &&
        Objects.equals(this.status, fee.status) &&
        Objects.equals(this.updatedAt, fee.updatedAt) &&
        Objects.equals(this.type, fee.type) &&
        Objects.equals(this.comment, fee.comment) &&
        Objects.equals(this.totalAmount, fee.totalAmount) &&
        Objects.equals(this.creationDatetime, fee.creationDatetime) &&
        Objects.equals(this.dueDatetime, fee.dueDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, studentId, remainingAmount, status, updatedAt, type, comment, totalAmount, creationDatetime, dueDatetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fee {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentId: ").append(toIndentedString(studentId)).append("\n");
    sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    creationDatetime: ").append(toIndentedString(creationDatetime)).append("\n");
    sb.append("    dueDatetime: ").append(toIndentedString(dueDatetime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

