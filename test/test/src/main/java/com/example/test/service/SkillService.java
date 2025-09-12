package com.example.test.service;

import com.example.test.dto.SkillDto;
import com.example.test.entity.Skill;
import com.example.test.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SkillService {
    
    private final SkillRepository skillRepository;
    
    public List<SkillDto> getAllSkills() {
        return skillRepository.findAllByOrderByPriorityAsc().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    
    public List<SkillDto> getSkillsByCategory(String category) {
        return skillRepository.findByCategoryOrderByPriorityAsc(category).stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    
    public List<String> getAllCategories() {
        return skillRepository.findAllCategories();
    }
    
    public SkillDto getSkillById(Long id) {
        Skill skill = skillRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("기술을 찾을 수 없습니다."));
        return convertToDto(skill);
    }
    
    @Transactional
    public SkillDto createSkill(SkillDto skillDto) {
        Skill skill = convertToEntity(skillDto);
        Skill savedSkill = skillRepository.save(skill);
        return convertToDto(savedSkill);
    }
    
    @Transactional
    public SkillDto updateSkill(Long id, SkillDto skillDto) {
        Skill skill = skillRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("기술을 찾을 수 없습니다."));
        
        updateSkillFromDto(skill, skillDto);
        Skill savedSkill = skillRepository.save(skill);
        return convertToDto(savedSkill);
    }
    
    @Transactional
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }
    
    private SkillDto convertToDto(Skill skill) {
        return SkillDto.builder()
                .id(skill.getId())
                .name(skill.getName())
                .category(skill.getCategory())
                .proficiency(skill.getProficiency())
                .icon(skill.getIcon())
                .priority(skill.getPriority())
                .build();
    }
    
    private Skill convertToEntity(SkillDto skillDto) {
        return Skill.builder()
                .id(skillDto.getId())
                .name(skillDto.getName())
                .category(skillDto.getCategory())
                .proficiency(skillDto.getProficiency())
                .icon(skillDto.getIcon())
                .priority(skillDto.getPriority())
                .build();
    }
    
    private void updateSkillFromDto(Skill skill, SkillDto skillDto) {
        skill.setName(skillDto.getName());
        skill.setCategory(skillDto.getCategory());
        skill.setProficiency(skillDto.getProficiency());
        skill.setIcon(skillDto.getIcon());
        skill.setPriority(skillDto.getPriority());
    }
}



