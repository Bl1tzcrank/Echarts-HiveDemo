package com.example.cn.zhanshiredis.dao;

import com.example.cn.zhanshiredis.entity.UserVisit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserVisitDao
{
    @Select("select * from userVisit")
    List<UserVisit> getAll();
}
