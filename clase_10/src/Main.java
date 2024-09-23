//Ejercicio 2 – Sistema de Reservas de Vuelo
//
//Objetivo: Modelar un sistema de reservas de vuelo para una aerolínea.
//Descripción: Crea las siguientes clases:
//●	Vuelo: Representa un vuelo con atributos como número de vuelo, origen, destino y capacidad de asientos.
//●	Pasajero: Representa a un pasajero con atributos como nombre, número de pasaporte y asiento asignado.
//●	Aerolinea: Representa la aerolínea que gestiona los vuelos.
//● Implementa los siguientes métodos:
//●	reservar_asiento(): Permite a un pasajero reservar un asiento en un vuelo, verificando primero la disponibilidad de asientos.


public class Main {
    public static void main(String[] args) {

        Airline airline_1 = new Airline("Panamerican Express");
        Passenger passenger_1 = new Passenger("John Locke");
        Flight flight_1 = new Flight(11,"Buenos Aires", "Sidney", airline_1, -1);

        passenger_1.takeFligth(flight_1);

        System.out.println(flight_1.toString());
    }
}



