package com.endava.spring.fallwinter2013.beans.xml;

/**
 * Created with IntelliJ IDEA.
 * User: Ionut Andonescu
 * Date: 10/9/13
 * Time: 12:04 AM
 */
public class DefaultServiceLocator {

    private static ProducerService producerService = new ProducerServiceImpl();

    private DefaultServiceLocator() {
//    	throw new AssertionError(); 
    }

    public ProducerService createProducerServiceInstance() {
        return producerService;
    }

}
