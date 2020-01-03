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

    @Column(name = "name")
    private String name;

    /**
     * "arms", "武器"
     * "armor", "护甲"
     * "drug", "药品"
     * "trump", "法宝"
     */
    @Column(name = "type")
    private Integer type;

    /**
     * 使用次数
     */
    @Column(name = "use_num")
    private String useNum;

    @Column(name = "effect")
    private String effect;

    @Column(name = "status")
    private Integer status;

    @Column(name = "user_id")
    private String userId;

}
