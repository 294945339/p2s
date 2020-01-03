package com.example.modules.sys.service;

import com.example.modules.goods.service.AreaService;
import com.example.modules.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: dj
 * @create: 2019-09-29 09:41
 * @description:
 */
@Slf4j
@Service
public class InitService implements ApplicationRunner {

    @Resource
    private SysService sysService;

    @Resource
    private AreaService areaService;

    @Resource
    private UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        sysService.initSysTime();

        areaService.initArea();

        userService.createUser();

    }

}
