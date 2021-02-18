/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softmanjitshakyatraining.daowebapplicationservlet;

import com.f1softmanjitshakyatraining.daowebapplicationservlet.dao.impl.CourseDAODatabaseImpl;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Course;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.service.CourseService;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.service.impl.CourseServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;

/**
 *
 * @author aakashthakur-work
 */
public class CoursesServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Course> coursesList = new ArrayList<>();
        CourseService courseServiceDatabase;
        courseServiceDatabase = new CourseServiceImpl(new CourseDAODatabaseImpl());
        coursesList = courseServiceDatabase.getAllCourses();
        System.out.println(coursesList);
        
        request.setAttribute("coursesData", coursesList);
        
        request.getRequestDispatcher("WEB-INF/views/coursesData.jsp")
                .forward(request, response);
        
        System.out.println("The code execution has reached the doget method of CoursesServlet!");
        
    }
}
