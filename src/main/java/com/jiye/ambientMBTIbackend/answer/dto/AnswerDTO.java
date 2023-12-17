package com.jiye.ambientMBTIbackend.answer.dto;

import com.jiye.ambientMBTIbackend.answer.entity.AnswerEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AnswerDTO {
    private Long id;
    private String answerContent;
    private Long questionId;
    private Long writerId;

    public AnswerDTO(Long id, String answerContent, Long questionId, Long writerId) {
        this.id = id;
        this.answerContent = answerContent;
        this.questionId = questionId;
        this.writerId = writerId;
    }

    public static AnswerDTO toAnswerDTO(AnswerEntity answerEntity) {
        AnswerDTO answerDTO = new AnswerDTO();
        answerDTO.setId(answerEntity.getId());
        answerDTO.setAnswerContent(answerEntity.getAnswerContent());
        answerDTO.setQuestionId(answerEntity.getQuestionId());
        answerDTO.setWriterId(answerEntity.getWriterId());
        return answerDTO;
    }
}
