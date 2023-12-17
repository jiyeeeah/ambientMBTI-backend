package com.jiye.ambientMBTIbackend.question.controller;

import com.jiye.ambientMBTIbackend.question.dto.QuestionDTO;
import com.jiye.ambientMBTIbackend.question.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/save")
    public String saveQuestionForm() {
        return "question/save";
    }

    @PostMapping("save")
    public String saveQuestion(@ModelAttribute QuestionDTO questionDTO) {
        questionService.save(questionDTO);
        return "home/index"; // TODO : 홈화면 제대로 구현하면 redirect로 바꿔주기
    }

    @PostMapping("/date-check")
    public @ResponseBody String dateCheck(@RequestParam("questionDate") LocalDate questionDate) {
        return questionService.dateCheck(questionDate);
    }

    @GetMapping("/list")
    public String findAll(Model model) {
        List<QuestionDTO> questionDTOList = questionService.findAll();
        model.addAttribute("questionList", questionDTOList);
        return "question/list";
    }

}
