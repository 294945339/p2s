package com.example.modules.goods.service;

import com.example.modules.goods.dao.PackDAO;
//import com.example.modules.goods.domain.GoodsDO;
import com.example.modules.goods.domain.PackDO;
import com.example.modules.user.domain.UserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: dj
 * @create: 2019-12-21 16:16
 * @description:
 */
@Service
public class PackService {

    @Resource
    private PackDAO packDAO;

    public void move(Long meId, Long youId, Long goodsId) {
        List<PackDO> list = packDAO.findByUserIdAndGoodsId(meId, goodsId);
        list.forEach(packDO -> {
            packDO.setUserId(youId);
        });
        packDAO.saveAll(list);
    }

}
