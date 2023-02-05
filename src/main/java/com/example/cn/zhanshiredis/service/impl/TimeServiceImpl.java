package com.example.cn.zhanshiredis.service.impl;

import com.example.cn.zhanshiredis.dao.ItemInfoDao;
import com.example.cn.zhanshiredis.dao.TimeDao;
import com.example.cn.zhanshiredis.entity.ItemInfo;
import com.example.cn.zhanshiredis.entity.Time;
import com.example.cn.zhanshiredis.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class TimeServiceImpl implements TimeService
{
    @Autowired
    TimeDao timeDao;
    @Override
    public List<Time> getAll()
    {
        List<Time> all = timeDao.getAll();
        return all;
    }
}
