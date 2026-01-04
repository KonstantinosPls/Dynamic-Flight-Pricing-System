import java.util.*;

public class Data {

    public static Map<String, Airport> loadAirports(){

        Map<String, Airport> airports = new HashMap<>();

        // =========================
        // SOUTHERN EUROPE
        // =========================
        airports.put("ATH", new Airport("ATH", "Athens", 37.9838, 23.7275));
        airports.put("SKG", new Airport("SKG", "Thessaloniki", 40.5197, 22.9709));
        airports.put("MLA", new Airport("MLA", "Malta", 35.8575, 14.4775));
        airports.put("LCA", new Airport("LCA", "Larnaca", 34.8721, 33.6249));
        airports.put("SOF", new Airport("SOF", "Sofia", 42.6880, 23.4142));
        airports.put("FCO", new Airport("FCO", "Rome", 41.8003, 12.2389));
        airports.put("BCN", new Airport("BCN", "Barcelona", 41.2974, 2.0833));
        airports.put("MAD", new Airport("MAD", "Madrid", 40.4722, -3.5608));
        airports.put("LIS", new Airport("LIS", "Lisbon", 38.7742, -9.1342));
        airports.put("ZAG", new Airport("ZAG", "Zagreb", 45.7429, 16.0688));
        airports.put("IST", new Airport("IST", "Istanbul", 41.2753, 28.7519));



        // =========================
        // CENTRAL EUROPE
        // =========================
        airports.put("VIE", new Airport("VIE", "Vienna", 48.1103, 16.5697));
        airports.put("PRG", new Airport("PRG", "Prague", 50.1008, 14.2632));
        airports.put("BUD", new Airport("BUD", "Budapest", 47.4399, 19.2610));
        airports.put("ZRH", new Airport("ZRH", "Zurich", 47.4581, 8.5555));
        airports.put("BER", new Airport("BER", "Berlin", 52.3667, 13.5033));
        airports.put("MUC", new Airport("MUC", "Munich", 48.3538, 11.7861));


        // =========================
        // NORTHERN EUROPE
        // =========================
        airports.put("CPH", new Airport("CPH", "Copenhagen", 55.6181, 12.6560));
        airports.put("ARN", new Airport("ARN", "Stockholm", 59.6498, 17.9236));
        airports.put("OSL", new Airport("OSL", "Oslo", 60.1976, 11.1004));
        airports.put("HEL", new Airport("HEL", "Helsinki", 60.3172, 24.9633));
        airports.put("RIX", new Airport("RIX", "Riga", 56.9236, 23.9711));


        // =========================
        // WESTERN EUROPE
        // =========================
        airports.put("LHR", new Airport("LHR", "London", 51.47, -0.4543));
        airports.put("MAN", new Airport("MAN", "Manchester", 53.3537, -2.2749));
        airports.put("EDI", new Airport("EDI", "Edinburgh", 55.9500, -3.3725));
        airports.put("CDG", new Airport("CDG", "Paris", 49.0097, 2.5479));
        airports.put("BRU", new Airport("BRU", "Brussels", 50.9014, 4.4844));
        airports.put("AMS", new Airport("AMS", "Amsterdam", 52.3105, 4.7683));
        airports.put("DUB", new Airport("DUB", "Dublin", 53.4273, -6.2436));


        // =========================
        // EASTERN EUROPE
        // =========================
        airports.put("WAW", new Airport("WAW", "Warsaw", 52.2297, 21.0122));
        airports.put("KRK", new Airport("KRK", "Krakow", 50.0770, 19.7848));
        airports.put("KEF", new Airport("KEF", "Reykjavik", 63.9850, -22.6056));


        return airports;
    }


    public static List<Flight> loadflights(Map <String, Airport> airports){

        List<Flight> hotFlights = new ArrayList<>();

        // =========================
        // SOUTHERN EUROPE ROUTES
        // =========================
        hotFlights.add(new Flight("FL01", airports.get("ATH"), airports.get("SKG")));
        hotFlights.add(new Flight("FL02", airports.get("ATH"), airports.get("IST")));
        hotFlights.add(new Flight("FL03", airports.get("ATH"), airports.get("SOF")));
        hotFlights.add(new Flight("FL04", airports.get("BCN"), airports.get("MAD")));
        hotFlights.add(new Flight("FL05", airports.get("MAD"), airports.get("LIS")));
        hotFlights.add(new Flight("FL06", airports.get("FCO"), airports.get("ZAG")));
        hotFlights.add(new Flight("FL07", airports.get("ATH"), airports.get("LCA")));
        hotFlights.add(new Flight("FL08", airports.get("SKG"), airports.get("FCO")));
        hotFlights.add(new Flight("FL09", airports.get("MLA"), airports.get("BCN")));
        hotFlights.add(new Flight("FL10", airports.get("LIS"), airports.get("ATH")));
        hotFlights.add(new Flight("FL11", airports.get("LCA"), airports.get("MAD")));


        // =========================
        // CENTRAL EUROPE ROUTES
        // =========================
        hotFlights.add(new Flight("FL21", airports.get("PRG"), airports.get("VIE")));
        hotFlights.add(new Flight("FL22", airports.get("VIE"), airports.get("BUD")));
        hotFlights.add(new Flight("FL23", airports.get("BUD"), airports.get("MUC")));
        hotFlights.add(new Flight("FL24", airports.get("ZRH"), airports.get("BER")));
        hotFlights.add(new Flight("FL25", airports.get("BER"), airports.get("AMS")));
        hotFlights.add(new Flight("FL26", airports.get("MUC"), airports.get("VIE")));
        hotFlights.add(new Flight("FL27", airports.get("BER"), airports.get("PRG")));
        hotFlights.add(new Flight("FL28", airports.get("ZRH"), airports.get("BUD")));
        hotFlights.add(new Flight("FL29", airports.get("PRG"), airports.get("MUC")));


        // =========================
        // NORTHERN EUROPE ROUTES
        // =========================
        hotFlights.add(new Flight("FL41", airports.get("ARN"), airports.get("OSL")));
        hotFlights.add(new Flight("FL42", airports.get("OSL"), airports.get("HEL")));
        hotFlights.add(new Flight("FL43", airports.get("HEL"), airports.get("CPH")));
        hotFlights.add(new Flight("FL44", airports.get("RIX"), airports.get("ARN")));
        hotFlights.add(new Flight("FL45", airports.get("KEF"), airports.get("OSL")));
        hotFlights.add(new Flight("FL46", airports.get("HEL"), airports.get("ARN")));
        hotFlights.add(new Flight("FL47", airports.get("CPH"), airports.get("RIX")));
        hotFlights.add(new Flight("FL48", airports.get("OSL"), airports.get("CPH")));
        hotFlights.add(new Flight("FL49", airports.get("KEF"), airports.get("HEL")));


        // =========================
        // WESTERN EUROPE ROUTES
        // =========================
        hotFlights.add(new Flight("FL61", airports.get("AMS"), airports.get("BRU")));
        hotFlights.add(new Flight("FL62", airports.get("BRU"), airports.get("CDG")));
        hotFlights.add(new Flight("FL63", airports.get("CDG"), airports.get("ZRH")));
        hotFlights.add(new Flight("FL64", airports.get("LHR"), airports.get("MAN")));
        hotFlights.add(new Flight("FL65", airports.get("MAN"), airports.get("EDI")));
        hotFlights.add(new Flight("FL66", airports.get("EDI"), airports.get("AMS")));
        hotFlights.add(new Flight("FL67", airports.get("DUB"), airports.get("LHR")));
        hotFlights.add(new Flight("FL68", airports.get("LHR"), airports.get("CDG")));
        hotFlights.add(new Flight("FL69", airports.get("AMS"), airports.get("MAN")));
        hotFlights.add(new Flight("FL70", airports.get("BRU"), airports.get("LHR")));
        hotFlights.add(new Flight("FL71", airports.get("EDI"), airports.get("AMS")));


        // =========================
        // EASTERN EUROPE ROUTES
        // =========================
        hotFlights.add(new Flight("FL81", airports.get("WAW"), airports.get("KRK")));
        hotFlights.add(new Flight("FL82", airports.get("KRK"), airports.get("PRG")));
        hotFlights.add(new Flight("FL83", airports.get("SOF"), airports.get("BUD")));
        hotFlights.add(new Flight("FL84", airports.get("WAW"), airports.get("BUD")));
        hotFlights.add(new Flight("FL85", airports.get("KRK"), airports.get("SOF")));
        hotFlights.add(new Flight("FL86", airports.get("SOF"), airports.get("WAW")));
        hotFlights.add(new Flight("FL87", airports.get("RIX"), airports.get("KRK")));


        // =========================
        // INTERNATIONAL EUROPE ROUTES
        // =========================
        hotFlights.add(new Flight("FL96", airports.get("ATH"), airports.get("BCN")));
        hotFlights.add(new Flight("FL97", airports.get("ATH"), airports.get("MAD")));
        hotFlights.add(new Flight("FL98", airports.get("ATH"), airports.get("DUB")));
        hotFlights.add(new Flight("FL99", airports.get("ATH"), airports.get("BER")));
        hotFlights.add(new Flight("FL100", airports.get("BCN"), airports.get("AMS")));
        hotFlights.add(new Flight("FL101", airports.get("MAD"), airports.get("CDG")));
        hotFlights.add(new Flight("FL102", airports.get("FCO"), airports.get("CPH")));
        hotFlights.add(new Flight("FL103", airports.get("IST"), airports.get("PRG")));
        hotFlights.add(new Flight("FL104", airports.get("CPH"), airports.get("AMS")));
        hotFlights.add(new Flight("FL105", airports.get("OSL"), airports.get("ZRH")));
        hotFlights.add(new Flight("FL106", airports.get("ARN"), airports.get("LHR")));
        hotFlights.add(new Flight("FL107", airports.get("LHR"), airports.get("BER")));
        hotFlights.add(new Flight("FL108", airports.get("MAN"), airports.get("VIE")));
        hotFlights.add(new Flight("FL109", airports.get("EDI"), airports.get("BRU")));
        hotFlights.add(new Flight("FL110", airports.get("WAW"), airports.get("HEL")));
        hotFlights.add(new Flight("FL111", airports.get("KRK"), airports.get("OSL")));
        hotFlights.add(new Flight("FL112", airports.get("RIX"), airports.get("MUC")));
        hotFlights.add(new Flight("FL113", airports.get("ZAG"), airports.get("LIS")));
        hotFlights.add(new Flight("FL114", airports.get("VIE"), airports.get("MUC")));
        hotFlights.add(new Flight("FL115", airports.get("AMS"), airports.get("LIS")));


        // =========================
        // REVERSED FLIGHTS
        // =========================
        hotFlights.add(new Flight("FL164", airports.get("BCN"), airports.get("ATH")));
        hotFlights.add(new Flight("FL165", airports.get("MAD"), airports.get("ATH")));
        hotFlights.add(new Flight("FL166", airports.get("DUB"), airports.get("ATH")));
        hotFlights.add(new Flight("FL167", airports.get("BER"), airports.get("ATH")));
        hotFlights.add(new Flight("FL168", airports.get("AMS"), airports.get("BCN")));
        hotFlights.add(new Flight("FL169", airports.get("CDG"), airports.get("MAD")));
        hotFlights.add(new Flight("FL170", airports.get("CPH"), airports.get("FCO")));
        hotFlights.add(new Flight("FL171", airports.get("PRG"), airports.get("IST")));
        hotFlights.add(new Flight("FL172", airports.get("AMS"), airports.get("CPH")));
        hotFlights.add(new Flight("FL173", airports.get("ZRH"), airports.get("OSL")));
        hotFlights.add(new Flight("FL174", airports.get("LHR"), airports.get("ARN")));
        hotFlights.add(new Flight("FL175", airports.get("BER"), airports.get("LHR")));
        hotFlights.add(new Flight("FL176", airports.get("VIE"), airports.get("MAN")));
        hotFlights.add(new Flight("FL177", airports.get("BRU"), airports.get("EDI")));
        hotFlights.add(new Flight("FL178", airports.get("HEL"), airports.get("WAW")));
        hotFlights.add(new Flight("FL179", airports.get("OSL"), airports.get("KRK")));
        hotFlights.add(new Flight("FL180", airports.get("MUC"), airports.get("RIX")));
        hotFlights.add(new Flight("FL181", airports.get("LIS"), airports.get("BCN")));
        hotFlights.add(new Flight("FL182", airports.get("DUB"), airports.get("WAW")));
        hotFlights.add(new Flight("FL183", airports.get("DUB"), airports.get("RIX")));
        hotFlights.add(new Flight("FL184", airports.get("WAW"), airports.get("MUC")));
        hotFlights.add(new Flight("FL185", airports.get("PRG"), airports.get("LIS")));

        return hotFlights;

    }
}
