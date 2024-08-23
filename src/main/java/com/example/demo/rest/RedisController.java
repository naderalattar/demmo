package com.example.demo.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class RedisController {

    @Autowired
    RedisTemplate<String,Object> redisTemplate;

    @GetMapping(path = "/save")
    public String save(){
//        redisTemplate.opsForValue().set("numbers", List.of(1,2,3));
        Map<String,String> map=new HashMap<>();
        map.put("M","20");
        map.put("L","30");
        map.put("XL","40");
//        redisTemplate.opsForHash().putAll("size",map);
        redisTemplate.opsForHash().put("size","XXL","50");
        return "ok";
    }

}
