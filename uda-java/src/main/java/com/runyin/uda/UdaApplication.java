package com.runyin.uda;

/*
 * ClassName: UdaApplication
 * Package: com.runyin.uda
 * Description:
 * @Author: 王绍泽
 * @Create: 2025/3/3 - 10:36
 * @Version: v1.0
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.demo", "com.another.package"}) // 手动指定扫描的包
@ComponentScan(basePackages = {"com.runyin.uda" }) // 手动指定扫描的包
public class UdaApplication {
    public static void main(String[] args) {
        SpringApplication.run(UdaApplication.class, args);
    }
}
