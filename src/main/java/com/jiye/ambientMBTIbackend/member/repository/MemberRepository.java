package com.jiye.ambientMBTIbackend.member.repository;

import com.jiye.ambientMBTIbackend.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
