package com.example.common.Dictionaries;

import java.util.HashMap;

/**
 * @author ：dj
 * @date ：Created in 2019/12/16 下午10:27
 * @Description：基础字典
 */

public class BaseDictionary extends HashMap<Integer, String> {

    private Integer id;
    private String value;

    public BaseDictionary() {
        put(1, "");
        put(2, "");
        put(3, "");
    }
}