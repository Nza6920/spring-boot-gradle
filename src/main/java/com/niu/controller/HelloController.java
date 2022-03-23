package com.niu.controller;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * HelloController
 *
 * @author [nza]
 * @version 1.0 [2022/03/21 15:37]
 * @createTime [2022/03/21 15:37]
 */
@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    /**
     * helloWorld
     *
     * @param name 名称
     * @return {@link java.util.Map<java.lang.String, java.lang.String>}
     * @author nza
     * @createTime 2022/3/21 15:41
     */
    @GetMapping("/{name}")
    public Map<String, String> helloWorld(@PathVariable String name) {
        Map<String, String> res = Maps.newHashMap();
        res.put("name", name);
        log.info("123");
        return res;
    }
}
