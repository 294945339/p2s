package com.example.modules.goods.dao;

import com.example.modules.goods.domain.PackDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: dj
 * @create: 2019-12-16 13:22
 * @description:
 */
public interface PackDAO extends JpaRepository<PackDO, Long> {
}
