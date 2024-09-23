import java.util.Arrays;

public class Airline{

    String name;
    Flight[] flights;

    public Airline(String name) {
        this.name = name;
    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight new_flight) {
        Flight[] current_flights = this.getFlights();
        Flight[] new_flights = new Flight[current_flights.length+1];

        for(int i = 0; i < new_flights.length; i++){
            new_flights[i] = current_flights[i];
        }

        new_flights[current_flights.length] = new_flight;

        this.flights = new_flights;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                ", flights=" + Arrays.toString(flights) +
                '}';
    }
}
