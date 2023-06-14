/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Student;

/**
 *
 * @author nirod
 */
public class StudentService {

    public Student saveStudentDetails(int id,
            String name,
            String contact) {

        // Open DB Connection
        
        // Data should insert to DB
        
        // Close DB Connection
        
        // retuen Student object
        
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setContact(contact);
        
        return student;
        
    }
}
