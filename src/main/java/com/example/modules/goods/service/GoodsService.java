package com.example.modules.goods.service;

//import com.example.modules.goods.domain.GoodsDO;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.example.common.constant.GoodsConstant;
import com.example.modules.goods.dao.GoodsDAO;
import com.example.modules.goods.domain.GoodsDO;
import com.example.modules.user.dao.UserDAO;
import com.example.modules.user.domain.UserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: dj
 * @create: 2019-12-21 16:12
 * @description:
 */
@Service
public class GoodsService {

    @Resource
    private GoodsDAO goodsDAO;

    @Resource
    private UserDAO userDAO;

    public void useGood(UserDO userDO, GoodsDO goodsDO) {


        /**
         * "arms", "wuqi"
         * "armor", "hujia"
         * "drug", "yaoping"
         * "trump", "fabao"
         */
        if (GoodsConstant.GOODS_TYPE_ARMS.equalsIgnoreCase(goodsDO.getType())) {
            int hurt = userDO.getHurt();
            String goodsId = userDO.getArmsId();
            if (StrUtil.isNotEmpty(goodsId)) {
                GoodsDO goods = goodsDAO.getOne(goodsId);
                hurt = hurt - goods.getValue();
                userDO.setHurt(hurt);
                goods.setStatus(1);
            }
        } else if (GoodsConstant.GOODS_ARMOR.equalsIgnoreCase(goodsDO.getType())) {
            int defense = userDO.getDefense();
            String goodsId = userDO.getArmorId();
            if (StrUtil.isNotEmpty(goodsId)) {
                GoodsDO goods = goodsDAO.getOne(goodsId);
                defense = defense - goods.getValue();
                userDO.setDefense(defense);
                goods.setStatus(1);
            }
        } else if (GoodsConstant.GOODS_DRUG.equalsIgnoreCase(goodsDO.getType())) {

        } else if (GoodsConstant.GOODS_TRUMP.equalsIgnoreCase(goodsDO.getType())) {

        }
        goodsDAO.save(goodsDO);
        userDAO.save(userDO);
    }


}
