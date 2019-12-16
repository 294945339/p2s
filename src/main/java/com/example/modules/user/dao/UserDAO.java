package com.example.modules.user.dao;

import com.example.modules.goods.domain.GoodsDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: dj
 * @create: 2019-12-16 13:22
 * @description:
 */
@Repository
public interface UserDAO extends JpaRepository<GoodsDO, Long> {
}
