package com.example.modules.goods.dao;

import com.example.modules.goods.domain.GoodsDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: dj
 * @create: 2019-12-16 13:22
 * @description:
 */
@Repository
public interface GoodsDAO extends JpaRepository<GoodsDO, String> {

    /**
     * 根据userId和 type 查询
     *
     * @param userId 拥有者
     * @param type   type
     * @return list
     */
    List<GoodsDO> findByUserIdAndType(String userId, String type);

    /**
     * 根据userId查询
     *
     * @param userId 拥有者
     * @return list
     */
    List<GoodsDO> findByUserId(String userId);

}
