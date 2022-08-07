import java.util.ArrayList;

public class Flight {
private ArrayList<Pilot> pilots;
private ArrayList<CabinCrewMember> cabinCrewMembers;
private ArrayList<Passenger> passengers;
Plane plane;
private String flightNumber;
private String destination;
private String departureAirport;
private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
    public int getPassengersNumber(){
        return passengers.size();
    }
    public boolean isSpace(){
        return plane.planeType.getCapacity() > getPassengersNumber();
    }
    public int getNumberOfRemainingSeats(){
        if(isSpace()){
            return plane.planeType.getCapacity() - getPassengersNumber();
        }else{
            return 0;
        }
    }
    public void checkIn(Passenger passenger){
        if(isSpace()){
            passengers.add(passenger);
        }
    }
}