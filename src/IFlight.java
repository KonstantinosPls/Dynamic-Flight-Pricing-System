/**
 * Interface for Flight ADT
 * Represents a flight between two airports with capacity, pricing, and booking functionality.
 */
public interface IFlight {

    /**
     * Returns the unique flight identifier
     * @pre none
     * @post returns non-null, non-empty String
     * @return the flight ID
     */
    String getId();

    /**
     * Returns the departure airport
     * @pre none
     * @post returns non-null Airport object
     * @return the departure airport
     */
    Airport getDeparture();

    /**
     * Returns the arrival airport
     * @pre none
     * @post returns non-null Airport object
     * @return the arrival airport
     */
    Airport getArrival();

    /**
     * Returns the total seat capacity of the flight
     * @pre none
     * @post returns positive integer
     * @return the total capacity
     */
    int getCapacity();

    /**
     * Returns the number of seats currently booked
     * @pre none
     * @post returns integer >= 0 and <= capacity
     * @return the number of seats taken
     */
    int getSeatsTaken();

    /**
     * Returns the distance of the flight in kilometers
     * @pre setDistance() has been called
     * @post returns non-negative double
     * @return the distance in km
     */
    double getDistance();

    /**
     * Returns the current price of the flight
     * @pre setPrice() has been called
     * @post returns non-negative double
     * @return the price in euros
     */
    double getPrice();

    /**
     * Sets the distance of the flight
     * @pre distance >= 0
     * @post getDistance() returns the set value
     * @param distance the distance in kilometers
     */
    void setDistance(double distance);

    /**
     * Sets the price of the flight
     * @pre price >= 0
     * @post getPrice() returns the set value
     * @param price the price in euros
     */
    void setPrice(double price);

    /**
     * Reserves a seat on the flight if available
     * @pre none
     * @post if seats were available, seatsTaken is incremented by 1
     * @post if no seats available, seatsTaken remains unchanged
     * @return the current number of seats taken after the operation
     */
    int reserveSeat();

}
