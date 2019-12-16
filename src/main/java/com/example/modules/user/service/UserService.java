package com.example.modules.user.service;

import cn.hutool.core.util.RandomUtil;
import com.example.common.enums.RaceEnum;
import com.example.common.utils.ChineseNameUtil;
import com.example.modules.user.dao.UserDAO;
import com.example.modules.user.domain.UserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: dj
 * @create: 2019-12-16 13:22
 * @description:
 */
@Service
public class UserService {

    @Resource
    UserDAO userDAO;

    public void createUser() {
        UserDO userDO = new UserDO();
        String name = ChineseNameUtil.getName();

        RaceEnum raceEnum = RaceEnum.getEnum(RandomUtil.randomInt(1, 4));
        if (null == raceEnum) {
            raceEnum = RaceEnum.human;
        }

        Integer race = raceEnum.getId();

        Integer sex;

        /**
         * 生命值
         */
        Integer hp;

        /**
         * 年龄
         */
        Integer age;

        /**
         * 剩余生命
         */
        Integer life;

        /**
         * 智力
         */
        Integer spirit;

        /**
         * 体制
         */
        Integer body;

        /**
         * 运气
         */
        Integer luck;

        /**
         * 位置
         */
        Integer position;

        /**
         * 目标
         */
        String target;

        /**
         * 金币
         */
        Integer money;

        RandomUtil.randomInt(50, 100);
    }

}