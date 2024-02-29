package MainClass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import model.Activity;
import model.Destination;
import model.Passenger;
import model.StandardPassenger;
import model.TravelPackage;
import service.TravelService;

/**
 * The {@code TravelServiceTest} class contains test cases for the {@link TravelService} class.
 * It verifies the functionality of the methods in the {@code TravelService} class.
 */
public class TravelServiceTest {

    private TravelService travelService;

    /**
     * Set up method executed before each test case.
     * It initializes the {@link TravelService} instance.
     */
    @Before
    public void setUp() {
        travelService = new TravelService();
    }

    /**
     * Test case for the {@link TravelService#addTravelPackage(TravelPackage)} method.
     * It checks if the travel package is correctly added to the travel service.
     */
    @Test
    public void testAddTravelPackage() {
        List<Destination> destinations = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        TravelPackage travelPackage = new TravelPackage("Test Package", 10, destinations, passengers);
        travelService.addTravelPackage(travelPackage);

        List<TravelPackage> travelPackages = travelService.getTravelPackages();
        assertEquals(1, travelPackages.size());
        assertEquals("Test Package", travelPackages.get(0).getName());
    }

    /**
     * Test case for the {@link TravelService#signUpPassengerForActivity(TravelPackage, Passenger, Activity)} method.
     * It checks if a passenger is correctly signed up for an activity, and the available spaces are updated.
     */
    @Test
    public void testSignUpPassengerForActivity() {
        List<Destination> destinations = new ArrayList<>();
        List<Passenger> passengers = new ArrayList<>();
        TravelPackage travelPackage = new TravelPackage("Test Package", 10, destinations, passengers);
        List<Activity> activities = new ArrayList<>();
        Destination destination = new Destination("Test Destination", activities);
        Activity activity = new Activity("Test Activity", "Test Description", 20.0, 5, destination);
        travelPackage.getDestinations().add(destination);
        travelPackage.getPassengers().add(new StandardPassenger("John", 1, 100.0));

        travelService.addTravelPackage(travelPackage);
        travelService.signUpPassengerForActivity(travelPackage, travelPackage.getPassengers().get(0), activity);

        assertTrue(travelPackage.getPassengers().get(0).getSignedUpActivities().contains(activity));
        assertEquals(4, activity.getAvailableSpaces());
    }

    // Add more test cases as needed

}
