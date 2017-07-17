package com.ski.cloud.remote;

import org.springframework.stereotype.Component;

/**
 * Created by ski.zhou on 2017/7/17.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote{


    @Override
    public String hello(String name) {
        return "hello " +name+", this messge send failed ";
    }
}
