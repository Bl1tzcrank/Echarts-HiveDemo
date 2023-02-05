package com.example.cn.zhanshiredis.dao;

import com.example.cn.zhanshiredis.entity.ItemInfo;
import com.example.cn.zhanshiredis.entity.Time;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
@Mapper
public interface TimeDao
{
    @Select("select * from buytime")
    List<Time> getAll();
}
