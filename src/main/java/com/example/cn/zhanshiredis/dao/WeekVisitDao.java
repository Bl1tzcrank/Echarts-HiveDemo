package com.example.cn.zhanshiredis.dao;

import com.example.cn.zhanshiredis.entity.UserVisit;
import com.example.cn.zhanshiredis.entity.WeekVisit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface WeekVisitDao
{
    @Select("select * from weekVisit")
    List<WeekVisit> getAll();
}
