# study-jetcache
  ```
    JetCache提供的核心能力:
        1.提供统一的，类似jsr-107风格的API访问Cache，并可通过注解创建并配置Cache实例
        2.通过注解实现声明式的方法缓存，支持TTL和两级缓存
        3.分布式缓存自动刷新
        4.分布式多级缓存场景，缓存更新后，自动让所有Local cache失效
        5.支持一步CacheAPI
        6.Spring boot支持
        7.Key的生成策略和Value的序列化策略是可以定制的的
        8.针对所有Cache实例和方法缓存自动统计
  ```
#扩展性
```
  1.通过分析，很方便的扩展具体的缓存实现
  2.对于分布式通知和缓存统计都是很容器扩展
  3.灵活的Cache创建方式
```