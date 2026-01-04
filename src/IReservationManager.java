/**
 * Interface for ReservationManager ADT
 * Manages flight reservations and updates pricing based on seat availability.
 */
public interface IReservationManager {

    /**
     * Reserves a seat on the specified flight
     * @pre flightId is not null
     * @post if flight exists and has available seats, a seat is reserved
     * @post flight price is recalculated based on new seat availability
     * @post if flight does not exist, no action is taken
     * @param flightId the unique identifier of the flight to reserve
     */
    void reserve(String flightId);

}
