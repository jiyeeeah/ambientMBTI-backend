package com.jiye.ambientMBTIbackend.member.dto;

import com.jiye.ambientMBTIbackend.member.entity.MemberEntity;
import com.jiye.ambientMBTIbackend.member.repository.MemberMbti;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String memberNickname;
    private String memberPassword;
    private String memberName;
    private MemberMbti memberMbti;
    private boolean isAdmin;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberNickname(memberEntity.getMemberNickname());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        memberDTO.setMemberMbti(memberEntity.getMemberMbti());
        memberDTO.setAdmin(memberEntity.isAdmin());
        return memberDTO;
    }

}
