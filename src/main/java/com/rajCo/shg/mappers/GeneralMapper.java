package com.rajCo.shg.mappers;

import com.rajCo.shg.entities.Members;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GeneralMapper {

    List<Members> getAllMembers();

}
