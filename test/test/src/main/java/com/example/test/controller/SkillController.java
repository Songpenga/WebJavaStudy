package com.example.test.controller;

import com.example.test.dto.SkillDto;
import com.example.test.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/skills")
@RequiredArgsConstructor
public class SkillController {
    
    private final SkillService skillService;
    
    @GetMapping
    public String skillList(Model model) {
        List<SkillDto> skills = skillService.getAllSkills();
        List<String> categories = skillService.getAllCategories();
        
        model.addAttribute("skills", skills);
        model.addAttribute("categories", categories);
        return "portfolio/skills";
    }
    
    @GetMapping("/new")
    public String newSkillForm(Model model) {
        model.addAttribute("skill", new SkillDto());
        return "portfolio/skill-form";
    }
    
    @PostMapping("/new")
    public String createSkill(@ModelAttribute SkillDto skillDto) {
        skillService.createSkill(skillDto);
        return "redirect:/skills";
    }
    
    @GetMapping("/{id}/edit")
    public String editSkillForm(@PathVariable Long id, Model model) {
        SkillDto skill = skillService.getSkillById(id);
        model.addAttribute("skill", skill);
        return "portfolio/skill-form";
    }
    
    @PostMapping("/{id}/edit")
    public String updateSkill(@PathVariable Long id, @ModelAttribute SkillDto skillDto) {
        skillService.updateSkill(id, skillDto);
        return "redirect:/skills";
    }
    
    @PostMapping("/{id}/delete")
    public String deleteSkill(@PathVariable Long id) {
        skillService.deleteSkill(id);
        return "redirect:/skills";
    }
}



