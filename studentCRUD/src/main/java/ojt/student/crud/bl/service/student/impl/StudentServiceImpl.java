package ojt.student.crud.bl.service.student.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ojt.student.crud.bl.service.student.StudentService;
import ojt.student.crud.persistencee.dao.student.StudentDao;
import ojt.student.crud.persistencee.entity.Student;
import ojt.student.crud.web.form.StudentForm;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    /**
     * <h2>studentDao</h2>
     * <p>
     * studentDao
     * </p>
     */
    @Autowired
    private StudentDao studentDao;

    /**
     * <h2>getStudentList</h2>
     * <p>
     * Getting all Students
     * </p>
     *
     * @return List<Student>
     */
    @Override
    @Transactional
    public List<Student> getStudentList() {
        return studentDao.getStudentList();
    }

    /**
     * <h2>addStudent</h2>
     * <p>
     * Adding new Student
     * </p>
     * 
     * @param studentForm
     */
    @Override
    @Transactional
    public void addStudent(StudentForm studentForm) {
        Date currentDate = new Date();
        Student student = new Student(studentForm);
        this.studentDao.addStudent(student, currentDate);
    }

    /**
     * <h2>deleteStudent</h2>
     * <p>
     * Deleting a Student
     * </p>
     *
     * @param studentId
     * @return void
     */
    @Override
    @Transactional
    public void deleteStudent(Integer studentId) {
        studentDao.deleteStudent(studentId);
    }

    /**
     * <h2>getStudent</h2>
     * <p>
     * 
     * </p>
     * 
     * @param studentID
     * @return
     */
    @Override
    public StudentForm getStudent(int studentID) {
        Student resultPost = this.studentDao.getStudent(studentID);
        StudentForm resultPostform = resultPost != null ? new StudentForm(resultPost) : null;

        return resultPostform;
    }

    /**
     * <h2>updateStudent</h2>
     * <p>
     * 
     * </p>
     * 
     * @param studentForm
     */
    @Override
    public void updateStudent(StudentForm studentForm) {
        Student updateStudent = this.studentDao.getStudent(studentForm.getId());
        updateStudent.setRoll_number(studentForm.getRoll_number());
        updateStudent.setName(studentForm.getName());
        updateStudent.setMajor(studentForm.getMajor());
        updateStudent.setYear(Integer.parseInt(studentForm.getYear()));
        updateStudent.setEmail(studentForm.getEmail());
        updateStudent.setDob(studentForm.getDob());
        updateStudent.setUpdatedAt(new Date());
        this.studentDao.updateStudent(updateStudent);
    }

    /**
     * <h2>setStudentDao</h2>
     * <p>
     * 
     * </p>
     *
     * @param studentDao
     * @return void
     */
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    
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
    @Override
    public boolean isRollNoExist(String roll_number) {
        Student resultPost = this.studentDao.isRollNoExist(roll_number);
        boolean rollNoExist = false;
        if (resultPost != null) {
            rollNoExist = true;
        }

        return rollNoExist;
    }
}
