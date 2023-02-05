package com.example.cn.zhanshiredis.service;

import com.example.cn.zhanshiredis.entity.ItemInfo;
import com.example.cn.zhanshiredis.entity.Time;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface TimeService
{
    List<Time> getAll();
}
