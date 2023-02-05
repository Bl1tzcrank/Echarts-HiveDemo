package com.example.cn.zhanshiredis.entity;

public class UserFunnel
{
    private int usertotalvisit;
    private int userfavorcart;
    private int userbuy;

    public UserFunnel()
    {
    }

    @Override
    public String toString()
    {
        return "UserFunnel{" +
                "usertotalvisit=" + usertotalvisit +
                ", userfavorcart=" + userfavorcart +
                ", userbuy=" + userbuy +
                '}';
    }

    public UserFunnel(int usertotalvisit, int userfavorcart, int userbuy)
    {
        this.usertotalvisit = usertotalvisit;
        this.userfavorcart = userfavorcart;
        this.userbuy = userbuy;
    }

    public int getUsertotalvisit()
    {
        return usertotalvisit;
    }

    public void setUsertotalvisit(int usertotalvisit)
    {
        this.usertotalvisit = usertotalvisit;
    }

    public int getUserfavorcart()
    {
        return userfavorcart;
    }

    public void setUserfavorcart(int userfavorcart)
    {
        this.userfavorcart = userfavorcart;
    }

    public int getUserbuy()
    {
        return userbuy;
    }

    public void setUserbuy(int userbuy)
    {
        this.userbuy = userbuy;
    }
}
