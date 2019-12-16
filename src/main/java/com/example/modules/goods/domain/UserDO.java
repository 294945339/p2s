package com.example.modules.goods.domain;

import com.example.common.base.domain.BaseDO;
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

    private String name;

    private Integer race;

    private Integer sex;

    private Integer hp;

    private Integer age;

    private Integer life;

    private Integer spirit;

    private Integer body;

    private Integer luck;

    private Integer position;

    private String target;

    @OneToMany
    @JoinTable(name = "pack", joinColumns = {@JoinColumn(name = "user_id")}
            , inverseJoinColumns = {@JoinColumn(name = "goods_id")})
    private List<GoodsDO> goodsList;

}
