package org.generation.dependencies_injection.controller;

import org.generation.dependencies_injection.model.Student;
import org.generation.dependencies_injection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

    private final StudentService studentService;

    public StudentController( @Autowired StudentService studentService )
    {

        this.studentService = studentService;
        Student student1 = new Student("1", 1, "Jake", "Perro", 1);
        studentService.add(student1);
        Student student2 = new Student("2", 1, "Finn", "Humano", 1);
        studentService.add(student2);
        Student student3 = new Student("3", 1, "Marceline", "Vampira", 1);
        studentService.add(student3);


    }

    @GetMapping( "/student/{id}" )
    Student findById( @PathVariable( "id" ) String id )
    {
      //  int studentId = Integer.parseInt(id) - 1;
       // return studentService.findById( String.valueOf(studentId) ); //esto funciona para array list
        return studentService.findById( id );
    }

}
