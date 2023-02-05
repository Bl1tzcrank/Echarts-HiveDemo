package com.example.cn.zhanshiredis.service;

import com.example.cn.zhanshiredis.entity.UserVisit;
import com.example.cn.zhanshiredis.entity.WeekVisit;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface WeekVisitService
{
    List<WeekVisit> getAll();
}
