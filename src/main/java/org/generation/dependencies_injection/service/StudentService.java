package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;

import java.util.Map;

public interface StudentService
{
    void add( Student student );

    void delete( Student student );

    Map<String, Student> all();

    Student findById( String id );

}
