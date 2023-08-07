package com.gujilgujil.domain.friendAlert.dto;

import com.gujilgujil.domain.member.Member;
import lombok.Getter;

@Getter
public class FriendAlertRequestDto {
    private String memberId;
    private String friendId;
}
