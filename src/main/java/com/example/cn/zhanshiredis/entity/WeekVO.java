package com.example.cn.zhanshiredis.entity;

import java.util.List;

public class WeekVO
{
    private List<Integer> weekday;
    private List<Integer> pv;
    private List<Integer> fav;
    private List<Integer> cart;
    private List<Integer> buy;

    public List <Integer> getWeekday()
    {
        return weekday;
    }

    public void setWeekday(List <Integer> weekday)
    {
        this.weekday = weekday;
    }

    public List <Integer> getPv()
    {
        return pv;
    }

    public void setPv(List <Integer> pv)
    {
        this.pv = pv;
    }

    public List <Integer> getFav()
    {
        return fav;
    }

    public void setFav(List <Integer> fav)
    {
        this.fav = fav;
    }

    public List <Integer> getCart()
    {
        return cart;
    }

    public void setCart(List <Integer> cart)
    {
        this.cart = cart;
    }

    public List <Integer> getBuy()
    {
        return buy;
    }

    public void setBuy(List <Integer> buy)
    {
        this.buy = buy;
    }
}
