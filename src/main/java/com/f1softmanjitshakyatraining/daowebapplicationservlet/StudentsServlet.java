/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softmanjitshakyatraining.daowebapplicationservlet;

import com.f1softmanjitshakyatraining.daowebapplicationservlet.dao.impl.StudentDAODatabaseImpl;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.service.StudentService;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.service.impl.StudentServiceImpl;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aakashthakur-work
 */
public class StudentsServlet extends HttpServlet {
    
    StudentService studentServiceDatabase;
        

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentsList = new ArrayList<>();
        studentServiceDatabase = new StudentServiceImpl(new StudentDAODatabaseImpl());
        studentsList = studentServiceDatabase.getAllStudents();
        System.out.println(studentsList);
        request.setAttribute("studentsData", studentsList);
        request
                .getRequestDispatcher("WEB-INF/views/studentsData.jsp")
                .forward(request, response);

        System.out.println("The code execution reached the end of the doGet() method of Main Servlet.");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
