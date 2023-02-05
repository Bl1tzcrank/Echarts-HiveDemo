package com.example.cn.zhanshiredis.entity;

import java.util.List;

public class ChargeVO {

    //区的名字
    private List<String> names;

    //区名和数量的集合
    private List<Float> values;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public List<Float> getValues() {
        return values;
    }

    public void setValues(List<Float> values) {
        this.values = values;
    }
}
