package com.backend.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name",nullable = true)
    private String name;

    @Column(name="profile_description",nullable = true , columnDefinition =  "TEXT")
    private String profileDescription;

    @Column(name="company_website",nullable = true)
    private String companyWebsite;

    @Lob
    @Column(name="avatar" ,nullable = true , columnDefinition = "TEXT")
    private byte[] avatar;

    @OneToOne(mappedBy = "company")
    private User user;
}
