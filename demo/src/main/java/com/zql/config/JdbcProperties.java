package com.zql.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangqianlin
 * @create 2020-04-10 21:33
 */
@Data
@Component
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    String url;
    String driverClassName;
    String username;
    String password;
}

