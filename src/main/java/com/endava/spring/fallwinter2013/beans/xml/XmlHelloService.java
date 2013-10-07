package com.endava.spring.fallwinter2013.beans.xml;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class XmlHelloService {


    public String sayHello() {
        return "Hello world!";
    }
}
