package com.example.common.Dictionaries;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author: dj
 * @create: 2019-12-21 15:29
 * @description:
 */
@Component
public class LevelConstant extends HashMap<Integer, String> {

    public LevelConstant() {
        put(1, "练气");
        put(2, "筑基");
        put(3, "培元");
        put(4, "金丹");
        put(5, "元婴");
        put(6, "出窍");
        put(7, "分神");
        put(8, "大乘");
        put(9, "渡劫");
        put(10, "散仙");
        put(11, "飞升");
    }

}
