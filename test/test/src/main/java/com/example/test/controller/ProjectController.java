package com.example.test.controller;

import com.example.test.dto.ProjectDto;
import com.example.test.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {
    
    private final ProjectService projectService;
    
    @GetMapping
    public String projectList(Model model) {
        List<ProjectDto> projects = projectService.getAllProjects();
        List<String> categories = projectService.getAllCategories();
        
        model.addAttribute("projects", projects);
        model.addAttribute("categories", categories);
        return "portfolio/projects";
    }
    
    @GetMapping("/{id}")
    public String projectDetail(@PathVariable Long id, Model model) {
        ProjectDto project = projectService.getProjectById(id);
        model.addAttribute("project", project);
        return "portfolio/project-detail";
    }
    
    @GetMapping("/new")
    public String newProjectForm(Model model) {
        model.addAttribute("project", new ProjectDto());
        return "portfolio/project-form";
    }
    
    @PostMapping("/new")
    public String createProject(@ModelAttribute ProjectDto projectDto) {
        projectService.createProject(projectDto);
        return "redirect:/projects";
    }
    
    @GetMapping("/{id}/edit")
    public String editProjectForm(@PathVariable Long id, Model model) {
        ProjectDto project = projectService.getProjectById(id);
        model.addAttribute("project", project);
        return "portfolio/project-form";
    }
    
    @PostMapping("/{id}/edit")
    public String updateProject(@PathVariable Long id, @ModelAttribute ProjectDto projectDto) {
        projectService.updateProject(id, projectDto);
        return "redirect:/projects";
    }
    
    @PostMapping("/{id}/delete")
    public String deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
        return "redirect:/projects";
    }
}



