package com.example.modules.user.service;

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
    private UserDO userDO;

    public void pk(@NotNull UserDO me, @NotNull UserDO you) {



    }

    @Transactional(rollbackFor = Exception.class)
    public void kill() {

    }

}
