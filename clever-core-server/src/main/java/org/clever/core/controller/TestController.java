package org.clever.core.controller;

import org.clever.core.entity.Config;
import org.clever.core.mapper.ConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-03 12:18 <br/>
 */
@RestController
public class TestController {

    @Autowired
    private ConfigMapper configMapper;

    @GetMapping("/")
    public Config test() {
        return configMapper.selectByPrimaryKey(399L);
    }
}
