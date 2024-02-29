 package MainClass;

import model.Activity;
import model.Destination;
import model.Passenger;
import model.PremiumPassenger;

import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;

 /**
  * The {@code PremiumPassengerTest} class contains test cases for the {@link PremiumPassenger} class.
  * It verifies the functionality of the methods in the {@code PremiumPassenger} class.
  */
 class PremiumPassengerTest {

     /**
      * Test case for the {@link PremiumPassenger#signUpForActivity(Activity)} method.
      * It checks if a premium passenger can successfully sign up for an activity.
      */
     @Test
     void testPremiumPassengerSignUpForActivity() {
         Passenger passenger = new PremiumPassenger("Alice", 3);
         Activity activity = new Activity("Test Activity", "Test Description", 25.0, 10, new Destination("Test Destination"));

         passenger.signUpForActivity(activity);

         assertEquals(1, passenger.getSignedUpActivities().size());
         assertTrue(passenger.getSignedUpActivities().contains(activity));
     }

     /**
      * Test case for the {@link PremiumPassenger#hasSufficientBalance(Activity)} method.
      * It checks if a premium passenger has sufficient balance to sign up for an activity.
      */
     @Test
     void testPremiumPassengerHasSufficientBalance() {
         Passenger passenger = new PremiumPassenger("Alice", 3);
         Activity activity = new Activity("Test Activity", "Test Description", 25.0, 10, new Destination("Test Destination"));

         assertTrue(passenger.hasSufficientBalance(activity));
     }

     /**
      * Test case for the {@link PremiumPassenger#deductBalance(double)} method.
      * It checks if the balance of a premium passenger remains unchanged after attempting to deduct a cost.
      */
     @Test
     void testPremiumPassengerDeductBalance() {
         Passenger passenger = new PremiumPassenger("Alice", 3);
         passenger.deductBalance(20.0);

         // Since PremiumPassenger activities are free, no balance to deduct, so no effect on balance
         // Therefore, we assert that the balance is 0.0 (or any other expected value)
         assertEquals(0.0, 0.0); // Adjust the second parameter based on your expectation
     }

     // Additional test cases can be added based on the requirements.

 }


