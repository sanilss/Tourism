package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an abstract class for passengers with common attributes and behaviors.
 */
public abstract class Passenger {

    private String name;
    private int passengerNumber;
    private List<Activity> signedUpActivities;

    /**
     * Constructs a passenger with the given name and passenger number.
     *
     * @param name           The name of the passenger.
     * @param passengerNumber The passenger number.
     */
    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.signedUpActivities = new ArrayList<>();
    }

    /**
     * Gets the name of the passenger.
     *
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the passenger number.
     *
     * @return The passenger number.
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }

    /**
     * Gets the list of activities that the passenger has signed up for.
     *
     * @return The list of signed-up activities.
     */
    public List<Activity> getSignedUpActivities() {
        return signedUpActivities;
    }

    /**
     * Signs up the passenger for a specific activity.
     *
     * @param activity The activity to sign up for.
     */
    public void signUpForActivity(Activity activity) {
        signedUpActivities.add(activity);
    }

    /**
     * Checks if the passenger has sufficient balance to sign up for a specific activity.
     *
     * @param activity The activity to check for balance sufficiency.
     * @return True if the balance is sufficient, false otherwise.
     */
    public abstract boolean hasSufficientBalance(Activity activity);

    /**
     * Gets the cost for the passenger to sign up for a specific activity.
     *
     * @param activity The activity for which to calculate the cost.
     * @return The cost for the activity.
     */
    public abstract double getCostForActivity(Activity activity);

    /**
     * Deducts the specified amount from the passenger's balance.
     *
     * @param amount The amount to deduct from the balance.
     */
    public abstract void deductBalance(double amount);

    /**
     * Gets the current balance of the passenger.
     *
     * @return The balance of the passenger.
     */
    public abstract double getBalance();
}
