package com.example.modules.goods.service;

import com.example.modules.goods.dto.AreaDTO;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: dj
 * @create: 2019-12-21 17:07
 * @description:
 */
@Service
public class AreaService implements Serializable {

    public Map<Integer, String> areaMap = new HashMap<>();

    public List<AreaDTO> getAllArea() {
        List<AreaDTO> list = new ArrayList<>();
        areaMap.forEach((k, v) -> list.add(new AreaDTO(k, v)));
        return list;
    }

    public void initArea() {
        areaMap.put(1, "西北");
        areaMap.put(2, "北");
        areaMap.put(3, "东北");
        areaMap.put(4, "西");
        areaMap.put(5, "中");
        areaMap.put(6, "东");
        areaMap.put(7, "西南");
        areaMap.put(8, "南");
        areaMap.put(9, "东南");
        areaMap.put(10, "蛮夷之地");
    }

}
