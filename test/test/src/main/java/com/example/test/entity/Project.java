package com.example.test.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "project")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Project {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    @Column
    private String imageUrl;
    
    @Column
    private String githubUrl;
    
    @Column
    private String liveUrl;
    
    @Column
    private LocalDate startDate;
    
    @Column
    private LocalDate endDate;
    
    @ElementCollection
    @CollectionTable(name = "project_technologies", joinColumns = @JoinColumn(name = "project_id"))
    @Column(name = "technology")
    private List<String> technologies;
    
    @Column
    private String category; // 웹, 모바일, AI 등
    
    @Column
    private Integer priority; // 우선순위 (정렬용)
}



