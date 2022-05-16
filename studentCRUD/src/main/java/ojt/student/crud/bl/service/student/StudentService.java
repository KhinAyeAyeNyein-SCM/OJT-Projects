package ojt.student.crud.bl.service.student;

import java.util.List;

import ojt.student.crud.persistencee.entity.Student;
import ojt.student.crud.web.form.StudentForm;

/**
 * <h2> StudentService Class</h2>
 * <p>
 * Process for Displaying StudentService
 * </p>
 * 
 * @author KhinAyeAyeNyein
 *
 */
public interface StudentService {

    /**
     * <h2> getStudentList</h2>
     * <p>
     * 
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
     * @param studentForm
     */
    public void addStudent(StudentForm studentForm);
    
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
     * @param empid
     * @return
     * @return Student
     */
    public StudentForm getStudent(int empid);
    
    /**
     * <h2> updateStudent </h2>
     * <p>
     * 
     * </p>
     * 
     * @param studentForm
     */
    public void updateStudent(StudentForm studentForm);
    
    /**
     * <h2> isRollNoExist</h2>
     * <p>
     * 
     * </p>
     *
     * @param roll_number
     * @return
     * @return boolean
     */
    public boolean isRollNoExist(String roll_number);
}
