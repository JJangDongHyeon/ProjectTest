package com.green.greengram.todolist;

import com.green.greengram.common.CustomFileUtils;
import com.green.greengram.todolist.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.green.greengram.common.GlobalConst.COMMENT_SIZE_PER_FEED;

@RequiredArgsConstructor
@Service
@Slf4j
public class TodoListService {
    private final TodoListMapper mapper;
    private final CustomFileUtils customFileUtils;

    @Transactional
    public int postTodoList(PostTodoListReq p){
       int affectedRow =  mapper.postTodoList(p);
        return affectedRow;
    }

    public List<GetTodoListRes> getTodoList(GetTodoListReq p){
        List<GetTodoListRes> list = mapper.getTodoList(p);
        return list;
    }

    public int delTodoList(long listId){
        return mapper.delListId(listId);
    }

    public int putTodoList(PutTodoListReq p){
        return mapper.putTodoList(p);
    }
}
