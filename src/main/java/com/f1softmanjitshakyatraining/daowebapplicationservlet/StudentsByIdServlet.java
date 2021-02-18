/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softmanjitshakyatraining.daowebapplicationservlet;

import com.f1softmanjitshakyatraining.daowebapplicationservlet.dao.impl.StudentDAODatabaseImpl;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Student;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.service.StudentService;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.service.impl.StudentServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aakashthakur-work
 */
public class StudentsByIdServlet extends HttpServlet {

    StudentService studentServiceDatabase;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student = new Student();
        studentServiceDatabase = new StudentServiceImpl(new StudentDAODatabaseImpl());

        int studentId = Integer.parseInt(request.getParameter("studentId"));

        student = studentServiceDatabase.getStudentById(studentId);
        System.out.println(student);
        request.setAttribute("studentData", student);
        request
                .getRequestDispatcher("WEB-INF/views/studentById.jsp")
                .forward(request, response);

        System.out.println("The code execution has reached the end of the doPost() method of Students Servlet.");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
