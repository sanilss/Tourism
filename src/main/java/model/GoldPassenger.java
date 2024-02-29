package model;

/**
 * Represents a gold passenger who has a balance and can avail a 10% discount on activity costs.
 */
public class GoldPassenger extends Passenger {

    private double balance;

    /**
     * Constructs a gold passenger with the given name, passenger number, and balance.
     *
     * @param name           The name of the gold passenger.
     * @param passengerNumber The passenger number.
     * @param balance        The initial balance of the gold passenger.
     */
    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    /**
     * Checks if the gold passenger has sufficient balance to sign up for a specific activity with a 10% discount.
     *
     * @param activity The activity to check for balance sufficiency.
     * @return True if the balance is sufficient, false otherwise.
     */
    @Override
    public boolean hasSufficientBalance(Activity activity) {
        double discountedCost = 0.9 * activity.getCost();
        return balance >= discountedCost;
    }

    /**
     * Gets the cost for the gold passenger to sign up for a specific activity with a 10% discount.
     *
     * @param activity The activity for which to calculate the cost.
     * @return The discounted cost for the activity.
     */
    @Override
    public double getCostForActivity(Activity activity) {
        double discountedCost = 0.9 * activity.getCost();
        deductBalance(discountedCost);
        return discountedCost;
    }

    /**
     * Deducts the specified amount from the gold passenger's balance.
     *
     * @param amount The amount to deduct from the balance.
     */
    @Override
    public void deductBalance(double amount) {
        balance -= amount;
    }

    /**
     * Gets the current balance of the gold passenger.
     *
     * @return The balance of the gold passenger.
     */
    public double getBalance() {
        return balance;
    }
}
