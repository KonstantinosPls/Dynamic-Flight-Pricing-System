import java.util.*;

public class RouteFinder implements IRouteFinder {

    private FlightGraph flight;

    public RouteFinder(FlightGraph graph) {
        this.flight = graph;
    }

    public List<Airport> BFS(Airport departure, Airport arival) {

        Set<Airport> VisNode = new HashSet<>();

        LinkedList<Airport> queue = new LinkedList<>();

        //gemini eixe tin idea gia map i tried with a list 
        Map<Airport, Airport> path = new HashMap<>();


        VisNode.add(departure);
        queue.add(departure);
        path.put(departure,null);


        while (!queue.isEmpty()){
            //poll is remove but without expetion at null it finds it normal /bazi to airport pou ine stin sira se object
            Airport current = queue.poll();

            if (current.equals(arival)){
                break;
            }

            //oles i ptisis apo to to airport
            for (Flight f : flight.getFlights(current)){
                Airport next = f.getArrival();

                if(!VisNode.contains(next)){
                    VisNode.add(next); // visited
                    queue.add(next); // add to the queue
                    path.put(next, current); // save the path
                }

            }

        }

        if(!path.containsKey(arival)){
            System.out.println("No route found between " + departure.getCityCode() + " and " + arival.getCityCode());
            return new ArrayList<>();
        }

        List<Airport> route = new ArrayList<>();

        while (arival != null) {
            route.addFirst(arival); // ath , bud, zrh
            arival = path.get(arival); // ath = (ath ,_ ) = bud
        }

        return route;
    }

    public void printRoute(List<Airport> route) {
        if (route.size()<=1) {
            System.out.println("No route found.");
            return;
        }

        for (int i = 0; i < route.size(); i++) {
            System.out.print(route.get(i).getCityCode());
            if (i < route.size() - 1) {
                System.out.print(" --->> ");
            }
        }
        System.out.println();
    }

    public void printDetails(List<Airport> route,String Legs){

        int temp = route.size() - 2 ;
        if (Legs.equals("YES")){
            if (temp >= 0) {
                double TotalPrice = 0;
                double TotalDistance = 0;
                System.out.println("Stops: " + temp);
                for (int i = 0; i < route.size() - 1; i++) {
                    Airport departure = route.get(i);
                    Airport arival = route.get(i + 1);


                    Flight nextStop = null;
                    for (Flight f : flight.getFlights(departure)) {
                        if (f.getArrival().equals(arival))
                            nextStop = f;
                    }

                    if (nextStop == null) {
                         System.out.println("Error: No direct flight found between " + 
                       departure.getCityCode() + " and " + arival.getCityCode());
                     return;
                    }


                    TotalPrice += nextStop.getPrice() + 20;
                    TotalDistance += DistanceCalculator.getDistance(departure,nextStop.getArrival());

                    System.out.println(departure.getCityCode() + " --->> " + nextStop.getArrival().getCityCode()
                            + " | Seats Taken " + nextStop.getSeatsTaken() + "/" + nextStop.getCapacity()
                            + " | Available capacity: " + (nextStop.getCapacity() - nextStop.getSeatsTaken())
                            + String.format(" | %.1f", DistanceCalculator.getDistance(departure, nextStop.getArrival())) + " KM"
                            + String.format(" | %.2f", nextStop.getPrice()) + " Euros");

                }
                System.out.println( String.format("Final Price: %.2f", TotalPrice) + String.format("\nDistance Covered: %.1f", TotalDistance));

            }
        } else if (Legs.equals("NO")) {
            if (temp >= 0) {
                double TotalPrice = 0;
                double TotalDistance = 0;
                System.out.println("Stops: " + temp);
                for (int i = 0; i < route.size() - 1; i++) {
                    Airport departure = route.get(i);
                    Airport arival = route.get(i + 1);
                

                    Flight nextStop = null;
                    for (Flight f : flight.getFlights(departure)) {
                        if (f.getArrival().equals(arival))
                            nextStop = f;
                    }

                    if (nextStop == null) {
                         System.out.println("Error: No direct flight found between " + 
                       departure.getCityCode() + " and " + arival.getCityCode());
                     return;
                    }


                    TotalPrice += nextStop.getPrice();
                    TotalDistance += DistanceCalculator.getDistance(departure,nextStop.getArrival());

                    System.out.println(departure.getCityCode() + " --->> " + nextStop.getArrival().getCityCode()
                            + " | Seats Taken " + nextStop.getSeatsTaken() + "/" + nextStop.getCapacity()
                            + " | Available capacity: " + (nextStop.getCapacity() - nextStop.getSeatsTaken())
                            + String.format(" | %.1f", DistanceCalculator.getDistance(departure, nextStop.getArrival())) + " KM"
                            + String.format(" | %.2f", nextStop.getPrice()) + " Euros");

                }
                System.out.println( String.format("Final Price: %.2f", TotalPrice) + String.format("\nDistance Covered: %.1f", TotalDistance));

            }
        }else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }

    }

    public void printFromDeparture(List <Flight> directFlights, String Legs){

        int temp = directFlights.size() ;
        if (Legs.equals("YES")){
            if (temp >= 1) {
                for (int i = 0; i < directFlights.size(); i++) {
                    Flight direct = directFlights.get(i);

                    System.out.println(direct.getDeparture().getCityCode() + " --->> " + direct.getArrival().getCityCode()
                            + " | Seats Taken " + direct.getSeatsTaken() + "/" + direct.getCapacity()
                            + " | Available capacity: " + (direct.getCapacity() - direct.getSeatsTaken())
                            + String.format(" | %.1f", DistanceCalculator.getDistance(direct.getDeparture(), direct.getArrival())) + " KM"
                            + String.format(" | %.2f", direct.getPrice() + 20) + " Euros");
                }
            }
        } else if (Legs.equals("NO")) {
            if (temp >= 1) {
                for (int i = 0; i < directFlights.size(); i++) {
                    Flight direct = directFlights.get(i);

                    System.out.println(direct.getDeparture().getCityCode() + " --->> " + direct.getArrival().getCityCode()
                            + " | Seats Taken " + direct.getSeatsTaken() + "/" + direct.getCapacity()
                            + " | Available capacity: " + (direct.getCapacity() - direct.getSeatsTaken())
                            + String.format(" | %.1f", DistanceCalculator.getDistance(direct.getDeparture(), direct.getArrival())) + " KM"
                            + String.format(" | %.2f", direct.getPrice()) + " Euros");
                }
            }
        }else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }


}
