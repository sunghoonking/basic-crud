package com.example.demo.controller;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.dto.StudentDto;
import com.example.demo.models.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class StudentController {

    private  final StudentRepository studentRepository;
    private  final StudentService studentService;


    @PostMapping("/api/students")
    public void setStudentInfo(@RequestBody StudentDto studentDto){
        studentService.setStudentInfo(studentDto);


    }
    @GetMapping("/api/students")
    public List<Student> getStudents(){
        return studentRepository.findAll();

    }

    @PutMapping("/api/students/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody StudentDto studentDto){
        return studentService.update(id,studentDto);
    }

    @DeleteMapping("/api/students/{id}")
    public Long deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);


    }




}
