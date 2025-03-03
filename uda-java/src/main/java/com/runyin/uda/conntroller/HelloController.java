package com.runyin.uda.conntroller;

/*
 * ClassName: HelloController
 * Package: com.runyin.uda.conntroller
 * Description:
 * @Author: 王绍泽
 * @Create: 2025/3/3 - 10:34
 * @Version: v1.0
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "this is Index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
