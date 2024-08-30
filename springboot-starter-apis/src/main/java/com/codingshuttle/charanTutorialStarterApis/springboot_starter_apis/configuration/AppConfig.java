package com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.configuration;

import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.DB;
import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.DevDB;
import com.codingshuttle.charanTutorialStarterApis.springboot_starter_apis.ProdDB;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    public DB getDevDBBean() {
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    public DB getProdDBBean() {
        return new ProdDB();
    }
}
