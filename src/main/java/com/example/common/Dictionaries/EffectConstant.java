package com.example.common.Dictionaries;

import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author: dj
 * @create: 2019-12-21 15:29
 * @description:
 */
@Component
public class EffectConstant extends HashMap<String, String> {

    public EffectConstant() {
        put("hp", "生命值");
        put("hurt", "伤害");
    }

}
