package com.example.test.config;

import com.example.test.entity.Post;
import com.example.test.entity.Comment;
import com.example.test.entity.Portfolio;
import com.example.test.entity.Project;
import com.example.test.entity.Skill;
import com.example.test.repository.PostRepository;
import com.example.test.repository.CommentRepository;
import com.example.test.repository.PortfolioRepository;
import com.example.test.repository.ProjectRepository;
import com.example.test.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {
    
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;
    private final PortfolioRepository portfolioRepository;
    private final ProjectRepository projectRepository;
    private final SkillRepository skillRepository;
    
    @Override
    public void run(String... args) throws Exception {
        // 기존 데이터가 있으면 추가하지 않음
        if (postRepository.count() > 0) {
            return;
        }
        
        // 샘플 게시글 생성
        Post post1 = createSamplePost("안녕하세요! 게시판에 오신 것을 환영합니다.", 
                                     "이 게시판은 Spring Boot와 Thymeleaf를 사용하여 만들었습니다.\n\n" +
                                     "다양한 기능들을 테스트해보세요:\n" +
                                     "- 게시글 작성, 수정, 삭제\n" +
                                     "- 댓글 작성, 삭제\n" +
                                     "- 게시글 검색\n" +
                                     "- 페이지네이션", 
                                     "관리자");
        
        Post post2 = createSamplePost("Spring Boot 게시판 만들기 튜토리얼", 
                                     "Spring Boot를 사용하여 게시판을 만드는 과정을 정리했습니다.\n\n" +
                                     "주요 기술 스택:\n" +
                                     "- Spring Boot 3.5.4\n" +
                                     "- Spring Data JPA\n" +
                                     "- Thymeleaf\n" +
                                     "- H2 Database\n" +
                                     "- Bootstrap 5", 
                                     "개발자");
        
        Post post3 = createSamplePost("프로젝트 후기", 
                                     "이번 프로젝트를 통해 많은 것을 배웠습니다.\n\n" +
                                     "특히 Spring Boot의 편리함과 Thymeleaf의 강력함을 느낄 수 있었습니다.\n" +
                                     "앞으로 더 많은 기능을 추가해보겠습니다!", 
                                     "학습자");
        
        // 게시글 저장
        postRepository.saveAll(Arrays.asList(post1, post2, post3));
        
        // 샘플 댓글 생성
        createSampleComment(post1, "정말 잘 만들어진 게시판이네요!", "방문자1");
        createSampleComment(post1, "감사합니다! 더 좋은 기능을 추가하겠습니다.", "관리자");
        createSampleComment(post2, "튜토리얼이 정말 도움이 됐어요!", "초보자");
        createSampleComment(post3, "저도 비슷한 프로젝트를 해보고 싶어요.", "동료");
        
        // 포트폴리오 샘플 데이터 생성
        createSamplePortfolio();
        createSampleProjects();
        createSampleSkills();
    }
    
    private Post createSamplePost(String title, String content, String author) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        post.setAuthor(author);
        post.setCreatedAt(LocalDateTime.now().minusDays((long) (Math.random() * 10)));
        post.setViewCount((int) (Math.random() * 100));
        return post;
    }
    
    private void createSampleComment(Post post, String content, String author) {
        Comment comment = new Comment();
        comment.setContent(content);
        comment.setAuthor(author);
        comment.setPost(post);
        comment.setCreatedAt(LocalDateTime.now().minusHours((long) (Math.random() * 24)));
        commentRepository.save(comment);
    }
    
    private void createSamplePortfolio() {
        if (portfolioRepository.count() > 0) {
            return;
        }
        
        Portfolio portfolio = Portfolio.builder()
                .name("김개발")
                .introduction("안녕하세요! 열정적인 풀스택 개발자입니다.")
                .aboutMe("3년간의 개발 경험을 바탕으로 사용자 중심의 웹 애플리케이션을 개발하고 있습니다. " +
                        "새로운 기술을 배우는 것을 좋아하며, 깔끔하고 효율적인 코드 작성을 지향합니다. " +
                        "팀워크를 중시하며, 지속적인 학습과 성장을 추구합니다.")
                .email("kim.dev@example.com")
                .github("https://github.com/kimdeveloper")
                .linkedin("https://linkedin.com/in/kimdeveloper")
                .location("서울, 대한민국")
                .phone("010-1234-5678")
                .build();
        
        portfolioRepository.save(portfolio);
    }
    
    private void createSampleProjects() {
        if (projectRepository.count() > 0) {
            return;
        }
        
        Project project1 = Project.builder()
                .title("포트폴리오 웹사이트")
                .description("Spring Boot와 Thymeleaf를 사용한 개인 포트폴리오 웹사이트입니다. " +
                           "반응형 디자인과 모던한 UI/UX를 적용했습니다.")
                .imageUrl("https://via.placeholder.com/400x300/007bff/ffffff?text=Portfolio")
                .githubUrl("https://github.com/kimdeveloper/portfolio")
                .liveUrl("https://portfolio.example.com")
                .startDate(LocalDate.of(2024, 1, 1))
                .endDate(LocalDate.of(2024, 3, 15))
                .technologies(Arrays.asList("Spring Boot", "Thymeleaf", "Bootstrap", "H2 Database"))
                .category("web")
                .priority(1)
                .build();
        
        Project project2 = Project.builder()
                .title("할일 관리 앱")
                .description("React와 Node.js를 사용한 풀스택 할일 관리 애플리케이션입니다. " +
                           "실시간 업데이트와 사용자 인증 기능을 포함합니다.")
                .imageUrl("https://via.placeholder.com/400x300/28a745/ffffff?text=Todo+App")
                .githubUrl("https://github.com/kimdeveloper/todo-app")
                .liveUrl("https://todo.example.com")
                .startDate(LocalDate.of(2023, 11, 1))
                .endDate(LocalDate.of(2024, 1, 31))
                .technologies(Arrays.asList("React", "Node.js", "MongoDB", "Express"))
                .category("web")
                .priority(2)
                .build();
        
        Project project3 = Project.builder()
                .title("쇼핑몰 API")
                .description("Spring Boot와 JPA를 사용한 RESTful 쇼핑몰 API 서버입니다. " +
                           "상품 관리, 주문 처리, 결제 연동 등의 기능을 제공합니다.")
                .imageUrl("https://via.placeholder.com/400x300/ffc107/000000?text=Shopping+API")
                .githubUrl("https://github.com/kimdeveloper/shopping-api")
                .liveUrl("https://api.shopping.example.com")
                .startDate(LocalDate.of(2023, 8, 1))
                .endDate(LocalDate.of(2023, 12, 31))
                .technologies(Arrays.asList("Spring Boot", "JPA", "MySQL", "Spring Security"))
                .category("api")
                .priority(3)
                .build();
        
        projectRepository.saveAll(Arrays.asList(project1, project2, project3));
    }
    
    private void createSampleSkills() {
        if (skillRepository.count() > 0) {
            return;
        }
        
        Skill skill1 = Skill.builder()
                .name("Java")
                .category("Backend")
                .proficiency(4)
                .icon("fab fa-java")
                .priority(1)
                .build();
        
        Skill skill2 = Skill.builder()
                .name("Spring Boot")
                .category("Backend")
                .proficiency(4)
                .icon("fas fa-leaf")
                .priority(2)
                .build();
        
        Skill skill3 = Skill.builder()
                .name("JavaScript")
                .category("Frontend")
                .proficiency(3)
                .icon("fab fa-js")
                .priority(3)
                .build();
        
        Skill skill4 = Skill.builder()
                .name("React")
                .category("Frontend")
                .proficiency(3)
                .icon("fab fa-react")
                .priority(4)
                .build();
        
        Skill skill5 = Skill.builder()
                .name("MySQL")
                .category("Database")
                .proficiency(3)
                .icon("fas fa-database")
                .priority(5)
                .build();
        
        Skill skill6 = Skill.builder()
                .name("Docker")
                .category("DevOps")
                .proficiency(2)
                .icon("fab fa-docker")
                .priority(6)
                .build();
        
        skillRepository.saveAll(Arrays.asList(skill1, skill2, skill3, skill4, skill5, skill6));
    }
}
