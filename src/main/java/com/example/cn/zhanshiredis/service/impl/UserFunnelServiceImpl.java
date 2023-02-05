package com.example.cn.zhanshiredis.service.impl;

import com.example.cn.zhanshiredis.dao.UserFunnelDao;
import com.example.cn.zhanshiredis.dao.UserLogDao;
import com.example.cn.zhanshiredis.entity.UserFunnel;
import com.example.cn.zhanshiredis.entity.UserLog;
import com.example.cn.zhanshiredis.service.UserFunnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class UserFunnelServiceImpl implements UserFunnelService
{

    @Autowired
    UserFunnelDao userFunnelDao;
    @Override
    public List<UserFunnel> getAll()
    {
        List<UserFunnel> all = userFunnelDao.getAll();
        return all;
    }
}
