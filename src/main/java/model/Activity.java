package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an activity available at a specific destination within a travel package.
 * Activities have a name, description, cost, capacity, and are associated with a destination.
 * Passengers can sign up for activities, and the activity keeps track of signed-up passengers.
 */
public class Activity {

    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;
    private List<Passenger> signedUpPassengers;

    /**
     * Constructs an activity with the specified parameters.
     *
     * @param name        The name of the activity.
     * @param description A brief description of the activity.
     * @param cost        The cost of participating in the activity.
     * @param capacity    The maximum number of participants allowed in the activity.
     * @param destination The destination where the activity takes place.
     */
    public Activity(String name, String description, double cost, int capacity, Destination destination) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.destination = destination;
        this.signedUpPassengers = new ArrayList<>();
    }

    /**
     * Gets the name of the activity.
     *
     * @return The name of the activity.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets a brief description of the activity.
     *
     * @return A description of the activity.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the cost of participating in the activity.
     *
     * @return The cost of the activity.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Gets the maximum number of participants allowed in the activity.
     *
     * @return The capacity of the activity.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Gets the destination where the activity takes place.
     *
     * @return The destination of the activity.
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Gets the list of passengers signed up for the activity.
     *
     * @return The list of signed-up passengers.
     */
    public List<Passenger> getSignedUpPassengers() {
        return signedUpPassengers;
    }

    /**
     * Gets the number of available spaces for the activity.
     *
     * @return The number of available spaces.
     */
    public int getAvailableSpaces() {
        return capacity - signedUpPassengers.size();
    }

    /**
     * Signs up a passenger for the activity if there are available spaces.
     *
     * @param passenger The passenger to sign up.
     * @return True if the sign-up is successful, false otherwise.
     */
    public boolean signUpPassenger(Passenger passenger) {
        // Check if there are available spaces
        if (getAvailableSpaces() > 0) {
            // Check if the passenger is not already signed up
            if (!signedUpPassengers.contains(passenger)) {
                signedUpPassengers.add(passenger);
                return true; // Sign-up successful
            } else {
                System.out.println("Passenger already signed up for this activity.");
                return false; // Passenger already signed up
            }
        } else {
            System.out.println("No available spaces for this activity.");
            return false; // No available spaces
        }
    }

    /**
     * Gets the cost of the activity for a specific passenger.
     *
     * @param passenger The passenger for whom to calculate the cost.
     * @return The cost of the activity for the passenger.
     */
    public double getCostForPassenger(Passenger passenger) {
        // Default implementation: cost is the same for all passengers
        return this.getCost();
    }
}
