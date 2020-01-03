package com.example.modules.user.service;

import com.example.modules.user.dao.UserDAO;
import com.example.modules.user.domain.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author: dj
 * @create: 2019-12-21 14:18
 * @description:
 */
@Slf4j
@Service
public class FightingService {

    @Resource
    private UserDAO userDAO;

    public String pk(@NotNull UserDO me, @NotNull UserDO you, boolean isKill) {


        int meSeed = me.getSpeed();
        int youSeed = you.getSpeed();

        int meHp = me.getHp();
        int youHp = you.getHp();
        boolean flag = true;
        while (flag) {
            if (meHp <= 0 || youHp <= 0) {
                flag = false;
            }
            if (meSeed > youSeed) {
                this.attack(me, you, isKill);
            } else {
                this.attack(you, me, isKill);
            }
        }
        userDAO.save(me);
        userDAO.save(you);
        return null;
    }

    public void attack(@NotNull UserDO me, @NotNull UserDO you, boolean isKill) {
        int meHp = me.getHp();
        int youHp = you.getHp();

        int meHurt = me.getHurt();
        int youHurt = you.getHurt();

        youHp = youHp - meHurt;
        if (youHp <= 0) {
            you.setHp(0);
            if (isKill) {
                you.setStatus(0);
            } else {
                me.setStatus(2);
            }
            return;
        }

        meHp = meHp - youHurt;
        if (meHp <= 0) {
            me.setHp(0);
            if (isKill) {
                me.setStatus(0);
            } else {
                me.setStatus(2);
            }
            return;
        }

        me.setHp(meHp);
        you.setHp(youHp);

    }

}
