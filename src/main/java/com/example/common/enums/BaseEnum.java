package com.example.common.enums;

import org.jetbrains.annotations.Nullable;

/**
 * @author ：dj
 * @date ：Created in 2019/12/16 下午10:14
 * @Description：
 */
public enum BaseEnum {

    /**
     * 男性
     */
    man(11,"男"),

    /**
     * 女性
     */
    woman(12,"女性");

    private int id;
    private String value;

    @Nullable
    public static BaseEnum getEnum(int id) {
        for (BaseEnum c : BaseEnum.values()) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    BaseEnum(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}