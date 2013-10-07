package com.endava.spring.fallwinter2013.beans.java;

import com.endava.spring.fallwinter2013.beans.java.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Ionut Andonescu
 * Date: 10/7/13
 * Time: 11:40 PM
 */
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(MainConfig.class);

        JavaHelloService javaHelloService = ctx.getBean(JavaHelloService.class);
        System.out.println(javaHelloService.sayHello());
    }
}
