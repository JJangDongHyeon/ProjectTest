package com.green.greengram.todolist.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetTodoListRes {
    private String content;
    private int isCompleted;
    private String createdAt;
}
