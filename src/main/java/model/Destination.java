package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a destination within a travel package. Destinations have a name and a list of activities available.
 */
public class Destination {

    private String name;
    private List<Activity> activities;

    /**
     * Constructs a destination with an empty list of activities.
     */
    public Destination() {
        super();
        this.activities = new ArrayList<>();
    }

    /**
     * Constructs a destination with the given name and an empty list of activities.
     *
     * @param name The name of the destination.
     */
    public Destination(String name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    /**
     * Gets the name of the destination.
     *
     * @return The name of the destination.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the destination.
     *
     * @param name The name to set for the destination.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the list of activities available at the destination.
     *
     * @return The list of activities.
     */
    public List<Activity> getActivities() {
        return activities;
    }

    /**
     * Sets the list of activities available at the destination.
     *
     * @param activities The list of activities to set.
     */
    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    /**
     * Constructs a destination with the given name and list of activities.
     *
     * @param name       The name of the destination.
     * @param activities The list of activities available at the destination.
     */
    public Destination(String name, List<Activity> activities) {
        this.name = name;
        this.activities = activities;
    }

    /**
     * Adds an activity to the list of activities available at the destination.
     *
     * @param activity The activity to add.
     */
    public void addActivity(Activity activity) {
        activities.add(activity);
    }
}
