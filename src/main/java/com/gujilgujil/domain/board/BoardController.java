package com.gujilgujil.domain.board;

import com.gujilgujil.domain.board.dto.BoardPostRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @PostMapping("/board")
    public boolean boardAdd(@RequestBody BoardPostRequestDto requestDto) {
        return boardService.boardAdd(requestDto);
    }


}
