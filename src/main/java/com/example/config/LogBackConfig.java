package com.example.config;

import ch.qos.logback.core.PropertyDefinerBase;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.system.ApplicationHome;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author cjl
 * @create 2019/9/29
 */
@Slf4j
public class LogBackConfig extends PropertyDefinerBase {


    @Override
    public String getPropertyValue() {
        return getContent();
    }

    @NotNull
    private String getContent() {
        String pattern = "[{1}] - [{2}] - [{3}]";
        String localIp = null;
        try {
            localIp = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.error("fail to get ip...", e);
        }
        ApplicationHome applicationHome = new ApplicationHome(getClass());
        File jarFile = applicationHome.getSource();
        String jarPath = jarFile.getParent();
        jarPath = jarPath.replace("\\", "/");
        String jarName = jarFile.getName();
        pattern = pattern.replace("{1}", localIp);
        pattern = pattern.replace("{2}",jarPath);
        pattern = pattern.replace("{3}",jarName);
        return pattern;
    }
}
