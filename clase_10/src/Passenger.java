public class Passenger{
    String name;
    int passportCode;
    String sitCode;

    public Passenger(String name) {
        this.name = name;
    }

    public void takeFligth(Flight flight){
        flight.setPassenger(this);
        this.sitCode = String.valueOf(flight.getCapacity());

        Airline airline = flight.getAirline();
        airline.setFlights(flight);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", passportCode=" + passportCode +
                ", sitCode='" + sitCode + '\'' +
                '}';
    }
}