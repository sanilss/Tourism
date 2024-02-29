package model;

/**
 * Represents a standard passenger with a balance for signing up for activities.
 */
public class StandardPassenger extends Passenger {
    private double balance;

    /**
     * Constructs a standard passenger with the given name, passenger number, and balance.
     *
     * @param name           The name of the standard passenger.
     * @param passengerNumber The passenger number.
     * @param balance        The balance of the standard passenger.
     */
    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    /**
     * Checks if the standard passenger has a sufficient balance for signing up for the activity.
     *
     * @param activity The activity to check for balance sufficiency.
     * @return True if the balance is sufficient, false otherwise.
     */
    @Override
    public boolean hasSufficientBalance(Activity activity) {
        return balance >= activity.getCost();
    }

    /**
     * Gets the cost for the standard passenger to sign up for the activity.
     *
     * @param activity The activity for which to calculate the cost.
     * @return The cost for the standard passenger to sign up for the activity.
     */
    @Override
    public double getCostForActivity(Activity activity) {
        return activity.getCost();
    }

    /**
     * Deducts the specified amount from the balance of the standard passenger.
     *
     * @param amount The amount to deduct from the balance.
     */
    @Override
    public void deductBalance(double amount) {
        balance -= amount;
    }

    /**
     * Gets the balance of the standard passenger.
     *
     * @return The balance of the standard passenger.
     */
    @Override
    public double getBalance() {
        return balance;
    }
}
