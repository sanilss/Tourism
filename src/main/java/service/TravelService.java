package service;

import java.util.ArrayList;
import java.util.List;

import model.Activity;
import model.Passenger;
import model.TravelPackage;
import view.ConsoleView;

/**
 * Service class that provides various functionalities related to travel packages, passengers, and activities.
 */
public class TravelService {

    private List<TravelPackage> travelPackages;

    /**
     * Constructs a TravelService with an empty list of travel packages.
     */
    public TravelService() {
        this.travelPackages = new ArrayList<>();
    }

    /**
     * Adds a travel package to the list of available travel packages.
     *
     * @param travelPackage The travel package to be added.
     */
    public void addTravelPackage(TravelPackage travelPackage) {
        travelPackages.add(travelPackage);
    }

    /**
     * Gets the list of available travel packages.
     *
     * @return The list of available travel packages.
     */
    public List<TravelPackage> getTravelPackages() {
        return travelPackages;
    }

    /**
     * Signs up a passenger for a specific activity within a given travel package.
     *
     * @param travelPackage The travel package in which the passenger is signing up for an activity.
     * @param passenger     The passenger to sign up.
     * @param activity      The activity to sign up for.
     */
    public void signUpPassengerForActivity(TravelPackage travelPackage, Passenger passenger, Activity activity) {
        if (travelPackage.getPassengers().contains(passenger) && activity.getAvailableSpaces() > 0) {
            passenger.signUpForActivity(activity);
            activity.signUpPassenger(passenger);
        }
    }

    /**
     * Prints the itinerary of a given travel package using the ConsoleView.
     *
     * @param travelPackage The travel package for which the itinerary should be printed.
     */
    public void printItinerary(TravelPackage travelPackage) {
        ConsoleView consoleView = new ConsoleView();
        consoleView.displayItinerary(travelPackage);
    }

    /**
     * Prints the passenger list of a given travel package using the ConsoleView.
     *
     * @param travelPackage The travel package for which the passenger list should be printed.
     */
    public void printPassengerList(TravelPackage travelPackage) {
        ConsoleView consoleView = new ConsoleView();
        consoleView.displayPassengerList(travelPackage);
    }

    /**
     * Prints the details of a specific passenger using the ConsoleView.
     *
     * @param passenger The passenger for whom details should be printed.
     */
    public void printPassengerDetails(Passenger passenger) {
        ConsoleView consoleView = new ConsoleView();
        consoleView.displayPassengerDetails(passenger);
    }

    /**
     * Prints the list of available activities within a given travel package using the ConsoleView.
     *
     * @param travelPackage The travel package for which available activities should be printed.
     */
    public void printAvailableActivities(TravelPackage travelPackage) {
        ConsoleView consoleView = new ConsoleView();
        consoleView.displayAvailableActivities(travelPackage);
    }

    /**
     * Retrieves a list of available activities within a given travel package.
     *
     * @param travelPackage The travel package for which available activities should be retrieved.
     * @return The list of available activities.
     */
    public List<Activity> getAvailableActivities(TravelPackage travelPackage) {
        List<Activity> availableActivities = new ArrayList<>();

        // Implement logic to retrieve available activities based on your requirements
        for (Activity activity : travelPackage.getActivities()) {
            if (activity.getAvailableSpaces() > 0) {
                availableActivities.add(activity);
            }
        }

        return availableActivities;
    }

    // Additional methods for handling business logic can be added based on the requirements.
}
