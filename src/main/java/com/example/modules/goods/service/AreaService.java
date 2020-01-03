package com.example.modules.goods.service;

import com.example.modules.goods.dao.BuildingDAO;
import com.example.modules.goods.domain.BuildingDO;
import com.example.modules.goods.dto.AreaDTO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.*;

/**
 * @author: dj
 * @create: 2019-12-21 17:07
 * @description:
 */
@Service
public class AreaService implements Serializable {

    @Resource
    private BuildingDAO buildingDAO;

    public Map<Integer, String> areaMap = new HashMap<>();

    public List<AreaDTO> getAllArea() {
        List<AreaDTO> list = new ArrayList<>();
        areaMap.forEach((k, v) -> list.add(new AreaDTO(k, v)));
        return list;
    }

    public void initArea() {
        Optional<BuildingDO> qb1 = buildingDAO.findById("1");
        if (0 == qb1.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("1", "西北");
            buildingDAO.save(buildingDO);
        }

        Optional<BuildingDO> qb2 = buildingDAO.findById("2");
        if (0 == qb2.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("2", "北");
            buildingDAO.save(buildingDO);
        }

        Optional<BuildingDO> qb3 = buildingDAO.findById("3");
        if (0 == qb3.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("3", "东北");
            buildingDAO.save(buildingDO);
        }

        Optional<BuildingDO> qb4 = buildingDAO.findById("4");
        if (0 == qb4.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("4", "西");
            buildingDAO.save(buildingDO);
        }

        Optional<BuildingDO> qb5 = buildingDAO.findById("5");
        if (0 == qb5.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("5", "中");
            buildingDAO.save(buildingDO);
        }

        Optional<BuildingDO> qb6 = buildingDAO.findById("6");
        if (0 == qb6.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("6", "东");
            buildingDAO.save(buildingDO);
        }

        Optional<BuildingDO> qb7 = buildingDAO.findById("7");
        if (0 == qb7.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("7", "西南");
            buildingDAO.save(buildingDO);
        }

        Optional<BuildingDO> qb8 = buildingDAO.findById("8");
        if (0 == qb8.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("8", "南");
            buildingDAO.save(buildingDO);
        }

        Optional<BuildingDO> qb9 = buildingDAO.findById("9");
        if (0 == qb9.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("9", "东南");
            buildingDAO.save(buildingDO);
        }

        Optional<BuildingDO> qb10 = buildingDAO.findById("10");
        if (0 == qb10.hashCode()) {
            BuildingDO buildingDO = BuildingDO.createArea("10", "蛮夷");
            buildingDAO.save(buildingDO);
        }

    }

}
