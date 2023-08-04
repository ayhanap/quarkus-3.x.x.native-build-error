package org.acme;

import io.smallrye.mutiny.Multi;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {




    @GET
    @Produces(MediaType.TEXT_PLAIN)
//    @Transactional
    public String hello() {


        return "Hello from RESTEasy Reactive";
    }
}
