package com.gujilgujil.domain.board;

import com.gujilgujil.domain.board.dto.BoardPostRequestDto;
import com.gujilgujil.domain.team.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final TeamRepository teamRepository;

    public boolean boardAdd(BoardPostRequestDto requestDto) {

        return true;
    }

}
