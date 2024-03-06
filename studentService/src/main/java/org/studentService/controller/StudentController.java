package org.studentService.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.studentService.entity.Student;
import org.studentService.service.StudentService;

@CrossOrigin("*")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping("getStudentById/{sid}")
    public ResponseEntity<?> fetchStudentById(@PathVariable Integer sid){
        return studentService.fetchStudentById(sid);
    }
    @GetMapping("getStudents")
    public ResponseEntity<?> fetchStudents(){
        return studentService.fetchStudents();
    }
        @PostMapping("/createStudent")
    public ResponseEntity<?> createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

}
