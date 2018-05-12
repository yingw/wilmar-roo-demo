package cn.wilmar.roo.domain;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import java.util.Objects;
import javax.persistence.Entity;

/**
 * = Employee
 TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
@RooEquals(isJpaEntity = true)
@Entity
@EntityFormat
public class Employee {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Version
    private Integer version;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Size(min = 1, max = 50)
    private String username;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Size(min = 1, max = 50)
    private String password;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date birthday;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private Boolean active;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToOne(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "employee")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    @EntityFormat
    private Department department;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    public static final String ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE = "The given Iterable of items to add can't be null!";

    /**
     * This `equals` implementation is specific for JPA entities and uses
     * the entity identifier for it, following the article in
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     *
     * @param obj
     * @return Boolean
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        // instanceof is false if the instance is null
        if (!(obj instanceof Employee)) {
            return false;
        }
        return getId() != null && Objects.equals(getId(), ((Employee) obj).getId());
    }

    /**
     * This `hashCode` implementation is specific for JPA entities and uses a fixed `int` value to be able
     * to identify the entity in collections after a new id is assigned to the entity, following the article in
     * https://vladmihalcea.com/2016/06/06/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
     *
     * @return Integer
     */
    public int hashCode() {
        return 31;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Integer
     */
    public Integer getVersion() {
        return this.version;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return String
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return String
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Date
     */
    public Date getBirthday() {
        return this.birthday;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Boolean
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return Department
     */
    public Department getDepartment() {
        return this.department;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param department
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return String
     */
    public String toString() {
        return "Employee {" + "id='" + id + '\'' + ", version='" + version + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + ", birthday='" + birthday + '\'' + ", active='" + active + '\'' + ", ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE='" + ITERABLE_TO_ADD_CANT_BE_NULL_MESSAGE + '\'' + ", ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE='" + ITERABLE_TO_REMOVE_CANT_BE_NULL_MESSAGE + '\'' + "}" + super.toString();
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param department
     */
    public void addToDepartment(Department department) {
        if (department == null) {
            removeFromDepartment();
        } else {
            this.department = department;
            department.setEmployee(this);
        }
    }

    /**
     * TODO Auto-generated method documentation
     *
     */
    public void removeFromDepartment() {
        if (this.department != null) {
            department.setEmployee(null);
        }
        this.department = null;
    }
}
