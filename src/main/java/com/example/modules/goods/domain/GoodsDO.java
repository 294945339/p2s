package com.example.modules.goods.domain;

import com.example.common.base.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
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

    /**
     * "arms", "武器"
     * "armor", "护甲"
     * "drug", "药品"
     * "trump", "法宝"
     */
    private String type;

    /**
     * 使用次数
     */
    private String useNum;

    /**
     * hp
     * body
     * xp
     * defense
     * hurt
     */
    private String effect;

    /**
     * 效果内容
     */
    private Integer value;


    private Integer status;

    /**
     * 归属id
     */
    @Column(name = "user_id")
    private String userId;

    public GoodsDO() {
    }
}
