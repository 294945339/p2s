package com.example.modules.goods.service;

//import com.example.modules.goods.domain.GoodsDO;
import com.example.modules.user.domain.UserDO;
import org.springframework.stereotype.Service;

/**
 * @author: dj
 * @create: 2019-12-21 16:12
 * @description:
 */
@Service
public class GoodsService {

    public void createGoods(UserDO userDO) {
        Long userId = 0L;
        String userName = "";
        if (null != userDO) {
            userId = userDO.getId();
            userName = userDO.getName();
        }


    }

    public void use() {

    }



}
