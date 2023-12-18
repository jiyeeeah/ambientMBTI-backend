package com.jiye.ambientMBTIbackend.answer.repository;

import com.jiye.ambientMBTIbackend.answer.entity.AnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<AnswerEntity, Long> {
}
