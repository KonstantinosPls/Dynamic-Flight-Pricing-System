import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Menu {



    public static void menu(Map <String, Airport> airports, RouteFinder finder){
        Scanner read = new Scanner(System.in);

        FlightGraph graph = new FlightGraph();
        List<Flight> hotFlights = Data.loadflights(airports);
        for (Airport a : airports.values()){
            graph.addAirport(a);
        }
        for (Flight f : hotFlights){
            graph.addFlight(f);
        }

        boolean loop = true;
        while(loop) {

            int exit;
            while (true) {
                System.out.println("\n========Menu========\n");
                System.out.println("1. Specific departure and arrival destinations.");
                System.out.println("2. Print all available flights.");
                System.out.println("0. Exit.");
                System.out.print("Your option: ");
                try {
                    exit = read.nextInt();
                    read.nextLine();
                    if (exit >= 0 && exit <= 2)
                        break;
                    else
                        System.out.println();
                        System.out.println("Choose only a number between 0-2!");

                    System.out.println();
                } catch (Exception e) {
                    System.out.println();
                    System.out.println("Choose only a number between 0-2!");
                    read.nextLine();
                }

            }

            switch (exit){
                case 1:
                    System.out.print("What is your departure destination?: ");
                    String DepartureCode = read.nextLine().toUpperCase();

                    if (!airports.containsKey(DepartureCode)) {
                        System.out.println("The airport is not supported as a departure destination.");
                        continue;
                    }

                    System.out.print("\nWhat is your arrival destination?: ");
                    String ArrivalCode = read.nextLine().toUpperCase();

                    if (!airports.containsKey(ArrivalCode)) {
                        System.out.println("The airport is not supported as an arrival destination.");
                        continue;
                    }

                    if (ArrivalCode.equals(DepartureCode)){
                        System.out.println("You have same the Arrival and Departure destinations");
                        break;
                    }

                    System.out.println("Would you like seats with more leg room for an extra 20€ in each flight?");
                    System.out.println("yes / no");
                    String legspace = read.nextLine().toUpperCase();

                    Airport departure = airports.get(DepartureCode);
                    Airport arrival = airports.get(ArrivalCode);

                    List<Airport> route = finder.BFS(departure, arrival);

                    finder.printRoute(route);
                    finder.printDetails(route,legspace);

                    break;
                case 2:
                    graph.printGraph();
                    break;
                case 0:
                    loop = false;
                    break;
            }
        }
    }
}

