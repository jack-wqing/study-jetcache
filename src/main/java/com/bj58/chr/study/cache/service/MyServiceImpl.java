package com.bj58.chr.study.cache.service;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.CacheManager;
import com.alicp.jetcache.anno.CreateCache;
import com.alicp.jetcache.template.QuickConfig;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Duration;

@Service
public class MyServiceImpl implements MyService, InitializingBean {

    @Resource
    private UserService userService;
    @Resource
    private CacheManager cacheManager;

    // 手动使用创建缓存，需要手动指定Loader 和 Refresh刷新策略，才可以支持缺失加载和定时刷新
    //@CreateCache
    private Cache<String, String> orderCache;


    @Override
    public void afterPropertiesSet() throws Exception {
        QuickConfig quickConfig = QuickConfig.newBuilder("orderCache")
                .expire(Duration.ofSeconds(100))
                .build();
        orderCache = cacheManager.getOrCreateCache(quickConfig);
    }

    @Override
    public void createCacheDemo() {
        orderCache.put("K1", "V1");
        System.out.println("get from orderCache:" + orderCache.get("K1"));
    }

    @Override
    public void cachedDemo() {
        userService.loadUser(100L);
        userService.loadUser(100L);
    }

}
