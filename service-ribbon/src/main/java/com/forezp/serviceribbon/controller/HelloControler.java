package com.forezp.serviceribbon.controller;

import com.forezp.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zengqiao@bbdservice.com
 * @Date: 2019/3/29 18:26
 * @Description:
 */
@RestController
public class HelloControler {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
