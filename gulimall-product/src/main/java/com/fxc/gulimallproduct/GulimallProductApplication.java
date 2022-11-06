package com.fxc.gulimallproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1.导入mybatisplus依赖
 * 2.配置
 *  1.配置数据源
 *      1.导入数据库驱动
 *      2.配置数据源
 *  2.配置mybatis-plus
 *      1.配置MapperScan
 *      2.映射文件位置
 */
@EnableDiscoveryClient
@MapperScan("com.fxc.gulimallproduct.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
