package com.ohmybug.pojo;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:   Status
 * Data:        2020/8/31
 * author:      Oh_MyBug
 * version:     V1.0
 */
public class Status {
    public final static Map<String, Integer> status = new HashMap<String, Integer>() {
        {
            put("未开放", 0);
            put("抽签阶段", 1);
            put("确定阶段", 2);
            put("已结束", 3);
        }
    };

}
