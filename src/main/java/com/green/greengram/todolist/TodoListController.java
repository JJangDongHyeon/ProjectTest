package com.green.greengram.todolist;

import com.green.greengram.common.model.ResultDto;
import com.green.greengram.todolist.model.GetTodoListReq;
import com.green.greengram.todolist.model.GetTodoListRes;
import com.green.greengram.todolist.model.PostTodoListReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("api/todolist")
public class TodoListController {
    private final TodoListService service;


    @PostMapping
    public ResultDto<Long> postTodoList(@ParameterObject @ModelAttribute PostTodoListReq p){
        long listId= service.postTodoList(p);

        return ResultDto.<Long>builder()
                .statusCode(HttpStatus.OK)
                .resultMsg("TodoList 추가 완료")
                .resultData(listId)
                .build();
    }

    @GetMapping
    public ResultDto<List<GetTodoListRes>> getListId(@ParameterObject @ModelAttribute GetTodoListReq p){
        List<GetTodoListRes> list = service.getListId(p);

        return ResultDto.<List<GetTodoListRes>>builder().
                statusCode(HttpStatus.OK).
                resultMsg(HttpStatus.OK.toString()).
                resultData(list).
                build();
    }

    @DeleteMapping
    public ResultDto<Integer> delListId(@ParameterObject @RequestParam long listId){
        int list = service.delListId(listId);

        return ResultDto.<Integer>builder().
                statusCode(HttpStatus.OK).
                resultMsg(HttpStatus.OK.toString()).
                resultData(list).
                build();
    }
}
