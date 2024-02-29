package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a travel package that includes destinations, activities, and passengers.
 */
public class TravelPackage {

    private String name;
    private int passengerCapacity;
    private List<Destination> destinations;
    private List<Passenger> passengers;

    /**
     * Constructs a travel package with the given name, passenger capacity, destinations, and passengers.
     *
     * @param name             The name of the travel package.
     * @param passengerCapacity The passenger capacity of the travel package.
     * @param destinations     The list of destinations included in the travel package.
     * @param passengers       The list of passengers enrolled in the travel package.
     */
    public TravelPackage(String name, int passengerCapacity, List<Destination> destinations, List<Passenger> passengers) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.destinations = destinations;
        this.passengers = passengers;
    }

    /**
     * Gets the name of the travel package.
     *
     * @return The name of the travel package.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the passenger capacity of the travel package.
     *
     * @return The passenger capacity of the travel package.
     */
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    /**
     * Gets the list of destinations included in the travel package.
     *
     * @return The list of destinations included in the travel package.
     */
    public List<Destination> getDestinations() {
        return destinations;
    }

    /**
     * Gets the list of passengers enrolled in the travel package.
     *
     * @return The list of passengers enrolled in the travel package.
     */
    public List<Passenger> getPassengers() {
        return passengers;
    }

    /**
     * Adds a passenger to the list of passengers in the travel package.
     *
     * @param passenger The passenger to add.
     */
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    /**
     * Retrieves all activities across all destinations in the travel package.
     *
     * @return The list of activities across all destinations.
     */
    public List<Activity> getActivities() {
        List<Activity> allActivities = new ArrayList<>();
        for (Destination destination : destinations) {
            allActivities.addAll(destination.getActivities());
        }
        return allActivities;
    }

    /**
     * Signs up a passenger for a specific activity within the travel package.
     *
     * @param passenger The passenger to sign up.
     * @param activity  The activity to sign up for.
     */
    public void signUpPassengerForActivity(Passenger passenger, Activity activity) {
        // Check if the activity has available spaces and sign up the passenger using the Activity method
        if (activity.signUpPassenger(passenger)) {
            // Add the passenger to the list of passengers in the travel package
            passengers.add(passenger);
        }
    }

    // Additional methods can be added as needed for the TravelPackage class
}
