package com.example.test.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDto {
    
    private Long id;
    private String title;
    private String description;
    private String imageUrl;
    private String githubUrl;
    private String liveUrl;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<String> technologies;
    private String category;
    private Integer priority;
}



