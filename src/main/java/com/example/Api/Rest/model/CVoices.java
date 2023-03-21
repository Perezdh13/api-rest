package com.example.Api.Rest.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name= "consult")
public class CVoices {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    private long id;
    @Column (name = "name", nullable = false)
    private String name;
    @Column(name = "mail",nullable = false)
    private String mail;

}
