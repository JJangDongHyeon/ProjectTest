package com.green.greengram.todolist.iscompleted;

import com.green.greengram.todolist.iscompleted.model.SelIsCompletedRes;
import com.green.greengram.todolist.iscompleted.model.ToggleIsCompletedReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IsCompletedMapper {
    SelIsCompletedRes SelIsCompleted(ToggleIsCompletedReq p);
    int putDelIsCompleted(ToggleIsCompletedReq p);
    int putInsIsCompleted(ToggleIsCompletedReq p);
}
