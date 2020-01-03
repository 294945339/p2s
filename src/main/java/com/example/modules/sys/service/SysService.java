package com.example.modules.sys.service;

import com.example.modules.sys.dao.ConfigDAO;
import com.example.modules.sys.domain.ConfigDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: dj
 * @create: 2019-12-17 08:27
 * @description:
 */
@Service
public class SysService {

    @Resource
    private ConfigDAO sysConfigDAO;

    public static AtomicLong SYS_TIME = new AtomicLong(0);

    public void initSysTime() {
        String name = "sysTime";
        List<ConfigDO> list = sysConfigDAO.findByName(name);
        if (0 == list.size()) {
            ConfigDO sysConfigDO = new ConfigDO();
            sysConfigDO.setName(name);
            sysConfigDO.setValue("0");
            sysConfigDAO.save(sysConfigDO);
        } else {
            ConfigDO sysConfigDO = list.get(0);
            String value = sysConfigDO.getValue();
            SYS_TIME = new AtomicLong(Long.parseLong(value));
        }

    }
}
