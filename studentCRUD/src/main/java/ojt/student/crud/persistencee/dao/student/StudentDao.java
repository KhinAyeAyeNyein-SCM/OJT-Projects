package ojt.student.crud.persistencee.dao.student;

import java.util.Date;
import java.util.List;

import ojt.student.crud.persistencee.entity.Student;


/**
 * <h2> StudentDao Class</h2>
 * <p>
 * Process for Displaying StudentDao
 * </p>
 * 
 * @author KhinAyeAyeNyein
 *
 */
public interface StudentDao {
    /**
     * <h2> getStudentList</h2>
     * <p>
     * Getting all students 
     * </p>
     *
     * @return List<Student>
     */
    public List<Student> getStudentList();
    
    /**
     * <h2> addStudent</h2>
     * <p>
     * Adding new Student
     * </p>
     *
     * @param student
     * @return void
     */
    public void addStudent(Student student, Date currentDate);
    
    /**
     * <h2> deleteStudent</h2>
     * <p>
     * Deleting a Student
     * </p>
     *
     * @param studentId
     * @return void
     */
    public void deleteStudent(Integer studentId);
    
    /**
     * <h2> getStudent</h2>
     * <p>
     * 
     * </p>
     *
     * @param studentId
     * @return
     * @return Student
     */
    public Student getStudent(int studentId);
    
    /**
     * <h2> updateStudent</h2>
     * <p>
     * 
     * </p>
     *
     * @param student
     * @return
     * @return Student
     */
    public void updateStudent(Student student);
    
    /**
     * <h2> isRollNoExist</h2>
     * <p>
     * 
     * </p>
     *
     * @param roll_number
     * @return
     * @return Student
     */
    public Student isRollNoExist(String roll_number);
}
