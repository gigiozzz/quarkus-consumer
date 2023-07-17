package tiz.biz;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/hello")
@RegisterRestClient(baseUri = "http://localhost:8080")
public interface SimpleRESTServiceProvider {

    @GET
    String getHello();

    @GET
    @Path("/multipart")
    @Produces(MediaType.MULTIPART_FORM_DATA)
    MultipartDto getMultipart();

    @POST
    @Path("/multipart-post")
    @Produces(MediaType.MULTIPART_FORM_DATA)
    @Consumes(MediaType.APPLICATION_JSON)
    MultipartDto getMultipartPost(String myName);

}
