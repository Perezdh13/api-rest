package com.example.Api.Rest.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name= "consult")
public class CVoices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", nullable = false)
    private long id;
    @Column (name = "name", nullable = false)
    private String name;
    @Column(name = "mail",nullable = false)
    private String mail;

}
