package com.gujilgujil.domain.friendAlert.dto;

import com.gujilgujil.domain.friendAlert.FriendAlert;
import com.gujilgujil.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
public class FriendAlertResponseDto {
    private List<String> friendList;
    private boolean friendAddResult;
    private boolean friendDeleteResult;
}
