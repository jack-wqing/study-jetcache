package com.bj58.chr.study.cache.controller;

import com.alicp.jetcache.anno.CacheInvalidate;
import com.alicp.jetcache.anno.CacheUpdate;
import com.bj58.chr.study.cache.domain.User;
import com.bj58.chr.study.cache.service.MyService;
import com.bj58.chr.study.cache.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    public MyService myService;

    @Resource
    public UserService userService;

    @GetMapping(value = "/ccd")
    public String createCacheDemo(){
        myService.createCacheDemo();
        return "ok";
    }
    @GetMapping(value = "/cd")
    public String cacheDemo(){
        myService.cachedDemo();
        return "ok";
    }

    @PostMapping(value = "/cache/cached")
    public User cachedTest(String opType, Long userId){
        User user = userService.cachedTest(opType, userId);
        return user;
    }
    @PostMapping(value = "/cache/update")
    public User updateTest(String opType, Long userId){
        User user = userService.updateTest(opType, userId);
        return user;
    }
    @PostMapping(value = "/cache/invalidate")
    public User invalidateTest(String opType, Long userId){
        User user = userService.invalidateTest(opType, userId);
        return user;
    }

}
