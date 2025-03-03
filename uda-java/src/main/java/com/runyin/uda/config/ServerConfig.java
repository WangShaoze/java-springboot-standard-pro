package com.runyin.uda.config;

/*
 * ClassName: ServerConfig
 * Package: com.runyin.uda.config
 * Description:
 * @Author: 王绍泽
 * @Create: 2025/3/3 - 11:47
 * @Version: v1.0
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "server")
public class ServerConfig {

    private int port;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
