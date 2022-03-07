package com.example.basiccrud.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter // get 함수를 일괄적으로 만들어줍니다.
@NoArgsConstructor // 기본 생성자를 만들어줍니다.
@Entity // DB 테이블 역할을 합니다.
public class User extends TimeStamped{

    // ID가 자동으로 생성 및 증가합니다.
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // 유저이름
    @Column(nullable = false)
    private String username;

    // 패스워드
    @Column(nullable = false)
    private String password;

    // 유저 역할
    @Column(nullable = true)
    private boolean role;



    public User(String username, String password) {

        this.username = username;
        this.password = password;
    }
    public User(String username, String password, boolean role){
        this.username = username;
        this.password = password;
        this.role = role;
    }

}
