package com.example.modules.user.service;

import cn.hutool.core.util.RandomUtil;
import com.example.common.enums.RaceEnum;
import com.example.common.utils.ChineseNameUtil;
import com.example.modules.sys.service.SysService;
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
    private UserDAO userDAO;

    @Resource
    private SysService sysService;

    public UserDO createUser() {
        UserDO userDO = new UserDO();
        userDO.setSysTime(sysService.getSysTime().get());
        String name = ChineseNameUtil.getName();
        userDO.setName(name);
        RaceEnum raceEnum = RaceEnum.getEnum(RandomUtil.randomInt(1, 4));
        if (null == raceEnum) {
            raceEnum = RaceEnum.human;
        }

        int race = raceEnum.getId();
        userDO.setRace(race);

        int sex = 1;
        userDO.setSex(sex);

        int maxHp = RandomUtil.randomInt(raceEnum.getMinHp(), raceEnum.getMaxHp());
        userDO.setMaxHp(maxHp);
        userDO.setHp(maxHp);

        int age = RandomUtil.randomInt(1, 19);
        userDO.setAge(age);

        int life = RandomUtil.randomInt(raceEnum.getMinLife(), raceEnum.getMaxLife());
        userDO.setLife(life);

        int spirit = RandomUtil.randomInt(1, 100);
        userDO.setSpirit(spirit);

        int body = RandomUtil.randomInt(1, 100);
        userDO.setBody(body);

        int luck = RandomUtil.randomInt(1, 60);
        userDO.setLuck(luck);

        int position = RandomUtil.randomInt(1, 10);
        userDO.setPosition(position);

        String target;

        int money = RandomUtil.randomInt(100, 1000);
        userDO.setMoney(money);

        try {
            userDO = userDAO.save(userDO);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userDO;
    }

}