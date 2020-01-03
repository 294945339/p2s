package com.example.common.base.domain;

import cn.hutool.core.util.IdUtil;
import com.example.modules.sys.service.SysService;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author: dj
 * @create: 2019-12-16 13:19
 * @description:
 */
@MappedSuperclass
@Data
public class BaseDO implements Serializable {

    /**
     * 主键
     */
    @Id
    private String id;

    /**
     * 系统时间
     */
    @Column(nullable = false)
    private Long sysTime;

    /**
     * 创建人
     */
    private String createId;

    /**
     * 创建人名字
     */
    private String createName;

    public BaseDO() {
        this.sysTime = SysService.SYS_TIME.get();
        this.createName = "初代";
        this.id = IdUtil.fastUUID();
    }
}
