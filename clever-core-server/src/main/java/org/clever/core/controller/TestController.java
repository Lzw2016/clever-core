package org.clever.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 作者：lzw <br/>
 * 创建时间：2017-09-03 12:18 <br/>
 */
@RestController
public class TestController {

    @GetMapping("/")
    public List<String> test() {
        throw new RuntimeException("123");
    }
}
