package com.example.modules.sys.domain;

import cn.hutool.core.util.IdUtil;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author: dj
 * @create: 2020-01-03 14:59
 * @description:
 */
@Data
@Entity
@Table(name = "config")
public class ConfigDO {

    /**
     * 主键
     */
    @Id
    private String id;

    private String name;

    private String value;

    private String remark;

    public ConfigDO() {
        this.id = IdUtil.fastUUID();
    }
}
