package MainClass;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Activity;
import model.Destination;
import model.GoldPassenger;
import model.Passenger;

/**
 * The {@code GoldPassengerTest} class contains test cases for the {@link GoldPassenger} class.
 * It verifies the functionality of the methods in the {@code GoldPassenger} class.
 */
class GoldPassengerTest {

    /**
     * Test case for the {@link GoldPassenger#signUpForActivity(Activity)} method.
     * It checks if a gold passenger can successfully sign up for an activity.
     */
    @Test
    void testGoldPassengerSignUpForActivity() {
        Passenger passenger = new GoldPassenger("Jane", 2, 150.0);
        Activity activity = new Activity("Test Activity", "Test Description", 30.0, 5, new Destination("Test Destination"));

        passenger.signUpForActivity(activity);

        assertEquals(1, passenger.getSignedUpActivities().size());
        assertTrue(passenger.getSignedUpActivities().contains(activity));
    }

    /**
     * Test case for the {@link GoldPassenger#hasSufficientBalance(Activity)} method.
     * It checks if a gold passenger has sufficient balance to sign up for an activity.
     */
    @Test
    void testGoldPassengerHasSufficientBalance() {
        Passenger passenger = new GoldPassenger("Jane", 2, 150.0);
        Activity activity = new Activity("Test Activity", "Test Description", 30.0, 5, new Destination("Test Destination"));

        assertTrue(passenger.hasSufficientBalance(activity));
    }

    /**
     * Test case for the {@link GoldPassenger#deductBalance(double)} method.
     * It checks if the balance of a gold passenger is correctly deducted after signing up for an activity.
     */
    @Test
    void testGoldPassengerDeductBalance() {
        Passenger passenger = new GoldPassenger("Jane", 2, 150.0);
        Activity activity = new Activity("Test Activity", "Test Description", 30.0, 5, new Destination("Test Destination"));
        passenger.signUpForActivity(activity);

        double initialBalance = ((GoldPassenger) passenger).getBalance();
        passenger.deductBalance(activity.getCostForPassenger((GoldPassenger) passenger));

        assertEquals(initialBalance - activity.getCostForPassenger((GoldPassenger) passenger), ((GoldPassenger) passenger).getBalance());
    }

    // Additional test cases can be added based on the requirements.
}
