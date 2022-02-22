package com.example.demo.service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.dto.StudentDto;
import com.example.demo.models.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final StudentRepository studentRepository;



    @Transactional
    public void setStudentInfo(StudentDto studentDto){
        Student student = new Student(studentDto);
//        student.setName(studentDto.getName());
//        student.setAge(student.getAge());
//        student.setSubject(student.getSubject());
        studentRepository.save(student);


    }


    @Transactional
    public String update(Long id, StudentDto studentDto){
        Student student = studentRepository.findById(id).orElseThrow(
                () -> new NullPointerException("해당 아이디가 존재하지 않습니다")
        );
        student.update(studentDto);

        return "success";
    }

//    @Transactional
//    public List<String> deleteStudent(List<String> id){
//
//        studentRepository.deleteById(id);
//        return id;
//    }


    @Transactional
    public Long deleteStudent(Long id){
        studentRepository.deleteById(id);
        return id;
    }



}
