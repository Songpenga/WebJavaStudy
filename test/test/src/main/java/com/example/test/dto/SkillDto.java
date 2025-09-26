package com.example.test.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillDto {
    
    private Long id;
    private String name;
    private String category;
    private Integer proficiency;
    private String icon;
    private Integer priority;
}



