package com.example.modules.goods.dao;

import com.example.modules.goods.domain.BuildingDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: dj
 * @create: 2019-12-16 13:22
 * @description:
 */
@Repository
public interface BuildingDAO extends JpaRepository<BuildingDO, String> {

}
