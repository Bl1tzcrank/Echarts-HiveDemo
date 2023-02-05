package com.example.cn.zhanshiredis.entity;

public class Time
{
    private int hour;
    private int pv;
    private int fav;
    private int cart;
    private int buy;

    @Override
    public String toString()
    {
        return "Time{" +
                "hour=" + hour +
                ", pv=" + pv +
                ", fav=" + fav +
                ", cart=" + cart +
                ", buy=" + buy +
                '}';
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }

    public int getPv()
    {
        return pv;
    }

    public void setPv(int pv)
    {
        this.pv = pv;
    }

    public int getFav()
    {
        return fav;
    }

    public void setFav(int fav)
    {
        this.fav = fav;
    }

    public int getCart()
    {
        return cart;
    }

    public void setCart(int cart)
    {
        this.cart = cart;
    }

    public int getBuy()
    {
        return buy;
    }

    public void setBuy(int buy)
    {
        this.buy = buy;
    }

    public Time()
    {

    }

    public Time(int hour, int pv, int fav, int cart, int buy)
    {

        this.hour = hour;
        this.pv = pv;
        this.fav = fav;
        this.cart = cart;
        this.buy = buy;
    }
}
