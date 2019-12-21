package com.example.modules.goods.domain;

import com.example.common.base.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

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

}
