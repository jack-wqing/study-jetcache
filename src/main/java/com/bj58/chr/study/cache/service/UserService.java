package com.bj58.chr.study.cache.service;

import com.alicp.jetcache.anno.CacheInvalidate;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CacheUpdate;
import com.alicp.jetcache.anno.Cached;
import com.bj58.chr.study.cache.domain.User;

import java.util.concurrent.TimeUnit;

public interface UserService {

    @Cached(name = "loadUser", expire = 100, timeUnit = TimeUnit.SECONDS)
    User loadUser(Long userId);

    @Cached(name = "cachedTest", cacheType = CacheType.BOTH, syncLocal = true, expire = 10, localExpire = 10, timeUnit = TimeUnit.MINUTES)
    User cachedTest(String opType, Long userId);

    @CacheUpdate(name = "cachedTest", value = "#result")
    User updateTest(String opType, Long userId);

    @CacheInvalidate(name = "cachedTest")
    User invalidateTest(String opType, Long userId);

}


