package com.example.cn.zhanshiredis.dao;

import com.example.cn.zhanshiredis.entity.UserLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.Mapping;
import java.util.List;

@Mapper
public interface UserLogDao
{
    @Select("select * from userLog")
    List<UserLog> getAll();
}
