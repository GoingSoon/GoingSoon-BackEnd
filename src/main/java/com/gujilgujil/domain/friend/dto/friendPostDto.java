package com.gujilgujil.domain.friend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class friendPostDto {

    private Long memberId;
    private Long friendId;
}
