package ojt.student.crud.web.controller.student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ojt.student.crud.bl.service.student.StudentService;
import ojt.student.crud.persistencee.entity.Student;
import ojt.student.crud.web.form.StudentForm;

/**
 * <h2>StudentController Class</h2>
 * <p>
 * Process for Displaying StudentController
 * </p>
 * 
 * @author KhinAyeAyeNyein
 *
 */
@Controller
public class StudentController {

    /**
     * <h2>studentService</h2>
     * <p>
     * studentService
     * </p>
     */
    @Autowired
    private StudentService studentService;

    /**
     * <h2>messageSource</h2>
     * <p>
     * messageSource
     * </p>
     */
    @Autowired
    private MessageSource messageSource;

    /**
     * <h2>getStudentList</h2>
     * <p>
     * Getting list of all Students
     * </p>
     *
     * @param model
     * @return
     * @throws IOException
     * @return ModelAndView
     */
    @RequestMapping(value = "/studentList")
    public ModelAndView getStudentList(ModelAndView model) throws IOException {
        List<Student> StudentList = studentService.getStudentList();
        model.addObject("StudentList", StudentList);
        model.setViewName("studentList");
        return model;
    }

    /**
     * <h2>newStudent</h2>
     * <p>
     * Adding a new Student
     * </p>
     *
     * @param model
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/createStudent", method = RequestMethod.GET)
    public ModelAndView newStudent(ModelAndView model) {
        Student student = new Student();
        ModelAndView createStudent = new ModelAndView("createStudent");
        createStudent.addObject("rollBackStudentForm", student);
        createStudent.setViewName("createStudent");
        return createStudent;
    }

    /**
     * <h2>insertStudent</h2>
     * <p>
     * 
     * </p>
     *
     * @param studentForm
     * @param result
     * @param request
     * @return
     * @throws ParseException
     * @return ModelAndView
     */
    @RequestMapping(value = "/createStudentConfirm", params = "confirmStudent", method = RequestMethod.POST)
    public ModelAndView insertStudent(@ModelAttribute("createStudent") @Valid StudentForm studentForm,
            BindingResult result, HttpServletRequest request) throws ParseException {
        ModelAndView ConfirmView = new ModelAndView("createStudentConfirm");
        if (result.hasErrors()) {
            ConfirmView = new ModelAndView("createStudent");
            Student student = new Student();
            ConfirmView.addObject("rollBackStudentForm", student);
            ConfirmView.addObject("errorMsg", messageSource.getMessage("M_SC_0007", null, null));
        } else if (this.studentService.isRollNoExist(studentForm.getRoll_number())) {
            ConfirmView = new ModelAndView("createStudent");
            Student student = new Student();
            ConfirmView.addObject("rollBackStudentForm", student);
            ConfirmView.addObject("errorMsg", messageSource.getMessage("M_SC_0018", null, null));
        } else {
            ConfirmView.addObject("studentForm", studentForm);
            ConfirmView.setViewName("createStudentConfirm");
        }
        return ConfirmView;
    }

    /**
     * <h2>createStudentConfirm</h2>
     * <p>
     * 
     * </p>
     *
     * @param studentForm
     * @param result
     * @param request
     * @param response
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/insertStudent", params = "addStudent", method = RequestMethod.POST)
    public ModelAndView createStudentConfirm(@ModelAttribute("studentForm") @Valid StudentForm studentForm,
            BindingResult result, HttpServletRequest request, HttpServletResponse response) {
        this.studentService.addStudent(studentForm);
        ModelAndView createStudentView = new ModelAndView("redirect:/studentList");

        return createStudentView;
    }

    /**
     * <h2>cancelStudentConfirm</h2>
     * <p>
     * 
     * </p>
     *
     * @param studentForm
     * @param result
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/insertStudent", params = "cancel", method = RequestMethod.POST)
    public ModelAndView cancelStudentConfirm(@ModelAttribute("studentForm") @Valid StudentForm studentForm,
            BindingResult result) throws ParseException {
        ModelAndView createStudentView = new ModelAndView("createStudent");
        createStudentView.addObject("rollBackStudentForm", studentForm);
        return createStudentView;
    }

    /**
     * <h2>deleteStudent</h2>
     * <p>
     * Deleting a Student
     * </p>
     *
     * @param request
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
    public ModelAndView deleteStudent(HttpServletRequest request) {
        int studentId = Integer.parseInt(request.getParameter("id"));
        studentService.deleteStudent(studentId);
        return new ModelAndView("redirect:/studentList");
    }

    /**
     * <h2>editStudent</h2>
     * <p>
     * 
     * </p>
     *
     * @param request
     * @return
     * @return ModelAndView
     */
    @RequestMapping(value = "/updateStudent", method = RequestMethod.GET)
    public ModelAndView editStudent(@RequestParam("id") Integer studentId, HttpServletRequest request) {
        StudentForm student = studentService.getStudent(studentId);
        ModelAndView model = new ModelAndView("updateStudent");
        model.addObject("student", student);
        model.setViewName("updateStudent");
        return model;
    }

    /**
     * <h2>${Show Student Edited Confirm Page}</h2>
     * <p>
     * Show Student Edited Confirm Page
     * </p>
     */
    @RequestMapping(value = "/updateStudentConfirm", method = RequestMethod.POST)
    public ModelAndView callUpdateStudentConfirm(@ModelAttribute("student") @Valid StudentForm updateStudentForm,
            BindingResult result) throws ParseException {
        ModelAndView updateConfirmView = new ModelAndView("updateStudentConfirm");
        if (result.hasErrors()) {
            updateConfirmView = new ModelAndView("updateStudent");
            updateConfirmView.addObject("errorMsg", messageSource.getMessage("M_SC_0008", null, null));
            return updateConfirmView;
        }

        if (this.studentService.isRollNoExist(updateStudentForm.getRoll_number())) {
            updateConfirmView = new ModelAndView("updateStudent");
            updateConfirmView.addObject("errorMsg", messageSource.getMessage("M_SC_0018", null, null));
            return updateConfirmView;
        }

        updateConfirmView = new ModelAndView("updateStudentConfirm");
        updateConfirmView.addObject("updateStudentForm", updateStudentForm);
        updateConfirmView.setViewName("updateStudentConfirm");
        return updateConfirmView;
    }

    /**
     * <h2>updateStudent</h2>
     * <p>
     * 
     * </p>
     *
     * @param studentForm
     * @param result
     * @param request
     * @param response
     * @return
     * @throws ParseException
     * @throws FileNotFoundException
     * @throws IOException
     * @return ModelAndView
     */
    @RequestMapping(value = "/editStudent", params = "update", method = RequestMethod.POST)
    public ModelAndView updateStudent(@ModelAttribute("finalConfirmStudentForm") @Valid StudentForm studentForm,
            BindingResult result, HttpServletRequest request, HttpServletResponse response)
            throws ParseException, FileNotFoundException, IOException {

        this.studentService.updateStudent(studentForm);
        ModelAndView updateStudentView = new ModelAndView("redirect:/studentList");
        return updateStudentView;
    }

    /**
     * <h2>cancelupdateStudent</h2>
     * <p>
     * 
     * </p>
     *
     * @param studentForm
     * @param result
     * @return
     * @throws ParseException
     * @return ModelAndView
     */
    @RequestMapping(value = "/editStudent", params = "cancel", method = RequestMethod.POST)
    public ModelAndView cancelupdateStudent(@ModelAttribute("finalConfirmStudentForm") @Valid StudentForm studentForm,
            BindingResult result) throws ParseException {
        ModelAndView updateStudentView = new ModelAndView("updateStudent");
        updateStudentView.addObject("student", studentForm);
        return updateStudentView;
    }
}
