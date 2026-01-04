import java.util.List;

/**
 * Interface for FlightGraph ADT
 * Represents a graph structure storing airports and flight connections.
 * Uses adjacency list representation for efficient route lookups.
 */
public interface IFlightGraph {

    /**
     * Adds an airport to the graph
     * @pre airport is not null
     * @post airport exists in the graph with an empty flight list
     * @post if airport already exists, no change is made
     * @param airport the airport to add
     */
    void addAirport(Airport airport);

    /**
     * Adds a flight connection to the graph
     * @pre flight is not null
     * @pre flight has valid departure and arrival airports
     * @post flight is added to the departure airport's adjacency list
     * @post flight distance and price are calculated and set
     * @param flight the flight to add
     */
    void addFlight(Flight flight);

    /**
     * Returns all flights departing from the given airport
     * @pre airport is not null
     * @post returns non-null List (empty if no flights exist)
     * @param airport the departure airport
     * @return list of flights from this airport
     */
    List<Flight> getFlights(Airport airport);

    /**
     * Prints all flights in the graph with their details
     * @pre none
     * @post all flights are printed to console with formatting
     */
    void printGraph();

}
