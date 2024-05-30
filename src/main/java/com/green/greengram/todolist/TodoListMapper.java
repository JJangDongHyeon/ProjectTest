package com.green.greengram.todolist;

import com.green.greengram.todolist.model.*;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoListMapper {
    int postTodoList(PostTodoListReq p);
    List<GetTodoListRes> getTodoList(GetTodoListReq p);
    int delListId(long listId);
    int putTodoList(PutTodoListReq p);
}
