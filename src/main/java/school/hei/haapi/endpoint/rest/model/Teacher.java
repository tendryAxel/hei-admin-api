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
import java.util.Date;
import school.hei.haapi.endpoint.rest.model.EnableStatus;
import school.hei.haapi.endpoint.rest.model.User;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Teacher
 */
@JsonPropertyOrder({
  Teacher.JSON_PROPERTY_ID,
  Teacher.JSON_PROPERTY_REF,
  Teacher.JSON_PROPERTY_FIRST_NAME,
  Teacher.JSON_PROPERTY_LAST_NAME,
  Teacher.JSON_PROPERTY_EMAIL,
  Teacher.JSON_PROPERTY_SEX,
  Teacher.JSON_PROPERTY_BIRTH_DATE,
  Teacher.JSON_PROPERTY_ADDRESS,
  Teacher.JSON_PROPERTY_PHONE,
  Teacher.JSON_PROPERTY_ENTRANCE_DATETIME,
  Teacher.JSON_PROPERTY_STATUS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-07T21:29:18.718768+01:00[Europe/Paris]")
public class Teacher {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_REF = "ref";
  private String ref;

  public static final String JSON_PROPERTY_FIRST_NAME = "first_name";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "last_name";
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  /**
   * Gets or Sets sex
   */
  public enum SexEnum {
    M("M"),
    
    F("F");

    private String value;

    SexEnum(String value) {
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
    public static SexEnum fromValue(String value) {
      for (SexEnum b : SexEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEX = "sex";
  private SexEnum sex;

  public static final String JSON_PROPERTY_BIRTH_DATE = "birth_date";
  private java.time.LocalDate birthDate;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private String phone;

  public static final String JSON_PROPERTY_ENTRANCE_DATETIME = "entrance_datetime";
  private java.time.Instant entranceDatetime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private EnableStatus status;


  public Teacher id(String id) {
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


  public Teacher ref(String ref) {
    this.ref = ref;
    return this;
  }

   /**
   * Get ref
   * @return ref
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STD000001", value = "")
  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRef() {
    return ref;
  }


  @JsonProperty(JSON_PROPERTY_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRef(String ref) {
    this.ref = ref;
  }


  public Teacher firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Teacher lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Teacher email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Teacher sex(SexEnum sex) {
    this.sex = sex;
    return this;
  }

   /**
   * Get sex
   * @return sex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SexEnum getSex() {
    return sex;
  }


  @JsonProperty(JSON_PROPERTY_SEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSex(SexEnum sex) {
    this.sex = sex;
  }


  public Teacher birthDate(java.time.LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Get birthDate
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIRTH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.time.LocalDate getBirthDate() {
    return birthDate;
  }


  @JsonProperty(JSON_PROPERTY_BIRTH_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBirthDate(java.time.LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  public Teacher address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public Teacher phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(String phone) {
    this.phone = phone;
  }


  public Teacher entranceDatetime(java.time.Instant entranceDatetime) {
    this.entranceDatetime = entranceDatetime;
    return this;
  }

   /**
   * Get entranceDatetime
   * @return entranceDatetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTRANCE_DATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.time.Instant getEntranceDatetime() {
    return entranceDatetime;
  }


  @JsonProperty(JSON_PROPERTY_ENTRANCE_DATETIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntranceDatetime(java.time.Instant entranceDatetime) {
    this.entranceDatetime = entranceDatetime;
  }


  public Teacher status(EnableStatus status) {
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

  public EnableStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(EnableStatus status) {
    this.status = status;
  }


  /**
   * Return true if this Teacher object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Teacher teacher = (Teacher) o;
    return Objects.equals(this.id, teacher.id) &&
        Objects.equals(this.ref, teacher.ref) &&
        Objects.equals(this.firstName, teacher.firstName) &&
        Objects.equals(this.lastName, teacher.lastName) &&
        Objects.equals(this.email, teacher.email) &&
        Objects.equals(this.sex, teacher.sex) &&
        Objects.equals(this.birthDate, teacher.birthDate) &&
        Objects.equals(this.address, teacher.address) &&
        Objects.equals(this.phone, teacher.phone) &&
        Objects.equals(this.entranceDatetime, teacher.entranceDatetime) &&
        Objects.equals(this.status, teacher.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ref, firstName, lastName, email, sex, birthDate, address, phone, entranceDatetime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Teacher {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    entranceDatetime: ").append(toIndentedString(entranceDatetime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

