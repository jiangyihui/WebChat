package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Flower on 2017/5/12.
 */
public interface UserMapper {
    @Select("Select * from ee")
    String GetTestword();

//    public int insertUserWithBackId(User user);
}
