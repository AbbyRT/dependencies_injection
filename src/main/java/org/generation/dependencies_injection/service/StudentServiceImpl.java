package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final List<Student> studentList = new ArrayList<>();

    //inyeccion de dependencia
    Student student;
    //constructor
    public StudentServiceImpl(){
        addStudents();
        //para llamar otro metodo estando en la misma clase, no hay que piner el
        //nombre de la clase. metodo, solo el nombre del metodo
    }
    private void addStudents(){
        studentList.add(new Student("1", 1, "Abby", "Romero", 1));
        studentList.add(new Student("2", 1, "Estu", "PB", 1));
        studentList.add(new Student("3", 1, "Nan", "YM", 1));
    }

    @Override
    public void add(Student student) {
        studentList.add(student);

    }

    @Override
    public void delete(Student student) {
        studentList.remove(student);

    }

    @Override
    public List<Student> all() {
        return studentList;
    }

    @Override
    public Student findById(String id) {

        //uso de wrapper, lo convierte a numero
        return studentList.get(Integer.parseInt(id));

    }
}
