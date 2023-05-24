package ua.vit.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ua.vit.model.HelloWorld;

/**
 * Hello World rest api using resteasy
 *
 * @author Ramesh Fadatare
 *
 */

@Path("hello")
public class HelloWorldResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response helloWorld() {

        HelloWorld helloWorld = new HelloWorld("Hello World !");

        return Response.ok(helloWorld).build();
    }
}