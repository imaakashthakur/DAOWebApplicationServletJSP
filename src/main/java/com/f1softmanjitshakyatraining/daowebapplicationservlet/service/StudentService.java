/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//THIS IS WAITER IN MVC MODEL
package com.f1softmanjitshakyatraining.daowebapplicationservlet.service;

import java.util.List;
import com.f1softmanjitshakyatraining.daowebapplicationservlet.model.Student;

/**
 *
 * @author aakashthakur-work
 */
public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void updateStudentById(int id, String name, String address, String contact, int courseId);

    void insertStudent(String name, String address, String contact, int courseId);
}
