package ojt.student.crud.persistencee.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import ojt.student.crud.web.form.StudentForm;

/**
 * <h2>Student Class</h2>
 * <p>
 * Process for Displaying Student
 * </p>
 * 
 * @author KhinAyeAyeNyein
 *
 */
@Entity
@Table(name = "student")
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String roll_number;
    private String name;
    private String major;
    private int year;
    private String email;
    private String dob;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    
    /**
     * <h2> getId</h2>
     * <p>
     * Getter Method For Id of Student
     * </p>
     *
     * @return id
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    
    /**
     * <h2> setId</h2>
     * <p>
     * Setter Method For Id of Student
     * </p>
     *
     * @param id
     * @return void
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * <h2> getRoll_number</h2>
     * <p>
     * 
     * </p>
     *
     * @return
     * @return String
     */
    @Column(name = "roll_number")
    public String getRoll_number() {
        return roll_number;
    }
    /**
     * <h2> setRoll_number</h2>
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
     * <h2> getName</h2>
     * <p>
     *  Getter Method for name of Student
     * </p>
     *
     * @return
     * @return String
     */
    @Column(name = "name")
    public String getName() {
        return name;
    }
    /**
     * <h2> setName</h2>
     * <p>
     * Setter Method for name of Student
     * </p>
     *
     * @param name
     * @return void
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * <h2> getMajor</h2>
     * <p>
     * Getter Method for major of Student
     * </p>
     *
     * @return
     * @return String
     */
    @Column(name = "major")
    public String getMajor() {
        return major;
    }
    /**
     * <h2> setMajor</h2>
     * <p>
     * Setter Method for major of Student
     * </p>
     *
     * @param major
     * @return void
     */
    public void setMajor(String major) {
        this.major = major;
    }
    /**
     * <h2> getYear</h2>
     * <p>
     * Getter Method for year of Student
     * </p>
     *
     * @return
     * @return int
     */
    @Column(name = "year")
    public int getYear() {
        return year;
    }
    /**
     * <h2> setYear</h2>
     * <p>
     * Setter Method for year of Student
     * </p>
     *
     * @param year
     * @return void
     */
    public void setYear(int year) {
        this.year = year;
    }
    /**
     * <h2> getEmail</h2>
     * <p>
     * Getter Method for email of Student
     * </p>
     *
     * @return
     * @return String
     */
    @Column(name = "email")
    public String getEmail() {
        return email;
    }
    /**
     * <h2> setEmail</h2>
     * <p>
     * Setter Method for email of Student
     * </p>
     *
     * @param email
     * @return void
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * <h2> getDob</h2>
     * <p>
     * Getter Method for dob of Student
     * </p>
     *
     * @return
     * @return Date
     */
    @Column(name = "dob")
    public String getDob() {
        return dob;
    }
    /**
     * <h2> setDob</h2>
     * <p>
     * Setter Method for dob of Student
     * </p>
     *
     * @param dob
     * @return void
     */
    public void setDob(String dob) {
        this.dob = dob;
    }
    /**
     * <h2> getCreatedAt</h2>
     * <p>
     * Getter Method for created_at of Student
     * </p>
     *
     * @return
     * @return Date
     */
    @Column(name = "created_at")
    public Date getCreatedAt() {
        return createdAt;
    }
    /**
     * <h2> setCreatedAt</h2>
     * <p>
     * Setter Method for created_at of Student
     * </p>
     *
     * @param createdAt
     * @return void
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    /**
     * <h2> getUpdatedAt</h2>
     * <p>
     * Getter Method for updated_at of Student
     * </p>
     *
     * @return
     * @return Date
     */
    @Column(name = "updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }
    /**
     * <h2> setUpdatedAt</h2>
     * <p>
     * Setter Method for updated_at of Student
     * </p>
     *
     * @param updatedAt
     * @return void
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    /**
     * <h2> getDeletedAt</h2>
     * <p>
     * Getter Method for deleted_at of Student
     * </p>
     *
     * @return
     * @return Date
     */
    @Column(name = "deleted_at")
    public Date getDeletedAt() {
        return deletedAt;
    }
    /**
     * <h2> setDeletedAt</h2>
     * <p>
     * Setter Method for deleted_at of Student
     * </p>
     *
     * @param deletedAt
     * @return void
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
    
    /**
     * <h2> Constructor for Student </h2>
     * <p>
     * Constructor for Student
     * </p>
     */
    public Student() {
        super();
    }

    /**
     * <h2> Constructor for Student </h2>
     * <p>
     * Constructor for Student
     * </p>
     * @param studentForm
     */
    public Student(StudentForm studentForm) {
        this.id = studentForm.getId();
        this.roll_number = studentForm.getRoll_number();
        this.name = studentForm.getName();
        this.major = studentForm.getMajor();
        this.year = Integer.parseInt(studentForm.getYear());
        this.email = studentForm.getEmail();
        this.dob = studentForm.getDob();
        this.createdAt = studentForm.getCreatedAt();
        this.updatedAt = studentForm.getUpdatedAt();
        this.deletedAt = studentForm.getDeletedAt();
    }
}
