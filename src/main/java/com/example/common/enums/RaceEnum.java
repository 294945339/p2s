package com.example.common.enums;

import org.jetbrains.annotations.Nullable;

/**
 * @author ：dj
 * @date ：Created in 2019/12/16 下午9:59
 * @Description： 种族
 */

public enum RaceEnum {

    /**
     * 中土人类
     */
    human(1, "中土人类", 50, 100, 50, 100),

    /**
     * 天空鸟人
     */
    sykMan(2, "天空鸟人", 30, 80, 70, 120),

    /**
     * 东海渔民
     */
    seaMan(3, "东海渔民", 70, 120, 30, 80);

    private int id;
    private String name;
    private int hpMin;
    private int hpMax;
    private int minLife;
    private int maxLife;

    RaceEnum(int id, String name, int hpMin, int hpMax, int minLife, int maxLife) {
        this.id = id;
        this.name = name;
        this.hpMin = hpMin;
        this.hpMax = hpMax;
        this.minLife = minLife;
        this.maxLife = maxLife;
    }

    @Nullable
    public static RaceEnum getEnum(int id) {
        for (RaceEnum c : RaceEnum.values()) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHpMin() {
        return hpMin;
    }

    public int getHpMax() {
        return hpMax;
    }

    public int getMinLife() {
        return minLife;
    }

    public int getMaxLife() {
        return maxLife;
    }
}