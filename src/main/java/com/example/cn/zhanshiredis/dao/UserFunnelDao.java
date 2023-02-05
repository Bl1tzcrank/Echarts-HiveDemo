package com.example.cn.zhanshiredis.dao;

import com.example.cn.zhanshiredis.entity.UserFunnel;
import com.example.cn.zhanshiredis.entity.UserVisit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface UserFunnelDao
{
    @Select("select * from userFunnel")
    List<UserFunnel> getAll();
}
