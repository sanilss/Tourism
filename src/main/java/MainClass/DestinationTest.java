package MainClass;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import model.Activity;
import model.Destination;

/**
 * The {@code DestinationTest} class contains test cases for the {@link Destination} class.
 * It verifies the functionality of the methods in the {@code Destination} class.
 */
class DestinationTest {

    /**
     * Test case for the {@link Destination#getName()} method.
     * It checks if the method returns the correct name of the destination.
     */
    @Test
    void testGetName() {
        // Create a Destination with a name
        Destination destination = new Destination("Test Destination");

        // Check if the getName method returns the correct name
        assertEquals("Test Destination", destination.getName());
    }

    /**
     * Test case for the {@link Destination#setName(String)} method.
     * It checks if the method sets the name of the destination correctly.
     */
    @Test
    void testSetName() {
        // Create a Destination
        Destination destination = new Destination();

        // Set a name using setName method
        destination.setName("New Destination");

        // Check if the getName method returns the correct updated name
        assertEquals("New Destination", destination.getName());
    }

    /**
     * Test case for the {@link Destination#getActivities()} method.
     * It checks if the method returns the correct list of activities at the destination.
     */
    @Test
    void testGetActivities() {
        // Create a list of activities
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Activity1", "Description1", 10.0, 5, new Destination()));
        activities.add(new Activity("Activity2", "Description2", 20.0, 10, new Destination()));

        // Create a Destination with activities
        Destination destination = new Destination("Test Destination", activities);

        // Check if the getActivities method returns the correct list of activities
        assertEquals(activities, destination.getActivities());
    }

    /**
     * Test case for the {@link Destination#setActivities(List)} method.
     * It checks if the method sets the list of activities at the destination correctly.
     */
    @Test
    void testSetActivities() {
        // Create a Destination
        Destination destination = new Destination();

        // Create a list of activities
        List<Activity> activities = new ArrayList<>();
        activities.add(new Activity("Activity1", "Description1", 10.0, 5, new Destination()));
        activities.add(new Activity("Activity2", "Description2", 20.0, 10, new Destination()));

        // Set activities using setActivities method
        destination.setActivities(activities);

        // Check if the getActivities method returns the correct list of activities
        assertEquals(activities, destination.getActivities());
    }
}
