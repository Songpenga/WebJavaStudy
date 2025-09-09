package com.example.test.service;

import com.example.test.dto.PortfolioDto;
import com.example.test.entity.Portfolio;
import com.example.test.repository.PortfolioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PortfolioService {
    
    private final PortfolioRepository portfolioRepository;
    
    public List<PortfolioDto> getAllPortfolios() {
        return portfolioRepository.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    
    public PortfolioDto getPortfolioById(Long id) {
        Portfolio portfolio = portfolioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("포트폴리오를 찾을 수 없습니다."));
        return convertToDto(portfolio);
    }
    
    public PortfolioDto getFirstPortfolio() {
        List<Portfolio> portfolios = portfolioRepository.findAll();
        if (portfolios.isEmpty()) {
            return null;
        }
        return convertToDto(portfolios.get(0));
    }
    
    @Transactional
    public PortfolioDto createPortfolio(PortfolioDto portfolioDto) {
        Portfolio portfolio = convertToEntity(portfolioDto);
        Portfolio savedPortfolio = portfolioRepository.save(portfolio);
        return convertToDto(savedPortfolio);
    }
    
    @Transactional
    public PortfolioDto updatePortfolio(Long id, PortfolioDto portfolioDto) {
        Portfolio portfolio = portfolioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("포트폴리오를 찾을 수 없습니다."));
        
        updatePortfolioFromDto(portfolio, portfolioDto);
        Portfolio savedPortfolio = portfolioRepository.save(portfolio);
        return convertToDto(savedPortfolio);
    }
    
    @Transactional
    public void deletePortfolio(Long id) {
        portfolioRepository.deleteById(id);
    }
    
    private PortfolioDto convertToDto(Portfolio portfolio) {
        return PortfolioDto.builder()
                .id(portfolio.getId())
                .name(portfolio.getName())
                .introduction(portfolio.getIntroduction())
                .aboutMe(portfolio.getAboutMe())
                .email(portfolio.getEmail())
                .github(portfolio.getGithub())
                .linkedin(portfolio.getLinkedin())
                .profileImage(portfolio.getProfileImage())
                .resumeFile(portfolio.getResumeFile())
                .location(portfolio.getLocation())
                .phone(portfolio.getPhone())
                .build();
    }
    
    private Portfolio convertToEntity(PortfolioDto portfolioDto) {
        return Portfolio.builder()
                .id(portfolioDto.getId())
                .name(portfolioDto.getName())
                .introduction(portfolioDto.getIntroduction())
                .aboutMe(portfolioDto.getAboutMe())
                .email(portfolioDto.getEmail())
                .github(portfolioDto.getGithub())
                .linkedin(portfolioDto.getLinkedin())
                .profileImage(portfolioDto.getProfileImage())
                .resumeFile(portfolioDto.getResumeFile())
                .location(portfolioDto.getLocation())
                .phone(portfolioDto.getPhone())
                .build();
    }
    
    private void updatePortfolioFromDto(Portfolio portfolio, PortfolioDto portfolioDto) {
        portfolio.setName(portfolioDto.getName());
        portfolio.setIntroduction(portfolioDto.getIntroduction());
        portfolio.setAboutMe(portfolioDto.getAboutMe());
        portfolio.setEmail(portfolioDto.getEmail());
        portfolio.setGithub(portfolioDto.getGithub());
        portfolio.setLinkedin(portfolioDto.getLinkedin());
        portfolio.setProfileImage(portfolioDto.getProfileImage());
        portfolio.setResumeFile(portfolioDto.getResumeFile());
        portfolio.setLocation(portfolioDto.getLocation());
        portfolio.setPhone(portfolioDto.getPhone());
    }
}



