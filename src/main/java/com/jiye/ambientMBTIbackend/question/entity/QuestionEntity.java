package com.jiye.ambientMBTIbackend.question.entity;

import com.jiye.ambientMBTIbackend.question.dto.QuestionDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "question_table")
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String questionContent;

    @Column
    private LocalDate questionAskTime;

    public static QuestionEntity toSaveEntity(QuestionDTO questionDTO) {
        QuestionEntity questionEntity = new QuestionEntity();
        questionEntity.setQuestionContent(questionDTO.getQuestionContent());
        questionEntity.setQuestionAskTime(questionDTO.getQuestionAskTime());
        return questionEntity;
    }
}
