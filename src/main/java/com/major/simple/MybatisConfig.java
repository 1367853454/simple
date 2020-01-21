package com.major.simple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.major.simple.mapper")
public class MybatisConfig {

}
