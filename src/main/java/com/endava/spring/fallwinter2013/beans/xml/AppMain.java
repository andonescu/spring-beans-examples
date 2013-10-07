package com.endava.spring.fallwinter2013.beans.xml
        ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Ionut Andonescu
 * Date: 10/7/13
 * Time: 11:29 PM
 */
public class AppMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring-config.xml");
        XmlHelloService helloService = context.getBean(XmlHelloService.class);

        System.out.println(helloService.sayHello());
    }
}
