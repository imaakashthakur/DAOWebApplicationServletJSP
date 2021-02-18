/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softmanjitshakyatraining.daowebapplicationservlet.service.impl;

import com.f1softmanjitshakyatraining.daowebapplicationservlet.dao.CourseDAO;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Course;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.service.CourseService;
import java.util.List;

/**
 *
 * @author aakashthakur-work
 */
public class CourseServiceImpl implements CourseService {

    private final CourseDAO courseDAO;

    public CourseServiceImpl(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public Course getCourseById(int courseId) {
        return courseDAO.fetchCourseById(courseId);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDAO.fetchAllCourses();
    }

}
