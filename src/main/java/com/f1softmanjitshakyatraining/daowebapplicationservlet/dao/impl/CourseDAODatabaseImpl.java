/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softmanjitshakyatraining.daowebapplicationservlet.dao.impl;

import com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Course;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.dao.CourseDAO;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.jdbc.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aakashthakur-work
 */
public class CourseDAODatabaseImpl implements CourseDAO {

    Connection con = JDBCConnection.getConnection();

    @Override
    public Course fetchCourseById(int courseId) {

        try {

            PreparedStatement pstmt;
            String query = "SELECT * FROM Courses WHERE CourseId = ?";

            ResultSet rs;

            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, courseId);

            rs = pstmt.executeQuery();
            Course course = new Course();

            while (rs.next()) {

                String courseName = rs.getString("Name");
                course.setCourseName(courseName);
                course.setCourseId(courseId);
            }
            System.out.println("Course: " + course);
        } catch (SQLException ex) {
            System.out.println("Exception Caught: " + ex);
        }
        return null;

    }

    @Override
    public List<Course> fetchAllCourses() {
        List<Course> coursesList = new ArrayList<>();

        try {
            Statement stmt;
            String query = "SELECT * FROM Courses";

            ResultSet rs;
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                Course course = new Course();
                String courseName = rs.getString("Name");
                int courseId = rs.getInt("CourseId");
                course.setCourseId(courseId);
                course.setCourseName(courseName);
                coursesList.add(course);
            }
        } catch (SQLException ex) {
            System.out.println("Exception is caught: " + ex);
        }
        return coursesList;
    }

}
