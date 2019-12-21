package com.example.modules.goods.domain;

import com.example.common.base.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: dj
 * @create: 2019-12-16 13:18
 * @description: 物品
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "goods")
public class GoodsDO extends BaseDO {

    private String name;

    private Integer type;

    /**
     * 使用次数
     */
    private String useNum;

    private String effectArray;

    private Integer status;

    private Long userId;

    private String userName;
}
