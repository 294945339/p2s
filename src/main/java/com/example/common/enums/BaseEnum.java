package com.example.common.enums;

import org.jetbrains.annotations.Nullable;

/**
 * @author ：dj
 * @date ：Created in 2019/12/16 下午10:14
 * @Description：
 */
public enum BaseEnum {

    /**
     * 区域1
     */
    area1(1,"西北"),

    /**
     * 区域2
     */
    area2(2,"北"),

    /**
     * 区域3
     */
    area3(3,"东北"),


    /**
     * 区域4
     */
    area4(4,"西"),


    /**
     * 区域5
     */
    area5(5,"中"),

    /**
     * 区域6
     */
    area6(6,"东"),

    /**
     * 区域7
     */
    area7(7,"西南"),

    /**
     * 区域8
     */
    area8(8,"南"),

    /**
     * 区域9
     */
    area9(9,"东南"),

    /**
     * 区域10
     */
    area10(10,"蛮夷之地"),

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