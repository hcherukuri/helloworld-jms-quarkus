package org.ansible.middleware;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;


@Path("/getinputs")
public class FooResource {

    @Inject
    GreetingResource consumer;

    @POST
    public void send(FlightRecord flightRecord) {
    
        String message = flightRecord.origin + " to " +flightRecord.destination;
        // System.out.println(message);
        consumer.hello(message);

    }


}
