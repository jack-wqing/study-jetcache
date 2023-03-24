package com.bj58.chr.study.cache.config;

import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.context.annotation.Configuration;

/**
 * 如果是spring 环境没有，spi机制：
 *  需要手动显示 com.alicp.jetcache.autoconfigure.JetCacheAutoConfiguration 这个配置类的导入
 */
@Configuration
@EnableMethodCache(basePackages = {"com.bj58.chr.study.cache.service"})
public class JetcacheConfig {

}
