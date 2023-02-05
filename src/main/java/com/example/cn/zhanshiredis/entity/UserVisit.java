package com.example.cn.zhanshiredis.entity;

import java.util.Date;

public class UserVisit
{
    private Date date;
    private int usertotalvisit;
    private int useraveragevisit;

    public UserVisit()
    {
    }

    public UserVisit(Date date, int usertotalvisit, int useraveragevisit)
    {
        this.date = date;
        this.usertotalvisit = usertotalvisit;
        this.useraveragevisit = useraveragevisit;
    }

    @Override
    public String toString()
    {
        return "UserVisit{" +
                "date=" + date +
                ", usertotalvisit=" + usertotalvisit +
                ", useraveragevisit=" + useraveragevisit +
                '}';
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public int getusertotalvisit()
    {
        return usertotalvisit;
    }

    public void setusertotalvisit(int usertotalvisit)
    {
        this.usertotalvisit = usertotalvisit;
    }

    public int getuseraveragevisit()
    {
        return useraveragevisit;
    }

    public void setuseraveragevisit(int useraveragevisit)
    {
        this.useraveragevisit = useraveragevisit;
    }

}
