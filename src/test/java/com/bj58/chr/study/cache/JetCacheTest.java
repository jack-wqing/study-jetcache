package com.bj58.chr.study.cache;

import com.alicp.jetcache.CacheManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
@Slf4j
public class JetCacheTest {

    /**
     * 只有使用：jetcache-autoconfigure 才会配置cacheManager
     */
    @Resource
    private CacheManager cacheManager;

    @Test
    public void testProgramCache() throws InterruptedException {

    }


}
