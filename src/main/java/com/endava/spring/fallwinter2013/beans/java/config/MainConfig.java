package com.endava.spring.fallwinter2013.beans.java.config;

import com.endava.spring.fallwinter2013.beans.java.JavaHelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: Ionut Andonescu
 * Date: 10/7/13
 * Time: 11:38 PM
 */
@Configuration
@ComponentScan(basePackages = "com.endava.spring.fallwinter2013.beans.java", excludeFilters = {@ComponentScan.Filter(Configuration.class)})
public class MainConfig {

    @Bean
    public JavaHelloService getJavaHelloServiceBean() {
        return new JavaHelloService();
    }

}
