package com.gujilgujil.domain.friend.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class friendResponseDto {
    List<String> friendList;
    String status;
}
