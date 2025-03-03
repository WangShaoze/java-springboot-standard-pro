package com.runyin.uda.config;

/*
 * ClassName: MyConfig
 * Package: com.runyin.uda.config
 * Description:
 * @Author: 王绍泽
 * @Create: 2025/3/3 - 11:46
 * @Version: v1.0
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyConfig {

    @Value("${server.port}")
    private int serverPort;

    public int getServerPort() {
        return serverPort;
    }
}
