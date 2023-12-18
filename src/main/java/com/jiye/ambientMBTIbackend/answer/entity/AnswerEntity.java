    package com.jiye.ambientMBTIbackend.answer.entity;

    import com.jiye.ambientMBTIbackend.answer.dto.AnswerDTO;
    import jakarta.persistence.*;
    import lombok.Getter;
    import lombok.Setter;

    @Entity
    @Getter
    @Setter
    @Table(name = "answer_table")
    public class AnswerEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column
        private String answerContent;

        @Column(nullable = false)
        private Long questionId;

        @Column(nullable = false)
        private Long writerId;

        public static AnswerEntity toAnswerEntity(AnswerDTO answerDTO) {
            AnswerEntity answerEntity = new AnswerEntity();
            answerEntity.setAnswerContent(answerDTO.getAnswerContent());
            answerEntity.setQuestionId(answerDTO.getQuestionId());
            answerEntity.setWriterId(answerDTO.getWriterId());
            return answerEntity;
        }
    }
