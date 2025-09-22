package com.example.test.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

public class PostDto {
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Create {
        @NotBlank(message = "제목을 입력해주세요")
        @Size(max = 200, message = "제목은 200자 이하여야 합니다")
        private String title;
        
        @NotBlank(message = "내용을 입력해주세요")
        private String content;
        
        @NotBlank(message = "작성자를 입력해주세요")
        @Size(max = 50, message = "작성자는 50자 이하여야 합니다")
        private String author;
    }
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Update {
        @NotBlank(message = "제목을 입력해주세요")
        @Size(max = 200, message = "제목은 200자 이하여야 합니다")
        private String title;
        
        @NotBlank(message = "내용을 입력해주세요")
        private String content;
    }
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Response {
        private Long id;
        private String title;
        private String content;
        private String author;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Integer viewCount;
        private List<CommentDto.Response> comments;
    }
    
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ListResponse {
        private Long id;
        private String title;
        private String author;
        private LocalDateTime createdAt;
        private Integer viewCount;
        private Long commentCount;
    }
}

