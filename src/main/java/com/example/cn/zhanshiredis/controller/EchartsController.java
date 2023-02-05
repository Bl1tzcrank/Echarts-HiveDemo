package com.example.cn.zhanshiredis.controller;


import com.example.cn.zhanshiredis.entity.*;
import com.example.cn.zhanshiredis.service.*;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class EchartsController {

    @Autowired
    UserService userService;

    @Autowired
    UserVisitService userVisitService;

    @Autowired
    UserFunnelService userFunnelService;

    @Autowired
    ItemInfoService itemInfoService;

    @Autowired
    TimeService timeService;

    @Autowired
    WeekVisitService weekVisitService;

    @RequestMapping("/charts/charge")
    public String getCharge(){
        return "charts/chargePosition";
    }

    @RequestMapping("/charts/visit")
    public String getVisit(){
        return "charts/visitData";
    }

    @RequestMapping("/charts/funnel")
    public String getFunnel(){
        return "charts/funnelData";
    }

    @RequestMapping("/charts/category")
    public String getCategory() {return "charts/categoryData";}

    @RequestMapping("/charts/time")
    public String getTime() {return "charts/timeData";}

    @RequestMapping("/charts/week")
    public String getWeekVisit() {return "charts/weekVisitData";}

    @RequestMapping("/charts/buy")
    public String getBuy() {return "charts/buyData";}

    @RequestMapping("/charts/getChargeData")
    @ResponseBody
    public ChargeVO getChargeData(){
        ChargeVO chargeVO = new ChargeVO();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Float> values = new ArrayList<>();
        //从mysql中取数据
        List<UserLog> lists = userService.getAll();
        //循环遍历
        for (UserLog userLog : lists) {
            names.add(userLog.getUsername());
            values.add(userLog.getSums());
        }
        //
        chargeVO.setNames(names);
        chargeVO.setValues(values);
        return chargeVO;
    }

    @RequestMapping("/charts/getUserData")
    @ResponseBody
    public VisitVO getUserData(){
        VisitVO visitVO = new VisitVO();

        ArrayList<Date>    date          = new ArrayList<>();
        ArrayList<Integer> totalValues   = new ArrayList<>();
        ArrayList<Integer> averageValues = new ArrayList<>();
        //从mysql中取数据
        List<UserVisit> lists = userVisitService.getAll();
        //循环遍历
        for (UserVisit userVisit : lists) {
            date.add(userVisit.getDate());
            totalValues.add(userVisit.getusertotalvisit());
            averageValues.add(userVisit.getuseraveragevisit());
        }
        //
        visitVO.setDate(date);
        visitVO.setUseraveragevisit(averageValues);
        visitVO.setUsertotalvisit(totalValues);
        return visitVO;
    }

    @RequestMapping("/charts/getFunnelData")
    @ResponseBody
    public FunnelVO getFunnelData(){
        FunnelVO funnelVO = new FunnelVO();

        ArrayList<Integer>    userbuy     = new ArrayList<>();
        ArrayList<Integer> userfavorcart  = new ArrayList<>();
        ArrayList<Integer> usertotalvisit = new ArrayList<>();
        //从mysql中取数据
        List<UserFunnel> lists = userFunnelService.getAll();
        //循环遍历
        for (UserFunnel userFunnel : lists) {
            userbuy.add(userFunnel.getUserbuy());
            userfavorcart.add(userFunnel.getUserfavorcart());
            usertotalvisit.add(userFunnel.getUsertotalvisit());
        }
        //
        funnelVO.setUserbuy(userbuy);
        funnelVO.setUserfavorcart(userfavorcart);
        funnelVO.setUsertotalvisit(usertotalvisit);
        return funnelVO;
    }

    @RequestMapping("/charts/getCategoryData")
    @ResponseBody
    public ItemVO getCategoryData(){
        ItemVO itemVO = new ItemVO();

        ArrayList<Integer>    id     = new ArrayList<>();
        ArrayList<Integer> pv  = new ArrayList<>();
        ArrayList<Integer> fav = new ArrayList<>();
        ArrayList<Integer> cart = new ArrayList<>();
        ArrayList<Integer> buy = new ArrayList<>();
        //从mysql中取数据
        List<ItemInfo> lists = itemInfoService.getAll();
        //循环遍历
        for (ItemInfo itemInfo : lists) {
            id.add(itemInfo.getId());
            pv.add(itemInfo.getPv());
            fav.add(itemInfo.getFav());
            cart.add(itemInfo.getCart());
            buy.add(itemInfo.getBuy());
        }
        //
        itemVO.setId(id);
        itemVO.setPv(pv);
        itemVO.setFav(fav);
        itemVO.setCart(cart);
        itemVO.setBuy(buy);
        return itemVO;
    }

    @RequestMapping("/charts/getTimeData")
    @ResponseBody
    public TimeVO getTimeData(){
        TimeVO timeVO = new TimeVO();

        ArrayList<Integer>   hour     = new ArrayList<>();
        ArrayList<Integer> pv  = new ArrayList<>();
        ArrayList<Integer> fav = new ArrayList<>();
        ArrayList<Integer> cart = new ArrayList<>();
        ArrayList<Integer> buy = new ArrayList<>();
        //从mysql中取数据
        List<Time> lists = timeService.getAll();
        //循环遍历
        for (Time time : lists) {
            hour.add(time.getHour());
            pv.add(time.getPv());
            fav.add(time.getFav());
            cart.add(time.getCart());
            buy.add(time.getBuy());
        }
        //
        timeVO.setHour(hour);
        timeVO.setPv(pv);
        timeVO.setFav(fav);
        timeVO.setCart(cart);
        timeVO.setBuy(buy);
        return timeVO;
    }

    @RequestMapping("/charts/getWeekVisitData")
    @ResponseBody
    public WeekVO getWeekVisitData(){
        WeekVO weekVO = new WeekVO();

        ArrayList<Integer>   weekday     = new ArrayList<>();
        ArrayList<Integer> pv  = new ArrayList<>();
        ArrayList<Integer> fav = new ArrayList<>();
        ArrayList<Integer> cart = new ArrayList<>();
        ArrayList<Integer> buy = new ArrayList<>();
        //从mysql中取数据
        List<WeekVisit> lists = weekVisitService.getAll();
        //循环遍历
        for (WeekVisit weekVisit : lists) {
            weekday.add(weekVisit.getWeekday());
            pv.add(weekVisit.getPv());
            fav.add(weekVisit.getFav());
            cart.add(weekVisit.getCart());
            buy.add(weekVisit.getBuy());
        }
        //
        weekVO.setWeekday(weekday);
        weekVO.setPv(pv);
        weekVO.setFav(fav);
        weekVO.setCart(cart);
        weekVO.setBuy(buy);
        return weekVO;
    }
}
