package com.jiye.ambientMBTIbackend.question.service;

import com.jiye.ambientMBTIbackend.question.dto.QuestionDTO;
import com.jiye.ambientMBTIbackend.question.entity.QuestionEntity;
import com.jiye.ambientMBTIbackend.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public void save(QuestionDTO questionDTO) {
        QuestionEntity questionEntity = QuestionEntity.toSaveEntity(questionDTO);
        questionRepository.save(questionEntity);
    }
}
