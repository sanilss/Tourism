package MainClass;



import org.junit.jupiter.api.Test;

import model.Activity;
import model.Destination;
import model.Passenger;
import model.TravelPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code TravelPackageTest} class contains test cases for the {@link TravelPackage} class.
 * It verifies the functionality of the methods in the {@code TravelPackage} class.
 */
class TravelPackageTest {

    /**
     * Test case for the {@link TravelPackage#getActivities()} method.
     * It checks if the travel package correctly retrieves all activities from its destinations.
     */
    @Test
    void testGetActivities() {
        // Create sample destinations and activities
        Destination destination1 = new Destination("Destination 1");
        Activity activity1 = new Activity("Activity 1", "Description 1", 20.0, 5, destination1);
        Activity activity2 = new Activity("Activity 2", "Description 2", 30.0, 8, destination1);
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);

        Destination destination2 = new Destination("Destination 2");
        Activity activity3 = new Activity("Activity 3", "Description 3", 25.0, 6, destination2);
        destination2.addActivity(activity3);

        // Create a TravelPackage with the sample destinations
        List<Destination> destinations = new ArrayList<>();
        destinations.add(destination1);
        destinations.add(destination2);

        List<Passenger> passengers = new ArrayList<>();
        TravelPackage travelPackage = new TravelPackage("Test Package", 15, destinations, passengers);

        // Retrieve all activities from the travel package
        List<Activity> allActivities = travelPackage.getActivities();

        // Check if the retrieved activities match the expected activities
        assertTrue(allActivities.contains(activity1));
        assertTrue(allActivities.contains(activity2));
        assertTrue(allActivities.contains(activity3));
    }

    /**
     * Test case for the {@link TravelPackage#getActivities()} method in an empty package.
     * It checks if the travel package correctly handles the case where there are no destinations.
     */
    @Test
    void testGetActivitiesEmptyPackage() {
        // Create a TravelPackage with no destinations
        List<Destination> destinations = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        TravelPackage emptyPackage = new TravelPackage("Empty Package", 10, destinations, passengers);

        // Retrieve activities from the empty package
        List<Activity> emptyPackageActivities = emptyPackage.getActivities();

        // Check that no activities are retrieved from the empty package
        assertTrue(emptyPackageActivities.isEmpty());
    }

    // Additional test cases can be added based on the requirements.

}

