package com.jiye.ambientMBTIbackend.member.service;

import com.jiye.ambientMBTIbackend.member.dto.MemberDTO;
import com.jiye.ambientMBTIbackend.member.entity.MemberEntity;
import com.jiye.ambientMBTIbackend.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void join (MemberDTO memberDTO) {
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }
}
