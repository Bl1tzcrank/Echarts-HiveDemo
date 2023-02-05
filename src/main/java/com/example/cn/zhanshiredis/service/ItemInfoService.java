package com.example.cn.zhanshiredis.service;

import com.example.cn.zhanshiredis.entity.ItemInfo;
import com.example.cn.zhanshiredis.entity.UserFunnel;
import org.springframework.stereotype.Service;
import java.util.List;
//import com.example.cn.zhanshiredis.entity.UserFunnel;
@Service
public interface ItemInfoService
{
    List<ItemInfo> getAll();
}
