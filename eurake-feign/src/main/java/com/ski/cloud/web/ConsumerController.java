package com.ski.cloud.web;

import com.ski.cloud.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ski.zhou on 2017/7/13.
 */
@RestController
public class ConsumerController {
    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        System.out.println("-----------");
        return computeClient.add(10, 20);
    }
}
