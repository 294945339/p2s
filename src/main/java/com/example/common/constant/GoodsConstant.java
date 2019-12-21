package com.example.common.constant;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author: dj
 * @create: 2019-12-21 15:29
 * @description:
 */
@Component
public class GoodsConstant extends HashMap<String, String> {

    public GoodsConstant() {
        put("arms", "武器");
        put("armor", "护甲");
        put("drug", "药品");
        put("trump", "法宝");
    }

}
