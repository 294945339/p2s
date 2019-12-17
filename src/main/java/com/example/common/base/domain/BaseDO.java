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
    private Long id;

    /**
     * 创建时间
     */
    @Column(nullable = false)
    private Long sysTime;

}
