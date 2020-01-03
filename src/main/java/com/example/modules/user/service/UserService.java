package com.example.modules.user.service;

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

    public UserDO createUser() {
        UserDO userDO = new UserDO();
        try {
            userDO = userDAO.save(userDO);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return userDO;
    }


}