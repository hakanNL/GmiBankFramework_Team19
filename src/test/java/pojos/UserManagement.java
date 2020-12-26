package pojos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "login",
        "firstName",
        "lastName",
        "email",
        "imageUrl",
        "activated",
        "langKey",
        "createdBy",
        "createdDate",
        "lastModifiedBy",
        "lastModifiedDate",
        "authorities"
})



public class UserManagement {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("login")
    private String login;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("imageUrl")
    private Object imageUrl;
    @JsonProperty("activated")
    private Boolean activated;
    @JsonProperty("langKey")
    private String langKey;
    @JsonProperty("createdBy")
    private String createdBy;
    @JsonProperty("createdDate")
    private String createdDate;
    @JsonProperty("lastModifiedBy")
    private String lastModifiedBy;
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;
    @JsonProperty("authorities")
    private List<String> authorities = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("imageUrl")
    public Object getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("imageUrl")
    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("activated")
    public Boolean getActivated() {
        return activated;
    }

    @JsonProperty("activated")
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @JsonProperty("langKey")
    public String getLangKey() {
        return langKey;
    }

    @JsonProperty("langKey")
    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    @JsonProperty("createdBy")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("createdDate")
    public String getCreatedDate() {
        return createdDate;
    }

    @JsonProperty("createdDate")
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @JsonProperty("lastModifiedBy")
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    @JsonProperty("lastModifiedBy")
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @JsonProperty("lastModifiedDate")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("authorities")
    public List<String> getAuthorities() {
        return authorities;
    }

    @JsonProperty("authorities")
    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public UserManagement(Integer id, String login, String firstName, String lastName, String email, Object imageUrl, Boolean activated, String langKey, String createdBy, String createdDate, String lastModifiedBy, String lastModifiedDate, List<String> authorities) {
        this.id = id;
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.imageUrl = imageUrl;
        this.activated = activated;
        this.langKey = langKey;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
        this.authorities = authorities;
    }

    public UserManagement() {
    }

    @Override
    public String toString() {
        return "US_30_Pojo{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", imageUrl=" + imageUrl +
                ", activated=" + activated +
                ", langKey='" + langKey + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", authorities=" + authorities +
                ", additionalProperties=" + additionalProperties +
                '}';
    }


}
