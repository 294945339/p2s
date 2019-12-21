package com.example.modules.goods.domain;

import com.example.common.base.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * @author: dj
 * @create: 2019-12-21 17:07
 * @description:
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "building")
public class BuildingDO extends BaseDO {

    private String name;

    private Integer type;

//    private Integer taskId;

    /**
     * 拥有物品
     */
    @OneToMany
    @JoinTable(name = "pack", joinColumns = {@JoinColumn(name = "building_id")}
            , inverseJoinColumns = {@JoinColumn(name = "goods_id")})
    private List<GoodsDO> goodsList;


}
