package org.clever.core;

import lombok.extern.slf4j.Slf4j;
import org.clever.common.utils.spring.SpringContextHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;

/**
 * 应用启动类
 * Created by lzw on 2017/2/25.
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan
//@MapperScan(basePackages = "org.clever.core.mapper")
public class StartApp {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(StartApp.class, args);
        SpringContextHolder.setApplicationContext(ctx);
        log.info("### === " + SpringContextHolder.getApplicationContext());
    }
}
