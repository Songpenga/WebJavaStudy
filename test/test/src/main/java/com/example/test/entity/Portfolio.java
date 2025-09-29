package com.example.test.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "portfolio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Portfolio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(columnDefinition = "TEXT")
    private String introduction;
    
    @Column(columnDefinition = "TEXT")
    private String aboutMe;
    
    @Column
    private String email;
    
    @Column
    private String github;
    
    @Column
    private String linkedin;
    
    @Column
    private String profileImage;
    
    @Column
    private String resumeFile;
    
    @Column
    private String location;
    
    @Column
    private String phone;
}



