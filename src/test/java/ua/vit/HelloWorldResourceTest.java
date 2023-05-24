package ua.vit;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.junit.Test;

public class HelloWorldResourceTest {

    private static final String FULL_PATH = "http://localhost:8080/HelloWorldRestAPI/restapi/hello";

    @Test
    public void testHelloWorld() {

        final ResteasyClient client = new ResteasyClientBuilder().build();
        final ResteasyWebTarget target = client.target(FULL_PATH);
        String response = target.request().get(String.class);
        System.out.println(response);
    }
}