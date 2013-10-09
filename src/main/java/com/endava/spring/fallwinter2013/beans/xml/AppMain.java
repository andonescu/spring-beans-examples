package com.endava.spring.fallwinter2013.beans.xml
        ;

import com.endava.spring.fallwinter2013.beans.xml.di.ExampleBean;
import com.endava.spring.fallwinter2013.beans.xml.di.SimpleMovieLister;
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


        ClientService clientService = context.getBean(ClientService.class);
        System.out.println(clientService);

        ProducerService producerService = context.getBean(ProducerService.class);
        System.out.println(producerService);

        DefaultServiceLocator serviceLocator = context.getBean(DefaultServiceLocator.class);
        System.out.println(serviceLocator);


//        di
        SimpleMovieLister simpleMovieLister = (SimpleMovieLister) context.getBean("simpleMovieLister");
        System.out.println(simpleMovieLister);


        ExampleBean exampleBean = context.getBean(ExampleBean.class);
        System.out.println(exampleBean);

    }
}
