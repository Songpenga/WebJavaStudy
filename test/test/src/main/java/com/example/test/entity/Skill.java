package com.example.test.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Entity
@Table(name = "skill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column
    private String category; // Frontend, Backend, Database, DevOps 등
    
    @Column
    private Integer proficiency; // 숙련도 (1-5)
    
    @Column
    private String icon; // 아이콘 클래스명 또는 이미지 URL
    
    @Column
    private Integer priority; // 정렬 우선순위
}



