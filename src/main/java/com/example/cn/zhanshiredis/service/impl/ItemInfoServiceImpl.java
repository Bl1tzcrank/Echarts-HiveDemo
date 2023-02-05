package com.example.cn.zhanshiredis.service.impl;

import com.example.cn.zhanshiredis.dao.ItemInfoDao;
import com.example.cn.zhanshiredis.dao.UserFunnelDao;
import com.example.cn.zhanshiredis.entity.ItemInfo;
import com.example.cn.zhanshiredis.entity.UserFunnel;
import com.example.cn.zhanshiredis.service.ItemInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Iterator;
import java.util.List;
@Service
public class ItemInfoServiceImpl implements ItemInfoService
{
    @Autowired
    ItemInfoDao itemInfoDao;
    @Override
    public List<ItemInfo> getAll()
    {
        List<ItemInfo> all = itemInfoDao.getAll();
        return all;
    }
}
