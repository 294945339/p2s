package com.example.modules.sys.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: dj
 * @create: 2019-12-17 08:27
 * @description:
 */
@Service
public class SysService {

    public AtomicLong sysTime;

    public SysService() {
        this.sysTime = new AtomicLong(0);
    }

    public long addSysTime() {
        return this.sysTime.addAndGet(1);
    }

    public AtomicLong getSysTime() {
        return sysTime;
    }
}
