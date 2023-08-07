package com.gujilgujil.domain.board.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BoardPostRequestDto {
    public Long id;
    public String name;
    public String location;
    public String time;
    public String[] team;

}
