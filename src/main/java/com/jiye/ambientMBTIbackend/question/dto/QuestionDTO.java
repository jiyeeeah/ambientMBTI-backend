package com.jiye.ambientMBTIbackend.question.dto;

import com.jiye.ambientMBTIbackend.question.entity.QuestionEntity;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDTO {
    private Long id;
    private String questionContent;
    private LocalDateTime questionAskTime;

    public static QuestionDTO toQuestionDTO(QuestionEntity questionEntity) {
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setId(questionEntity.getId());
        questionDTO.setQuestionContent(questionEntity.getQuestionContent());
        questionDTO.setQuestionAskTime(questionEntity.getQuestionAskTime());
        return questionDTO;
    }
}