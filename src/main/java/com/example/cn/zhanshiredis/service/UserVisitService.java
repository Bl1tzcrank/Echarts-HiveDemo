package com.example.cn.zhanshiredis.service;

import com.example.cn.zhanshiredis.entity.UserVisit;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserVisitService
{
    List<UserVisit> getAll();
}
