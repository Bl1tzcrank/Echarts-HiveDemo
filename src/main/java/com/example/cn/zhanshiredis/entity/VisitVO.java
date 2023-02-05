package com.example.cn.zhanshiredis.entity;

import java.util.Date;
import java.util.List;

public class VisitVO
{
//    private Date    date;
//    private     Integer usertotalvisit;
//    private     Integer useraveragevisit;
    private List<Date> date;
    private List<Integer> usertotalvisit;
    private List<Integer> useraveragevisit;

    public List <Date> getDate()
    {
        return date;
    }

    public void setDate(List <Date> date)
    {
        this.date = date;
    }

    public List <Integer> getUsertotalvisit()
    {
        return usertotalvisit;
    }

    public void setUsertotalvisit(List <Integer> usertotalvisit)
    {
        this.usertotalvisit = usertotalvisit;
    }

    public List <Integer> getUseraveragevisit()
    {
        return useraveragevisit;
    }

    public void setUseraveragevisit(List <Integer> useraveragevisit)
    {
        this.useraveragevisit = useraveragevisit;
    }
}
