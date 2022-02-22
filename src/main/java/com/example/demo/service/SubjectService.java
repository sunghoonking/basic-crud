package com.example.demo.service;


import com.example.demo.Repository.SubjectRepository;
import com.example.demo.dto.SubjectDto;
import com.example.demo.models.Student;
import com.example.demo.models.Subject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class SubjectService {

    private final SubjectRepository subjectRepository;


    @Transactional
    public void setSubjectInfo(SubjectDto subjectDto){
        Subject subject = new Subject(subjectDto);
        subjectRepository.save(subject);
    }
}
