package org.clever.core;

import lombok.extern.slf4j.Slf4j;
import org.clever.common.utils.spring.SpringContextHolder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.TimeZone;

/**
 * 应用启动类
 * Created by lzw on 2017/2/25.
 */
@Slf4j
@EnableJdbcHttpSession(maxInactiveIntervalInSeconds = 60 * 10)
@EnableFeignClients
@EnableEurekaClient
@EnableTransactionManagement
@MapperScan(basePackages = "org.clever.core.mapper")
@SpringBootApplication(scanBasePackages = {"org.clever"})
public class CoreStartApp {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
        ApplicationContext ctx = SpringApplication.run(CoreStartApp.class, args);
        SpringContextHolder.setApplicationContext(ctx);
        log.info("### 服务启动完成 === " + SpringContextHolder.getApplicationContext());
    }
}
