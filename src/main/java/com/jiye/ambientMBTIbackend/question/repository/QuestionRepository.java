package com.jiye.ambientMBTIbackend.question.repository;

import com.jiye.ambientMBTIbackend.question.entity.QuestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {
}
