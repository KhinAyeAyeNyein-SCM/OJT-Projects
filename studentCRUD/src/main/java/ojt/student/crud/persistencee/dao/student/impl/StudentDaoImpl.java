package ojt.student.crud.persistencee.dao.student.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ojt.student.crud.persistencee.dao.student.StudentDao;
import ojt.student.crud.persistencee.entity.Student;

/**
 * <h2>StudentDaoImpl Class</h2>
 * <p>
 * Process for Displaying StudentDaoImpl
 * </p>
 * 
 * @author KhinAyeAyeNyein
 *
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    /**
     * <h2>sessionFactory</h2>
     * <p>
     * sessionFactory
     * </p>
     */
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * <h2>getStudentList</h2>
     * <p>
     * Getting all students
     * </p>
     *
     * @return List<Student>
     */
    @SuppressWarnings("unchecked")
    public List<Student> getStudentList() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

    /**
     * <h2>addStudent</h2>
     * <p>
     * Adding new Student
     * </p>
     *
     * @param student
     * @return void
     */
    public void addStudent(Student student, Date currentDate) {
        student.setCreatedAt(currentDate);
        student.setUpdatedAt(currentDate);
        sessionFactory.getCurrentSession().saveOrUpdate(student);
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
    public void deleteStudent(Integer studentId) {
        Student student = (Student) sessionFactory.getCurrentSession().load(Student.class, studentId);
        if (null != student) {
            this.sessionFactory.getCurrentSession().delete(student);
        }
    }

    /**
     * <h2>getStudent</h2>
     * <p>
     * 
     * </p>
     * 
     * @param studentId
     * @return
     */
    @SuppressWarnings("deprecation")
    @Override
    public Student getStudent(int studentId) {
        System.out.println(studentId);
        String studentHqlQuery = "SELECT s FROM Student s where s.id = :id";
        Query queryStudentById = this.sessionFactory.getCurrentSession().createQuery(studentHqlQuery);
        queryStudentById.setParameter("id", studentId);
        Student resultStudent = (Student) queryStudentById.uniqueResult();
        return resultStudent;
    }

    /**
     * <h2>updateStudent</h2>
     * <p>
     * 
     * </p>
     *
     * @param student
     */
    @Override
    public void updateStudent(Student student) {
        this.sessionFactory.getCurrentSession().update(student);
    }

    /**
     * <h2>isRollNoExist</h2>
     * <p>
     * 
     * </p>
     *
     * @param roll_number
     * @return
     * @return Student
     */
    @Override
    public Student isRollNoExist(String roll_number) {
        String HqlQuery = "SELECT s FROM Student s where s.roll_number = :roll_number";
        Query queryisExist = this.sessionFactory.getCurrentSession().createQuery(HqlQuery);
        queryisExist.setParameter("roll_number", roll_number);
        Student resultPost = (Student) queryisExist.uniqueResult();

        return resultPost;
    }
}
