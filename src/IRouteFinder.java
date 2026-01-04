import java.util.List;

/**
 * Interface for RouteFinder ADT
 * Provides route finding functionality using BFS algorithm.
 */
public interface IRouteFinder {

    /**
     * Finds the shortest route between two airports using BFS
     * @pre departure is not null
     * @pre arrival is not null
     * @pre departure and arrival exist in the graph
     * @post returns list of airports representing the route
     * @post if no route exists, returns empty list
     * @post route starts with departure and ends with arrival
     * @param departure the starting airport
     * @param arrival the destination airport
     * @return ordered list of airports in the route
     */
    List<Airport> BFS(Airport departure, Airport arrival);

    /**
     * Prints the route as a formatted string of airport codes
     * @pre route is not null
     * @post route is printed to console in format: ATH -> BER -> ...
     * @post if route is empty or single airport, prints "No route found."
     * @param route the list of airports in the route
     */
    void printRoute(List<Airport> route);

    /**
     * Prints detailed information about each leg of the route
     * @pre route is not null
     * @pre legs is "YES" or "NO" (case-sensitive)
     * @post prints each flight segment with seats, distance, and price
     * @post if legs is "YES", adds 20 euro fee per leg to total
     * @post prints total price and distance at the end
     * @param route the list of airports in the route
     * @param legs whether to include leg fees ("YES" or "NO")
     */
    void printDetails(List<Airport> route, String legs);

    /**
     * Prints details of direct flights from a departure airport
     * @pre directFlights is not null
     * @pre legs is "YES" or "NO" (case-sensitive)
     * @post prints each flight with seats, distance, and price
     * @post if legs is "YES", adds 20 euro fee per flight to total
     * @param directFlights list of direct flights
     * @param legs whether to include leg fees ("YES" or "NO")
     */
    void printFromDeparture(List<Flight> directFlights, String legs);

}
