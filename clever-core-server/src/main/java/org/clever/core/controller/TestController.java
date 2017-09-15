package org.clever.core.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.clever.common.server.controller.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 作者：lizw <br/>
 * 创建时间：2017/9/15 13:59 <br/>
 */
@Slf4j
@Api(description = "测试Controller")
@RequestMapping("/test")
@RestController
public class TestController extends BaseController {

    @ApiOperation("Spring Session")
    @GetMapping("/springSession" + JSON_SUFFIX)
    public Map<String, Object> springSession(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap<>();
        HttpSession session = request.getSession();
//        for (int i = 0; i < 10; i++) {
//            session.setAttribute(String.format("name%1$s", i), String.format("value%1$s", i));
//        }
        session.setAttribute("springSession", "Spring Session 测试123456");
        log.info("### springSession -> {}", session.getAttribute("springSession"));
        map.put("sessionClass", session.getClass().getName());
        map.put("springSession", session.getAttribute("springSession"));
        return map;
    }

}
