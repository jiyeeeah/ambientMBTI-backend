package com.jiye.ambientMBTIbackend.member.entity;

import com.jiye.ambientMBTIbackend.member.dto.MemberDTO;
import com.jiye.ambientMBTIbackend.member.repository.MemberMbti;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "member_table")
public class MemberEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String memberNickname;

    @Column
    private String memberPassword;

    @Column
    private String memberName;

    @Column
    private MemberMbti memberMbti;

    @Column
    private boolean isAdmin;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberNickname(memberDTO.getMemberNickname());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setMemberName(memberDTO.getMemberName());
        memberEntity.setMemberMbti(memberDTO.getMemberMbti());
        memberEntity.setAdmin(memberDTO.isAdmin());
        return memberEntity;
    }

    public static MemberEntity toUpdateMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDTO.getId()); // 이거 한줄 추가!
        memberEntity.setMemberNickname(memberDTO.getMemberNickname());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setMemberName(memberDTO.getMemberName());
        memberEntity.setMemberMbti(memberDTO.getMemberMbti());
        memberEntity.setAdmin(memberDTO.isAdmin());
        return memberEntity;
    }
}
