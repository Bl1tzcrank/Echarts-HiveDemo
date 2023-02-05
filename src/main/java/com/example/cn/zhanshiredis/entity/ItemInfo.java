package com.example.cn.zhanshiredis.entity;

public class ItemInfo
{
    private int id;
    private int pv;
    private int fav;
    private int cart;
    private int buy;

    @Override
    public String toString()
    {
        return "ItemInfo{" +
                "id=" + id +
                ", pv=" + pv +
                ", fav=" + fav +
                ", cart=" + cart +
                ", buy=" + buy +
                '}';
    }

    public ItemInfo(int id, int pv, int fav, int cart, int buy)
    {
        this.id = id;
        this.pv = pv;
        this.fav = fav;
        this.cart = cart;
        this.buy = buy;
    }

    public ItemInfo()
    {

    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
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
