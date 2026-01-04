/**
 * Interface for Airport ADT
 * Represents an airport with geographic coordinates for distance calculations.
 */
public interface IAirport {

    /**
     * Returns the unique airport code (e.g., "ATH", "BER")
     * @pre none
     * @post returns non-null, non-empty String
     * @return the airport code
     */
    String getCityCode();

    /**
     * Returns the city name where the airport is located
     * @pre none
     * @post returns non-null String
     * @return the city name
     */
    String getCity();

    /**
     * Returns the latitude coordinate of the airport
     * @pre none
     * @post returns value between -90 and 90
     * @return latitude in degrees
     */
    double getLatitude();

    /**
     * Returns the longitude coordinate of the airport
     * @pre none
     * @post returns value between -180 and 180
     * @return longitude in degrees
     */
    double getLongitude();

}
