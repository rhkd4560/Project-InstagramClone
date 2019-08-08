package com.jaehong.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table
public class User {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @Column
    private String id;

    @Column
    private String pw;

    @Column
    private String email;

    @Column
    private LocalDateTime createdDate;

    public User(String id, String pw, String email, LocalDateTime createdDate) {
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.createdDate = createdDate;
    }

}
