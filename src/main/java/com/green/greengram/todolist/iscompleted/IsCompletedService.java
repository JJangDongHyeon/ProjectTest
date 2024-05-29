package com.green.greengram.todolist.iscompleted;

import com.green.greengram.todolist.iscompleted.model.SelIsCompletedRes;
import com.green.greengram.todolist.iscompleted.model.ToggleIsCompletedReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class IsCompletedService {
    private final IsCompletedMapper mapper;

    public int toggleIsCompleted(ToggleIsCompletedReq p){
        SelIsCompletedRes selIsComplete = mapper.SelIsCompleted(p);

        if(selIsComplete.getIsCompleted() == 1) {
            mapper.putDelIsCompleted(p);
            return 0;
        } else {
            mapper.putInsIsCompleted(p);
            return 1;
        }


    }
}
