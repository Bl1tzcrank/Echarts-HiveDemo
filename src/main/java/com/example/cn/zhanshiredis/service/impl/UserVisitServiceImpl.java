package com.example.cn.zhanshiredis.service.impl;

import com.example.cn.zhanshiredis.dao.UserVisitDao;
import com.example.cn.zhanshiredis.entity.UserVisit;
import com.example.cn.zhanshiredis.service.UserVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserVisitServiceImpl implements UserVisitService
{
    @Autowired
    UserVisitDao userVisitDao;

    @Override
    public List<UserVisit> getAll()
    {
        List<UserVisit> all = userVisitDao.getAll();
        return all;
    }
}
