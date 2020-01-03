package com.example.modules.user.service;

//import com.example.modules.goods.domain.GoodsDO;

import com.example.modules.goods.dao.GoodsDAO;
import com.example.modules.user.dao.UserDAO;
import com.example.modules.user.domain.UserDO;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author: dj
 * @create: 2019-12-21 11:06
 * @description: 动作
 */
@Service
public class BaseActionService {

    @Resource
    private UserDAO userDAO;

    @Resource
    private GoodsDAO goodsDAO;

    @Resource
    private FightingService fightingService;


    public void userAction(UserDO userDo) {

    }

    public void upLevel(UserDO userDo) {

    }

    public void work(UserDO userDo) {

    }

    public void useEquipment(UserDO userDo) {

    }

//    public void addHp(UserDO userDo, GoodsDO goodsDO) {
//
//    }

    public void eat(UserDO userDo) {

    }

    public void flySky(UserDO userDo) {

    }

    public void buy(UserDO me, UserDO you) {

    }

    public void sell(UserDO me, UserDO you) {

    }

//    public void snatch(UserDO me, UserDO you, GoodsDO goodsDO) {
//
//    }

//    @Transactional(rollbackFor = Exception.class)
//    public void give(UserDO me, UserDO you, GoodsDO goodsDO) {
//
//    }

    @Transactional(rollbackFor = Exception.class)
    public void pk(@NotNull UserDO me, @NotNull UserDO you) {
        fightingService.pk(me, you, false);
    }

    @Transactional(rollbackFor = Exception.class)
    public void kill(UserDO me, UserDO you) {
        fightingService.pk(me, you, true);
    }

}





