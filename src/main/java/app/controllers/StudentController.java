package app.controllers;

import app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import app.repositories.StudentRepository;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    public StudentRepository studentRepository;

    @RequestMapping(value = "/all", method =  RequestMethod.GET)
    public List<Student> getAllStudents(){
        return studentRepository.findAll();

    }

    @PostMapping(value = "/create")
    public String createStudent(@RequestBody Student student){
        Student insertStudent = studentRepository.insert(student);
        return "Student Created.." + insertStudent.getName();
    }

    @DeleteMapping(value="/delete/{id}")
    public void deleteStudent(@PathVariable long id){
        studentRepository.deleteById(id);
    }

}