package com.example.modules.goods.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: dj
 * @create: 2019-12-21 17:10
 * @description:
 */
@Data
public class AreaDTO implements Serializable {

    private Integer id;

    private String name;

    public AreaDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
