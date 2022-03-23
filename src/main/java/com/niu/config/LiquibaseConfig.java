package com.niu.config;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * <功能简述>
 *
 * @version 1.0 [2022/03/23 10:03]
 * @author [nza]
 * @createTime [2022/03/23 10:03]
 */
@Configuration
public class LiquibaseConfig {

//    @Bean
//    public SpringLiquibase liquibase(DataSource dataSource) {
//        SpringLiquibase liquibase = new SpringLiquibase();
//        liquibase.setDataSource(dataSource);
//        liquibase.setChangeLog("classpath:liquibase/master.xml");
//        liquibase.setShouldRun(true);
//        return liquibase;
//    }
}
