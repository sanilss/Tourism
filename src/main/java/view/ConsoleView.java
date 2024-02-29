package view;

import java.util.List;
import java.util.stream.Collectors;

import model.Activity;
import model.Destination;
import model.GoldPassenger;
import model.Passenger;
import model.PremiumPassenger;
import model.StandardPassenger;
import model.TravelPackage;

/**
 * ConsoleView class provides methods to display information related to travel packages, passengers, and activities in the console.
 */
public class ConsoleView {

    /**
     * Displays the itinerary of a given travel package in the console.
     *
     * @param travelPackage The travel package for which the itinerary should be displayed.
     */
    public void displayItinerary(TravelPackage travelPackage) {
        System.out.println("Travel Package Itinerary:");
        System.out.println("Package Name: " + travelPackage.getName());

        List<Destination> destinations = travelPackage.getDestinations();

        for (Destination destination : destinations) {
            System.out.println("\nDestination: " + destination.getName());

            List<Activity> activities = destination.getActivities();
            for (Activity activity : activities) {
                displayActivityDetails(activity);
            }
        }
    }

    /**
     * Displays the passenger list for a given travel package in the console.
     *
     * @param travelPackage The travel package for which the passenger list should be displayed.
     */
    public void displayPassengerList(TravelPackage travelPackage) {
        System.out.println("Passenger List for Travel Package:\n");
        System.out.println("Package Name: " + travelPackage.getName());
        System.out.println("Passenger Capacity: " + travelPackage.getPassengerCapacity());
        System.out.println("Number of Passengers Enrolled: " + travelPackage.getPassengers().size());

        List<Passenger> passengers = travelPackage.getPassengers();
        for (Passenger passenger : passengers) {
            displayPassengerDetails(passenger);
        }
    }

    /**
     * Displays detailed information about a specific passenger in the console.
     *
     * @param passenger The passenger for whom details should be displayed.
     */
    public void displayPassengerDetails(Passenger passenger) {
        System.out.println("\nPassenger Details:");
        System.out.println("Name: " + passenger.getName());
        System.out.println("Passenger Number: " + passenger.getPassengerNumber());

        if (passenger instanceof StandardPassenger) {
            System.out.println("Balance: " + ((StandardPassenger) passenger).getBalance());
        } else if (passenger instanceof GoldPassenger) {
            displayGoldPassengerDetails((GoldPassenger) passenger);
        } else if (passenger instanceof PremiumPassenger) {
            System.out.println("Premium Passenger: Can sign up for activities for free");
            // Add more details specific to PremiumPassenger if needed
        }

        List<Activity> signedUpActivities = passenger.getSignedUpActivities();
        if (!signedUpActivities.isEmpty()) {
            System.out.println("Activities Signed Up For:");
            for (Activity activity : signedUpActivities) {
                displayActivityDetails(activity);
            }
        } else {
            System.out.println("No Activities Signed Up For.");
        }
    }

    private void displayGoldPassengerDetails(GoldPassenger goldPassenger) {
        System.out.println("Balance: " + goldPassenger.getBalance());
        System.out.println("Gold Discount: 10%");
    }

    private void displayActivityDetails(Activity activity) {
        System.out.println("  Activity: " + activity.getName());
        System.out.println("    Cost: " + activity.getCost());
        System.out.println("    Capacity: " + activity.getCapacity());
        System.out.println("    Description: " + activity.getDescription());
    }

    /**
     * Displays the list of available activities within a given travel package in the console.
     *
     * @param travelPackage The travel package for which available activities should be displayed.
     */
    public void displayAvailableActivities(TravelPackage travelPackage) {
        System.out.println("\nAvailable Activities:");
        List<Destination> destinations = travelPackage.getDestinations();

        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.getName());

            List<Activity> availableActivities = destination.getActivities().stream()
                    .filter(activity -> activity.getAvailableSpaces() > 0)
                    .collect(Collectors.toList());

            for (Activity activity : availableActivities) {
                displayActivityDetails(activity);
                System.out.println("    Spaces Available: " + activity.getAvailableSpaces());
            }
        }
    }
}
