package model;

/**
 * Represents a premium passenger who can sign up for activities for free.
 */
public class PremiumPassenger extends Passenger {

    /**
     * Constructs a premium passenger with the given name and passenger number.
     *
     * @param name           The name of the premium passenger.
     * @param passengerNumber The passenger number.
     */
    public PremiumPassenger(String name, int passengerNumber) {
        super(name, passengerNumber);
    }

    /**
     * Premium passengers can sign up for activities for free, so always returns true.
     *
     * @param activity The activity to check for balance sufficiency.
     * @return Always returns true for premium passengers.
     */
    @Override
    public boolean hasSufficientBalance(Activity activity) {
        return true; // Premium passengers can sign up for activities for free
    }

    /**
     * Premium passengers can sign up for activities for free, so always returns 0.0.
     *
     * @param activity The activity for which to calculate the cost.
     * @return Always returns 0.0 for premium passengers.
     */
    @Override
    public double getCostForActivity(Activity activity) {
        return 0.0; // Premium passengers can sign up for activities for free
    }

    /**
     * Premium passengers can sign up for activities for free, so no balance deduction needed.
     *
     * @param amount The amount to deduct from the balance (ignored for premium passengers).
     */
    @Override
    public void deductBalance(double amount) {
        // Premium passengers can sign up for activities for free, so no balance deduction needed
    }

    /**
     * Gets the balance of the premium passenger (always returns 0.0).
     *
     * @return The balance of the premium passenger (always 0.0).
     */
    @Override
    public double getBalance() {
        return 0.0; // Premium passengers have a balance of 0.0
    }
}
