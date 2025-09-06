package com.example.test.controller;

import com.example.test.dto.PortfolioDto;
import com.example.test.service.PortfolioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/portfolio")
@RequiredArgsConstructor
public class PortfolioController {
    
    private final PortfolioService portfolioService;
    
    @GetMapping
    public String portfolioMain(Model model) {
        PortfolioDto portfolio = portfolioService.getFirstPortfolio();
        if (portfolio != null) {
            model.addAttribute("portfolio", portfolio);
        }
        return "portfolio/main";
    }
    
    @GetMapping("/edit")
    public String editPortfolio(Model model) {
        PortfolioDto portfolio = portfolioService.getFirstPortfolio();
        if (portfolio != null) {
            model.addAttribute("portfolio", portfolio);
        }
        return "portfolio/edit";
    }
    
    @PostMapping("/edit")
    public String updatePortfolio(@ModelAttribute PortfolioDto portfolioDto) {
        PortfolioDto existingPortfolio = portfolioService.getFirstPortfolio();
        if (existingPortfolio != null) {
            portfolioService.updatePortfolio(existingPortfolio.getId(), portfolioDto);
        } else {
            portfolioService.createPortfolio(portfolioDto);
        }
        return "redirect:/portfolio";
    }
}



