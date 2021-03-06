package com.example.modules.goods.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: dj
 * @create: 2019-12-21 16:03
 * @description:
 */
@Data
public class EffectDTO implements Serializable {

    private String name;

    private Boolean haveAdd;

    /**
     * 是否按百分比操作
     */
    private Boolean haveProportion;

    private Integer value;
}
