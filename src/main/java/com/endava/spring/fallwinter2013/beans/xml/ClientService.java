package com.endava.spring.fallwinter2013.beans.xml;

/**
 * Created with IntelliJ IDEA.
 * User: Ionut Andonescu
 * Date: 10/8/13
 * Time: 11:55 PM
 */
public class ClientService {

    private static ClientService clientService = new ClientService();

    private ClientService() {

    }

    public static ClientService createInstance() {
        return clientService;
    }
}
