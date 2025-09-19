package com.example.test.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

public class CommentDto {
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Create {
        @NotBlank(message = "댓글 내용을 입력해주세요")
        private String content;
        
        @NotBlank(message = "작성자를 입력해주세요")
        @Size(max = 50, message = "작성자는 50자 이하여야 합니다")
        private String author;
    }
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private Long id;
        private String content;
        private String author;
        private LocalDateTime createdAt;
    }
}

