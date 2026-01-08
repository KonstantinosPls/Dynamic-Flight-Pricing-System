# Dynamic Flight Pricing System

This is a Java application that simulates an airline flight management system with dynamic pricing. The system models a network of European airports as a graph data structure and uses the Breadth-First Search algorithm to find optimal routes between destinations. Prices adjust automatically based on seat availability, reflecting real-world airline pricing behavior where flights become more expensive as they fill up.

## Project Overview

The application demonstrates several core computer science concepts including graph traversal algorithms, geographic distance calculation using the Haversine formula, and dynamic pricing based on supply and demand principles. The flight network includes 32 European airports with over 95 flight connections spanning Southern, Central, Northern, Western, and Eastern Europe.

## Core Classes

**Airport** represents a physical airport with a unique code, city name, and geographic coordinates. The latitude and longitude values are used for calculating real distances between locations. Equality is determined by the airport code, allowing airports to work correctly in hash-based collections.

**Flight** represents a single flight connection between two airports. Each flight has a unique identifier, departure and arrival airports, seat capacity, and current booking count. The distance and price are computed values that get set when the flight is added to the network.

**FlightGraph** is the central data structure that stores the entire network using an adjacency list representation. Each airport maps to a list of outgoing flights. When a flight is added, the graph automatically calculates its distance using geographic coordinates and sets the initial price based on the pricing algorithm.

**RouteFinder** implements the BFS algorithm to find the shortest route between any two airports. It can display routes in a simple format showing the sequence of airports, or provide detailed itineraries including seat availability, distances, and prices for each leg of the journey.

**ReservationManager** handles seat bookings on flights. When a reservation is made, it decrements available seats and triggers a price recalculation for that flight, demonstrating the dynamic pricing mechanism.

## Utility Classes

**PriceCalculator** implements the dynamic pricing algorithm. The price combines a base fare of 20 Euros with a distance-based component, then multiplies by a load factor that increases as more seats are booked. This means prices rise as flights fill up.

**DistanceCalculator** uses the Haversine formula to calculate the great-circle distance between two airports based on their latitude and longitude. This provides realistic distances accounting for the curvature of the Earth.

**RandomSeats** generates random seat capacity and initial booking numbers for flights, creating varied scenarios for testing the pricing system.

**Data** serves as the data loader, initializing the flight network with all 32 European airports and their coordinates, plus the 95 flight connections between them.

## How It Works

The system loads airport and flight data on startup, building the graph structure. Users can then search for routes between airports using BFS, which finds the path with the fewest stops. The route finder displays complete itinerary details including cumulative distance and total price. Making reservations on flights triggers the pricing algorithm to recalculate fares based on the new seat availability.

## Algorithms

The Breadth-First Search algorithm explores the graph level by level, guaranteeing the shortest path in terms of number of flights. It uses a queue to process airports and a set to track visited nodes, achieving O(V + E) time complexity where V is airports and E is flights.

The Haversine formula calculates distances using trigonometric functions on latitude and longitude values converted to radians, with the Earth's radius of 6371 kilometers as a constant.

The pricing formula is: price = (20 + distance/10) multiplied by (1 + seats_taken/capacity). This ensures prices start reasonable for empty flights and increase proportionally as occupancy rises.

## Technology

The project is written in Java using standard library collections including HashMap for O(1) airport lookups, ArrayList for flight lists, LinkedList for the BFS queue, and HashSet for tracking visited airports. The design follows interface-based principles with separate contracts defined for all major components.
