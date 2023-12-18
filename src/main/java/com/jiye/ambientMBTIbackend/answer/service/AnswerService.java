package com.jiye.ambientMBTIbackend.answer.service;

import com.jiye.ambientMBTIbackend.answer.dto.AnswerDTO;
import com.jiye.ambientMBTIbackend.answer.entity.AnswerEntity;
import com.jiye.ambientMBTIbackend.answer.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;

    public void save(AnswerDTO answerDTO) {
        AnswerEntity answerEntity = AnswerEntity.toAnswerEntity(answerDTO);
        answerRepository.save(answerEntity);
    }
}
