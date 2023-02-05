package com.example.cn.zhanshiredis.service.impl;

import com.example.cn.zhanshiredis.dao.UserVisitDao;
import com.example.cn.zhanshiredis.dao.WeekVisitDao;
import com.example.cn.zhanshiredis.entity.UserVisit;
import com.example.cn.zhanshiredis.entity.WeekVisit;
import com.example.cn.zhanshiredis.service.WeekVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class WeekVisitServiceImpl implements WeekVisitService
{
    @Autowired
    WeekVisitDao weekVisitDao;

    @Override
    public List<WeekVisit> getAll()
    {
        List<WeekVisit> all = weekVisitDao.getAll();
        return all;
    }
}
