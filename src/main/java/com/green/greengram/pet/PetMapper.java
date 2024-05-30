package com.green.greengram.pet;

import com.green.greengram.pet.model.GetPetListRes;
import com.green.greengram.pet.model.PostPetReq;
import com.green.greengram.pet.model.PostPetRes;
import com.green.greengram.pet.model.PutPetReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PetMapper {
    int postPet(PostPetReq p);
    List<GetPetListRes> getPetNameList(long userId);
    int delPet(long petId);
    int putPet(PutPetReq p);
}
