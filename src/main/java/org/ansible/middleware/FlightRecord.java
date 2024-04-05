package org.ansible.middleware;

public class FlightRecord {
    public String origin;
    public String destination;

    public FlightRecord() {
    }

    public FlightRecord(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

}
