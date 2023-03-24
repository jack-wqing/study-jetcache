package com.bj58.chr.study.cache.service;

import com.bj58.chr.study.cache.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public User loadUser(Long userId) {
        System.out.println("load user: " + userId);
        User user = new User();
        user.setId(userId);
        user.setUserName("花无缺");
        return user;
    }

    @Override
    public User cachedTest(String opType, Long userId) {
        System.out.println("cachedTest opType: " + opType + "， userId:" + userId);
        User user = new User();
        user.setId(userId);
        user.setUserName("cached");
        return user;
    }

    @Override
    public User updateTest(String opType, Long userId) {
        System.out.println("updateTest opType: " + opType + "， userId:" + userId);
        User user = new User();
        user.setId(userId);
        user.setUserName("update");
        return user;
    }

    @Override
    public User invalidateTest(String opType, Long userId) {
        System.out.println("invalidateTest invalidate: " + opType + "， userId:" + userId);
        return new User();
    }

}
