package com.example.cn.zhanshiredis.entity;

import java.util.List;

public class FunnelVO
{
    private List<Integer> userbuy;
    private List<Integer> usertotalvisit;
    private List<Integer> userfavorcart;

    public List <Integer> getUserbuy()
    {
        return userbuy;
    }

    public void setUserbuy(List <Integer> userbuy)
    {
        this.userbuy = userbuy;
    }

    public List <Integer> getUsertotalvisit()
    {
        return usertotalvisit;
    }

    public void setUsertotalvisit(List <Integer> usertotalvisit)
    {
        this.usertotalvisit = usertotalvisit;
    }

    public List <Integer> getUserfavorcart()
    {
        return userfavorcart;
    }

    public void setUserfavorcart(List <Integer> userfavorcart)
    {
        this.userfavorcart = userfavorcart;
    }
}
