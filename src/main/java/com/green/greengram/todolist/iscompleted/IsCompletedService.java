package com.green.greengram.todolist.iscompleted;

import com.green.greengram.todolist.iscompleted.model.GetIsCompletedListReq;
import com.green.greengram.todolist.iscompleted.model.GetIsCompletedListRes;
import com.green.greengram.todolist.iscompleted.model.SelIsCompletedRes;
import com.green.greengram.todolist.iscompleted.model.ToggleIsCompletedReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class IsCompletedService {
    private final IsCompletedMapper mapper;

    public int toggleIsCompleted(ToggleIsCompletedReq p){
        SelIsCompletedRes selIsComplete = mapper.SelIsCompleted(p);

        if(selIsComplete.getIsCompleted() == 1) {
            mapper.patchDelIsCompleted(p);
            return 0;
        } else {
            mapper.patchInsIsCompleted(p);
            return 1;
        }
    }

    public List<GetIsCompletedListRes> getIsCompletedList(GetIsCompletedListReq p){
        List<GetIsCompletedListRes> list = mapper.getIsCompletedList(p);

        return list;
    }
}
