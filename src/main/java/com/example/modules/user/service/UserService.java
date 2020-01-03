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
        try {
            userDO = userDAO.save(userDO);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userDO;
    }


}