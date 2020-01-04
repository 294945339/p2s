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

    public static final String GOODS_TYPE_ARMS = "arms";
    public static final String GOODS_ARMOR = "armor";
    public static final String GOODS_DRUG = "drug";
    public static final String GOODS_TRUMP = "trump";

    public static final String GOODS_EFFECT_HP = "hp";
    public static final String GOODS_EFFECT_BODY = "body";
    public static final String GOODS_EFFECT_XP = "xp";
    public static final String GOODS_EFFECT_HURT = "hurt";
    public static final String GOODS_EFFECT_DEFENSE = "defense";

    public GoodsConstant() {
        put(GOODS_TYPE_ARMS, "武器");
        put(GOODS_ARMOR, "护甲");
        put(GOODS_DRUG, "药品");
        put(GOODS_TRUMP, "法宝");
    }

}
