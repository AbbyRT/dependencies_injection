package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImplMap implements StudentService{
    //private final List<Student> studentList = new ArrayList<>();
    //segun el ejercicio tiene que ser tipo HashMap
    private final Map<String, Student> studentMap = new HashMap<String, Student>();
    @Override
    public void add(Student student) {
        studentMap.put(student.getIdStudent(), student);
    }

    @Override
    public void delete(Student student) {
        studentMap.remove(student.getIdStudent(), student);

    }

    @Override
    public Map<String, Student> all() {
        return studentMap;
    }

    @Override
    public Student findById(String id) {
        return studentMap.get(id);
    }

}
