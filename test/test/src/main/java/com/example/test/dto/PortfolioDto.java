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
public class PortfolioDto {
    
    private Long id;
    private String name;
    private String introduction;
    private String aboutMe;
    private String email;
    private String github;
    private String linkedin;
    private String profileImage;
    private String resumeFile;
    private String location;
    private String phone;
}



