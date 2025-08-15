package com.example.test.service;

import com.example.test.dto.PostDto;
import com.example.test.entity.Post;
import com.example.test.entity.Comment;
import com.example.test.repository.PostRepository;
import com.example.test.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
    
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    
    // 게시글 목록 조회
    public Page<PostDto.ListResponse> getPosts(int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("createdAt").descending());
        Page<Post> posts = postRepository.findAllByOrderByCreatedAtDesc(pageable);
        
        return posts.map(this::convertToListResponse);
    }
    
    // 게시글 검색
    public Page<PostDto.ListResponse> searchPosts(String keyword, int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("createdAt").descending());
        Page<Post> posts = postRepository.findByTitleContainingOrContentContainingOrderByCreatedAtDesc(keyword, pageable);
        
        return posts.map(this::convertToListResponse);
    }
    
    // 게시글 상세 조회
    @Transactional
    public PostDto.Response getPost(Long id) {
        Post post = postRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
        
        post.incrementViewCount();
        List<Comment> comments = commentRepository.findByPostIdOrderByCreatedAtAsc(id);
        
        return convertToResponse(post, comments);
    }
    
    // 게시글 생성
    @Transactional
    public Long createPost(PostDto.Create createDto) {
        Post post = new Post();
        post.setTitle(createDto.getTitle());
        post.setContent(createDto.getContent());
        post.setAuthor(createDto.getAuthor());
        
        Post savedPost = postRepository.save(post);
        return savedPost.getId();
    }
    
    // 게시글 수정
    @Transactional
    public void updatePost(Long id, PostDto.Update updateDto) {
        Post post = postRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("게시글을 찾을 수 없습니다."));
        
        post.setTitle(updateDto.getTitle());
        post.setContent(updateDto.getContent());
    }
    
    // 게시글 삭제
    @Transactional
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
    
    // DTO 변환 메서드들
    private PostDto.ListResponse convertToListResponse(Post post) {
        PostDto.ListResponse response = new PostDto.ListResponse();
        response.setId(post.getId());
        response.setTitle(post.getTitle());
        response.setAuthor(post.getAuthor());
        response.setCreatedAt(post.getCreatedAt());
        response.setViewCount(post.getViewCount());
        response.setCommentCount((long) post.getComments().size());
        return response;
    }
    
    private PostDto.Response convertToResponse(Post post, List<Comment> comments) {
        PostDto.Response response = new PostDto.Response();
        response.setId(post.getId());
        response.setTitle(post.getTitle());
        response.setContent(post.getContent());
        response.setAuthor(post.getAuthor());
        response.setCreatedAt(post.getCreatedAt());
        response.setUpdatedAt(post.getUpdatedAt());
        response.setViewCount(post.getViewCount());
        
        List<CommentDto.Response> commentResponses = comments.stream()
            .map(this::convertToCommentResponse)
            .collect(Collectors.toList());
        response.setComments(commentResponses);
        
        return response;
    }
    
    private CommentDto.Response convertToCommentResponse(Comment comment) {
        CommentDto.Response response = new CommentDto.Response();
        response.setId(comment.getId());
        response.setContent(comment.getContent());
        response.setAuthor(comment.getAuthor());
        response.setCreatedAt(comment.getCreatedAt());
        return response;
    }
}
