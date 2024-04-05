package org.ansible.middleware;
import java.util.logging.Level;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;


@Path("/getinputs")
public class FooResource {

    @Inject
    GreetingResource consumer;

    @POST
    public void send(FlightRecord flightRecord) {
    
        consumer.DEFAULT_MESSAGE = flightRecord.origin + " to " +flightRecord.destination;
        System.out.println(consumer.DEFAULT_MESSAGE);

    }


}
