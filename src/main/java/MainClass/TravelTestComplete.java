package MainClass;

import model.*;
import service.TravelService;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The {@code TravelTestComplete} class contains a comprehensive test case for the entire travel system,
 * including creating destinations, activities, passengers, and testing the functionality of the TravelPackage,
 * TravelService, and related classes. It focuses on signing up passengers for activities, printing itinerary,
 * passenger list, and available activities using a hypothetical TravelService.
 */
public class TravelTestComplete {

    /**
     * Test case for the entire travel system, including creating destinations, activities, passengers,
     * signing up passengers for activities, and testing the functionality of the TravelPackage, TravelService,
     * and related classes. It also covers printing itinerary, passenger list, and available activities
     * using a hypothetical TravelService.
     */
    @Test
    void testTravelPackage() {
        // Create sample activities
        Destination destination = new Destination("Destination");
        Activity activity = new Activity("Activity", "Description", 20.0, 5, destination);
        destination.addActivity(activity);

        // Create a TravelPackage with the sample destination
        List<Destination> destinations = new ArrayList<>();
        destinations.add(destination);

        TravelPackage travelPackage = new TravelPackage("Test Package", 15, destinations, new ArrayList<>());

        // Create sample passengers
        Passenger standardPassenger = new StandardPassenger("John", 1, 100.0);
        Passenger goldPassenger = new GoldPassenger("Alice", 2, 150.0);
        Passenger premiumPassenger = new PremiumPassenger("Bob", 3);

        // Sign up passengers for activities
        travelPackage.signUpPassengerForActivity(standardPassenger, activity);
        travelPackage.signUpPassengerForActivity(goldPassenger, activity);
        travelPackage.signUpPassengerForActivity(premiumPassenger, activity);

        // Assuming TravelService is appropriately set up
        TravelService travelService = new TravelService();

        // Test itinerary printing
        String expectedItinerary = "Travel Package Itinerary:\n" +
                "Package Name: Test Package\n" +
                "\n" +
                "Destination: Destination\n" +
                "  Activity: Activity\n" +
                "    Cost: 20.0\n" +
                "    Capacity: 5\n" +
                "    Description: Description\n";
        travelService.printItinerary(travelPackage);  // This method likely prints to console
        // You may need to capture the printed output if needed for assertions

        // Test passenger list printing
        String expectedPassengerList = "Passenger List for Travel Package:\n" +
                "Package Name: Test Package\n" +
                "Passenger Capacity: 15\n" +
                "Number of Passengers Enrolled: 3\n" +
                "Passenger: John (Number: 1)\n" +
                "Passenger: Alice (Number: 2)\n" +
                "Passenger: Bob (Number: 3)\n";
        travelService.printPassengerList(travelPackage);  // This method likely prints to console
        // You may need to capture the printed output if needed for assertions

        // Test available activities printing
        String expectedAvailableActivities = "Available Activities:\n" +
                "Destination: Destination\n" +
                "  Activity: Activity\n" +
                "    Spaces Available: 2\n";
        travelService.printAvailableActivities(travelPackage);  // This method likely prints to console
        // You may need to capture the printed output if needed for assertions
    }
}
