package com.example.demo.models;


import com.example.demo.dto.SubjectDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Entity

public class Subject {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String subject;

    @ManyToOne
    @JoinColumn(name = "studentId", nullable = true)
    private Student student;


    public Subject(SubjectDto subjectDto){

        this.subject = subjectDto.getSubject();
    }



}
