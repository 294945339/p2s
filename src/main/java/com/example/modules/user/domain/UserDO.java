package com.example.modules.user.domain;

import com.example.common.base.domain.BaseDO;
//import com.example.modules.goods.domain.GoodsDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * @author: dj
 * @create: 2019-12-16 16:07
 * @description:
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "user")
public class UserDO extends BaseDO {

    /**
     * 名字
     */
    private String name;

    /**
     * 种族
     */
    private Integer race;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 生命值
     */
    private Integer hp;

    /**
     * 最大血量
     */
    private Integer maxHp;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 剩余生命
     */
    private Integer life;

    /**
     * 智力
     */
    private Integer spirit;

    /**
     * 体力
     */
    private Integer body;

    /**
     * 运气
     */
    private Integer luck;

    /**
     * 位置
     */
    private Integer position;

    /**
     * 目标
     */
    private String target;

    /**
     * 金币
     */
    private Integer money;

    /**
     * 伤害
     */
    private Integer hurt;

    /**
     * 好坏
     */
    private Integer goodOrBad;

    /**
     * 速度
     */
    private Integer speed;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 状态 2,1,0
     */
    private Integer status;

    /**
     * 背包物品
     */
//    @OneToMany
//    @JoinTable(name = "pack", joinColumns = {@JoinColumn(name = "user_id")}
//            , inverseJoinColumns = {@JoinColumn(name = "goods_id")})
//    private List<GoodsDO> goodsList;

}
