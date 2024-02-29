package MainClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Activity;
import model.Destination;
import model.Passenger;
import model.StandardPassenger;

/**
 * The {@code PassengerTest} class contains test cases for the {@link Passenger} and its subclasses.
 * It verifies the functionality of the methods in the {@code Passenger} hierarchy.
 */
class PassengerTest {

    /**
     * Test case for the {@link Passenger#signUpForActivity(Activity)} method.
     * It checks if a passenger can successfully sign up for an activity.
     */
    @Test
    void testPassengerSignUpForActivity() {
        Passenger passenger = new StandardPassenger("John", 1, 100.0);
        Activity activity = new Activity("Test Activity", "Test Description", 20.0, 5, new Destination("Test Destination"));

        passenger.signUpForActivity(activity);

        assertEquals(1, passenger.getSignedUpActivities().size());
        assertTrue(passenger.getSignedUpActivities().contains(activity));
    }

    /**
     * Test case for the {@link Passenger#hasSufficientBalance(Activity)} method.
     * It checks if a standard passenger has sufficient balance to sign up for an activity.
     */
    @Test
    void testStandardPassengerHasSufficientBalance() {
        Passenger passenger = new StandardPassenger("John", 1, 100.0);
        Activity activity = new Activity("Test Activity", "Test Description", 20.0, 5, new Destination("Test Destination"));

        assertTrue(passenger.hasSufficientBalance(activity));
    }

    /**
     * Test case for the {@link Passenger#deductBalance(double)} method.
     * It checks if the balance of a standard passenger is correctly deducted.
     */
    @Test
    void testStandardPassengerDeductBalance() {
        Passenger passenger = new StandardPassenger("John", 1, 100.0);
        passenger.deductBalance(20.0);

        assertEquals(80.0, ((StandardPassenger) passenger).getBalance());
    }

    // Additional test cases can be added based on the requirements.
}
