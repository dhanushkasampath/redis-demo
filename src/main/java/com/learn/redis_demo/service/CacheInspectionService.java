package com.learn.redis_demo.service;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CacheInspectionService {

    private final CacheManager cacheManager;

    public CacheInspectionService(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    public String printCacheContents(String cacheName){
        Cache cache = cacheManager.getCache(cacheName);
        String content = "";
        if(Objects.nonNull(cache)){
            content = "Cache contents: " + Objects.requireNonNull(cache.getNativeCache());
        } else {
            content = "No such cache: " + cacheName;
        }
        System.out.println(content);
        return content;
    }
}
