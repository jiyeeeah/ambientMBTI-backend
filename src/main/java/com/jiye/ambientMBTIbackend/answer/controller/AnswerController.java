package com.jiye.ambientMBTIbackend.answer.controller;

import com.jiye.ambientMBTIbackend.answer.dto.AnswerDTO;
import com.jiye.ambientMBTIbackend.answer.service.AnswerService;
import com.jiye.ambientMBTIbackend.question.dto.QuestionDTO;
import com.jiye.ambientMBTIbackend.question.service.QuestionService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequiredArgsConstructor
@RequestMapping("/answer")
public class AnswerController {
    private final AnswerService answerService;
    private final QuestionService questionService;

    @GetMapping("/write")
    public String saveAnswer(Model model, HttpSession session) {
        QuestionDTO questionDTO = questionService.findByDate(LocalDate.now());
        Object memberId = session.getAttribute("loginId");
        model.addAttribute("question", questionDTO);
        model.addAttribute("memberId", memberId);
        return "answer/write";
    }

    @PostMapping("/write")
    public String save(@ModelAttribute AnswerDTO answerDTO) {
        answerService.save(answerDTO);
        return "redirect:/main";
    }
}
