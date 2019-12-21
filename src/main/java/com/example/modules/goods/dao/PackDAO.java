package com.example.modules.goods.dao;

import com.example.modules.goods.domain.PackDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: dj
 * @create: 2019-12-16 13:22
 * @description:
 */
@Repository
public interface PackDAO extends JpaRepository<PackDO, Long> {

    /**
     * 根据用户查询出所有数据
     *
     * @param userId userId
     * @param goodsId goodsId
     * @return
     */
    List<PackDO> findByUserIdAndGoodsId(Long userId, Long goodsId);

}
