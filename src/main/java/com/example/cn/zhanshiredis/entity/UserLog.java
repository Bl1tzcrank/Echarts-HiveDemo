package com.example.cn.zhanshiredis.entity;

public class UserLog
{
    private String username;
    private float sums;

    public UserLog()
    {
    }

    public UserLog(String username, float sums)
    {
        this.username = username;
        this.sums = sums;
    }

    public String getUsername()
    {

        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public float getSums()
    {
        return sums;
    }

    public void setSums(float sums)
    {
        this.sums = sums;
    }
}
