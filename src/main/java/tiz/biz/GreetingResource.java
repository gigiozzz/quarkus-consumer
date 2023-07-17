package tiz.biz;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/hello-consumer")
public class GreetingResource {

    @RestClient
    SimpleRESTServiceProvider service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive Consumer";
    }

    @GET
    @Path("/multipart")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String getMultipart() {
        return service. getMultipart().text;
    }

    @GET
    @Path("/multipart-post")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public String getMultipartPost() {
        return service.getMultipartPost("gigi").text;
    }

}
