public class Flight{
    int flightCode;
    String origin;
    String destiny;
    int capacity;

    Airline airline;
    Passenger passenger;

    public Flight(int flightCode, String origin, String destiny, Airline airline, int capacity) {
        this.flightCode = flightCode;
        this.origin = origin;
        this.destiny = destiny;
        this.airline = airline;
        this.capacity = capacity;
    }

    public void setPassenger(Passenger passenger) {
        if(this.capacity>= 1){
            this.passenger = passenger;
            this.capacity--;
        } else  {
            System.out.println("Max Capacity Reached");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public Airline getAirline() {
        return airline;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightCode=" + flightCode +
                ", origin='" + origin + '\'' +
                ", destiny='" + destiny + '\'' +
                ", capacity=" + capacity +
                ", airline=" + airline +
                ", passenger=" + passenger +
                '}';
    }
}