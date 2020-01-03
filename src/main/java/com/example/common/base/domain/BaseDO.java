package com.example.common.base.domain;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    /**
     * 系统时间
     */
    @Column(nullable = false)
    private Long sysTime;

    /**
     * 创建人
     */
    private Long createId = 0L;

    /**
     * 创建人名字
     */
    private String createName = "初代";

}
