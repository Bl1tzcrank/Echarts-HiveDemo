package com.example.cn.zhanshiredis.service.impl;

import com.example.cn.zhanshiredis.dao.UserLogDao;
import com.example.cn.zhanshiredis.entity.UserLog;
import com.example.cn.zhanshiredis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    UserLogDao userLogDao;
    @Override
    public List<UserLog> getAll()
    {
        List<UserLog> all = userLogDao.getAll();
        return all;
    }
}
