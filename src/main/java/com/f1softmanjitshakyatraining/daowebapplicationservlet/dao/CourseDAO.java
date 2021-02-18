/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1softmanjitshakyatraining.daowebapplicationservlet.dao;

import com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Course;
import java.util.List;

/**
 *
 * @author aakashthakur-work
 */
public interface CourseDAO {

    Course fetchCourseById(int courseId);

    List<Course> fetchAllCourses();
}
