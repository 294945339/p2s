package com.example.modules.sys.dao;

import com.example.modules.sys.domain.ConfigDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: dj
 * @create: 2020-01-03 15:03
 * @description:
 */
@Repository
public interface ConfigDAO extends JpaRepository<ConfigDO, String> {

    List<ConfigDO> findByName(String name);

}
