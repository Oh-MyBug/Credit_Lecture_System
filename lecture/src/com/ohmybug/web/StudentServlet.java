package com.ohmybug.web;

import com.ohmybug.pojo.Grade;
import com.ohmybug.pojo.Lecture;
import com.ohmybug.pojo.Student;
import com.ohmybug.pojo.T_Class;
import com.ohmybug.service.GradeService;
import com.ohmybug.service.StudentService;
import com.ohmybug.service.T_ClassService;
import com.ohmybug.service.impl.GradeServiceImpl;
import com.ohmybug.service.impl.StudentServiceImpl;
import com.ohmybug.service.impl.T_ClassServiceImpl;
import com.ohmybug.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * ClassName:   StudentServlet
 * Data:        2020/9/1
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class StudentServlet extends BaseServlet {
    private final StudentService studentService = new StudentServiceImpl();
    private final GradeService gradeService = new GradeServiceImpl();
    private final T_ClassService t_classService = new T_ClassServiceImpl();

    protected void getSelectorList(HttpServletRequest req, HttpServletResponse resp) throws ServletException,
            IOException {
        List<Grade> grades = gradeService.queryGrades();
        List<T_Class> t_classes = t_classService.queryT_Classs();
        req.setAttribute("grades", grades);
        req.setAttribute("t_classes", t_classes);
        req.getRequestDispatcher("/pages/admin/student_edit.jsp").forward(req, resp);
    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = WebUtils.copyParamToBean(req.getParameterMap(), new Student());
        int addStudent = studentService.addStudent(student);
        if (addStudent == -1){
            student.setId(null);
            req.setAttribute("student", student);
            req.getRequestDispatcher("studentServlet?action=getSelectorList").forward(req, resp);
        }else {
            resp.sendRedirect(req.getContextPath() + "/admin/studentServlet?action=list&page=student");
        }
    }

    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = WebUtils.copyParamToBean(req.getParameterMap(), new Student());
        studentService.updateStudent(student);
        resp.sendRedirect(req.getContextPath() + "/admin/studentServlet?action=list&page=student");
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        studentService.deleteStudentById(id);
        resp.sendRedirect(req.getContextPath() + "/admin/studentServlet?action=list&page=student");
    }

    protected void getStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = WebUtils.parseInt(req.getParameter("id"), 0);
        Student student = studentService.queryStudentById(id);
        req.setAttribute("student", student);
        getSelectorList(req, resp);
    }

    protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = studentService.queryStudents();
        req.setAttribute("students", students);
        req.getRequestDispatcher("/pages/admin/student_manage.jsp").forward(req, resp);
    }
}
