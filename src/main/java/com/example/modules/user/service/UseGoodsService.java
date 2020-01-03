package com.example.modules.user.service;

import com.example.modules.goods.dao.GoodsDAO;
import com.example.modules.goods.domain.GoodsDO;
import com.example.modules.user.dao.UserDAO;
import com.example.modules.user.domain.UserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: dj
 * @create: 2020-01-03 11:12
 * @description:
 */
@Service
public class UseGoodsService {

    @Resource
    private GoodsDAO goodsDAO;

    @Resource
    private UserDAO userDAO;

    public void useDrugs(UserDO userDO) {

    }

    public List<GoodsDO> searchDrug(UserDO userDO) {
        return null;
    }

    public void useArms() {

    }

    public void useArmor() {

    }

    public void useTrump() {

    }

}
