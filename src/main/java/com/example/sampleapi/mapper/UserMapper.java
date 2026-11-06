package com.example.sampleapi.mapper;

import com.example.sampleapi.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT user_id"
    User selectUserByUsername(String username);
}
