package com.example.demo.controller;


import com.example.demo.Repository.SubjectRepository;
import com.example.demo.dto.StudentDto;
import com.example.demo.dto.SubjectDto;
import com.example.demo.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SubjectController {

    private final SubjectRepository subjectRepository;
    private final SubjectService subjectService;


    @PostMapping("/api/subjects")
    public void setSubjectInfo(@RequestBody SubjectDto subjectDto){
       subjectService.setSubjectInfo(subjectDto);
    }

}
