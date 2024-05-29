package com.green.greengram.todolist.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostTodoListReq {
    @JsonIgnore
    private long listId;
    private long userId;
    private String content;
}
