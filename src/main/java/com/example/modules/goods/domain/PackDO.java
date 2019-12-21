package com.example.modules.goods.domain;

import com.example.common.base.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author: dj
 * @create: 2019-12-16 16:07
 * @description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "pack", uniqueConstraints = {
        @UniqueConstraint(name = "pack_user_id_goods_id", columnNames = {"user_id", "goods_id"})
})
public class PackDO extends BaseDO {

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "building_id")
    private Long buildingId;

    @Column(name = "goods_id")
    private Long goodsId;

}
