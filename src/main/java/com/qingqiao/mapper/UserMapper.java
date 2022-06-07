package com.qingqiao.mapper;

import com.qingqiao.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> queryAll();
}
