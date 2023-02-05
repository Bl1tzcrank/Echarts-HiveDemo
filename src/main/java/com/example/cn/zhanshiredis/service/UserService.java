package com.example.cn.zhanshiredis.service;

import com.example.cn.zhanshiredis.entity.UserLog;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService
{
    List<UserLog> getAll();
}
