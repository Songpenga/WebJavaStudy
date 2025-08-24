package com.example.test.controller;

import com.example.test.dto.CommentDto;
import com.example.test.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentController {
    
    private final CommentService commentService;
    
    // 댓글 작성
    @PostMapping("/{postId}")
    public String create(@PathVariable Long postId,
                        @Valid @ModelAttribute("commentCreate") CommentDto.Create createDto,
                        BindingResult bindingResult) {
        
        if (bindingResult.hasErrors()) {
            return "redirect:/posts/" + postId + "?error=true";
        }
        
        commentService.createComment(postId, createDto);
        return "redirect:/posts/" + postId;
    }
    
    // 댓글 삭제
    @PostMapping("/{commentId}/delete")
    public String delete(@PathVariable Long commentId,
                        @RequestParam Long postId) {
        
        commentService.deleteComment(commentId);
        return "redirect:/posts/" + postId;
    }
}
