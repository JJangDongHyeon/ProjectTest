package com.green.greengram.todolist.iscompleted;

import com.green.greengram.common.model.ResultDto;
import com.green.greengram.todolist.iscompleted.model.ToggleIsCompletedReq;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/todolist/is_complete")
public class IsCompletedController {
    private final IsCompletedService service;

    @GetMapping
    @Operation(summary = "완료된 일" , description = "Toggle 처리")
    public ResultDto<Integer> toggleIsCompleted(@ParameterObject @ModelAttribute ToggleIsCompletedReq p){
        int result = service.toggleIsCompleted(p);
        //result == 0 >> isCompleted 취소 (체크  >비체크) : 체크 취소
        //result == 1 >> isCompleted 추가 (비체크  >체크) : 체크 추가
        return ResultDto.<Integer>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg(HttpStatus.OK.toString())
                .resultData(result)
                .build();

    }
}
