package com.jiye.ambientMBTIbackend.question.service;

import com.jiye.ambientMBTIbackend.question.dto.QuestionDTO;
import com.jiye.ambientMBTIbackend.question.entity.QuestionEntity;
import com.jiye.ambientMBTIbackend.question.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public void save(QuestionDTO questionDTO) {
        QuestionEntity questionEntity = QuestionEntity.toSaveEntity(questionDTO);
        questionRepository.save(questionEntity);
    }

    public String dateCheck(LocalDate questionDate) {
        Optional<QuestionEntity> optionalQuestionEntity = questionRepository.findByQuestionDate(questionDate);
        if(optionalQuestionEntity.isPresent()) {
            // 조회결과가 있다. -> 사용할 수 없다.
            return null;
        } else {
            // 조회결과가 없다 -> 사용할 수 있다.
            return "ok";
        }
    }

    public List<QuestionDTO> findAll() {
        List<QuestionEntity> questionEntityList = questionRepository.findAll();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for(QuestionEntity questionEntity: questionEntityList) {
            questionDTOList.add(QuestionDTO.toQuestionDTO(questionEntity));
        }
        return questionDTOList;
    }

    public QuestionDTO findByDate(LocalDate now) {
        Optional<QuestionEntity> optionalQuestionEntity = questionRepository.findByQuestionDate(now);
        if (optionalQuestionEntity.isPresent()) {
            QuestionEntity questionEntity = optionalQuestionEntity.get();
            return QuestionDTO.toQuestionDTO(questionEntity);
        } else {
            return null;
        }
    }
}
