package com.jiye.ambientMBTIbackend.question.repository;

import com.jiye.ambientMBTIbackend.question.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {
    Optional<QuestionEntity> findByQuestionDate(LocalDate questionDate);
}
