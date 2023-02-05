package com.example.cn.zhanshiredis.dao;

import com.example.cn.zhanshiredis.entity.ItemInfo;
import com.example.cn.zhanshiredis.entity.UserFunnel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ItemInfoDao
{
    @Select("select * from category")
List<ItemInfo> getAll();
}
