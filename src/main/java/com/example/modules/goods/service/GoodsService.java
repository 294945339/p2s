package com.example.modules.goods.service;

//import com.example.modules.goods.domain.GoodsDO;

import cn.hutool.core.util.IdUtil;
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

    public void createGoods(UserDO userDO) {
        String userId = IdUtil.fastUUID();
        String userName = "";
        if (null != userDO) {
            userId = userDO.getId();
            userName = userDO.getName();
        }


    }

    public void useGood(UserDO userDO, GoodsDO goodsDO) {



        /**
         * "arms", "wuqi"
         * "armor", "hujia"
         * "drug", "yaoping"
         * "trump", "fabao"
         */
            //wuqi
        if(GoodsConstant.GOODS_TYPE_ARMS.equalsIgnoreCase(goodsDO.getType())){

        }else if(GoodsConstant.GOODS_ARMOR.equalsIgnoreCase(goodsDO.getType())){

        }else if(GoodsConstant.GOODS_DRUG.equalsIgnoreCase(goodsDO.getType())){

        }else if(GoodsConstant.GOODS_TRUMP.equalsIgnoreCase(goodsDO.getType())){

        }
    }


}
