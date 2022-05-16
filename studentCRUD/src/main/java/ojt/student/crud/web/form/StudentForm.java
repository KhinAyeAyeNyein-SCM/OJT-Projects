package ojt.student.crud.web.form;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import ojt.student.crud.persistencee.entity.Student;

public class StudentForm {
    private int id;
    @NotEmpty
    private String roll_number;
    @NotEmpty
    private String name;
    @NotEmpty
    private String major;
    @NotEmpty
    private String year;

    @Email
    @NotEmpty
    private String email;
    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private String dob;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

    /**
     * <h2>getId</h2>
     * <p>
     * ${Getter Method For Id of Student}
     * </p>
     *
     * @return
     * @return ${Integer}
     */
    public int getId() {
        return id;
    }

    /**
     * <h2>${id}</h2>
     * <p>
     * ${Setter Method For Post Id}
     * </p>
     *
     * @param id
     * @return void
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * <h2>getRoll_number</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getRoll_number() {
        return roll_number;
    }

    /**
     * <h2>setRoll_number</h2>
     * <p>
     * 
     * </p>
     *
     * @param roll_number
     * @return void
     */
    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }

    /**
     * <h2>getName</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * <h2>setName</h2>
     * <p>
     * 
     * </p>
     *
     * @param name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <h2>getMajor</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getMajor() {
        return major;
    }

    /**
     * <h2>setMajor</h2>
     * <p>
     * 
     * </p>
     *
     * @param major
     * @return void
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * <h2>getYear</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return int
     */
    public String getYear() {
        return year;
    }

    /**
     * <h2>setYear</h2>
     * <p>
     * 
     * </p>
     *
     * @param year
     * @return void
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * <h2>getEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * <h2>setEmail</h2>
     * <p>
     * 
     * </p>
     *
     * @param email
     * @return void
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <h2>getDob</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return Date
     */
    public String getDob() {
        return dob;
    }

    /**
     * <h2>setDob</h2>
     * <p>
     * 
     * </p>
     *
     * @param dob
     * @return void
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * <h2>getCreatedAt</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return Date
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <h2>setCreatedAt</h2>
     * <p>
     * 
     * </p>
     *
     * @param createdAt
     * @return void
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <h2>getUpdatedAt</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return Date
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * <h2>setUpdatedAt</h2>
     * <p>
     * 
     * </p>
     *
     * @param updatedAt
     * @return void
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <h2>getDeletedAt</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return Date
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * <h2>setDeletedAt</h2>
     * <p>
     * 
     * </p>
     *
     * @param deletedAt
     * @return void
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * <h2>Constructor for Student</h2>
     * <p>
     * Constructor for Student
     * </p>
     */
    public StudentForm() {
        super();
    }

    public StudentForm(Student student) {
        super();
        this.id = student.getId();
        this.roll_number = student.getRoll_number();
        this.name = student.getName();
        this.major = student.getMajor();
        this.year = String.valueOf(student.getYear());
        this.email = student.getEmail();
        this.dob = student.getDob();
        this.createdAt = student.getCreatedAt();
        this.updatedAt = student.getUpdatedAt();
    }
}
