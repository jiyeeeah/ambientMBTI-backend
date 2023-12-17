package com.jiye.ambientMBTIbackend.home.controller;

import com.jiye.ambientMBTIbackend.member.dto.MemberDTO;
import com.jiye.ambientMBTIbackend.question.dto.QuestionDTO;
import com.jiye.ambientMBTIbackend.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final QuestionService questionService;

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/main")
    public String mainPage(Model model) {
        QuestionDTO questionDTO = questionService.findByDate(LocalDate.now());
        model.addAttribute("question", questionDTO);
        return "home/main";
    }
}