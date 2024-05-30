package com.green.greengram.todolist.iscompleted;

import com.green.greengram.todolist.iscompleted.model.GetIsCompletedListReq;
import com.green.greengram.todolist.iscompleted.model.GetIsCompletedListRes;
import com.green.greengram.todolist.iscompleted.model.SelIsCompletedRes;
import com.green.greengram.todolist.iscompleted.model.ToggleIsCompletedReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IsCompletedMapper {
    SelIsCompletedRes SelIsCompleted(ToggleIsCompletedReq p);
    int patchDelIsCompleted(ToggleIsCompletedReq p);
    int patchInsIsCompleted(ToggleIsCompletedReq p);
    List<GetIsCompletedListRes> getIsCompletedList(GetIsCompletedListReq p);
}
