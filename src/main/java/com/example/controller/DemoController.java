package com.example.controller;

import com.example.common.MyWebSocket;
import com.example.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Flower on 2017/5/12.
 */
@RestController
@EnableAutoConfiguration
public class DemoController {
    @Autowired
    UserService userService;
    private static final Logger LOG = Logger.getLogger(DemoController.class);
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String index(){
        return "This means deploy right";
    }

    @RequestMapping(value="/Test",method = RequestMethod.GET)
    public String GetTestword(){
        LOG.info("啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦啦");
        return userService.GetTestword();

    }


}
