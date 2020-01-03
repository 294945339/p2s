package com.example.modules.goods.domain;

import cn.hutool.core.util.StrUtil;
import com.example.common.base.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;


/**
 * @author: dj
 * @create: 2019-12-21 17:07
 * @description: 建筑
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "building")
public class BuildingDO extends BaseDO {

    private String name;

    //0区域,1建筑
    private Integer type;

    public BuildingDO() {
    }

    public BuildingDO(String id, String name, int type) {
        if (StrUtil.isNotEmpty(id)) {
            super.setId(id);
        }
        this.name = name;
        this.type = type;
    }

    @NotNull
    @Contract("_, _ -> new")
    public static BuildingDO createArea(String id, String name) {
        return new BuildingDO(id, name, 0);
    }

    @NotNull
    @Contract("_ -> new")
    public static BuildingDO createGang(String name) {
        return new BuildingDO(null, name, 1);
    }

}
