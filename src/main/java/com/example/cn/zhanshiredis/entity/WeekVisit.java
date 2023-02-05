package com.example.cn.zhanshiredis.entity;

public class WeekVisit
{
    private int weekday;
    private int pv;
    private int fav;
    private int cart;
    private int buy;

    @Override
    public String toString()
    {
        return "WeekVisit{" +
                "weekday=" + weekday +
                ", pv=" + pv +
                ", fav=" + fav +
                ", cart=" + cart +
                ", buy=" + buy +
                '}';
    }

    public WeekVisit(int weekday, int pv, int fav, int cart, int buy)
    {
        this.weekday = weekday;
        this.pv = pv;
        this.fav = fav;
        this.cart = cart;
        this.buy = buy;
    }

    public WeekVisit()
    {

    }

    public int getWeekday()
    {

        return weekday;
    }

    public void setWeekday(int weekday)
    {
        this.weekday = weekday;
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
}
