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
public class Board {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    @Column
    private String img;

    @Column
    private String description;

    @Column
    private LocalDateTime createdDate;

    @Column
    private LocalDateTime updatedDate;

    public Board(String img, String description, LocalDateTime createdDate, LocalDateTime updatedDate) {
        this.img = img;
        this.description = description;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

}
