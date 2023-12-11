package com.jiye.ambientMBTIbackend.member.dto;

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
    private boolean isAdmin;
}
