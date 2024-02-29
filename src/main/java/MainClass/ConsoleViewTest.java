package MainClass;

import model.*;
import view.ConsoleView;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ConsoleViewTest class contains JUnit tests for the ConsoleView class.
 */
class ConsoleViewTest {

    /**
     * Tests the displayItinerary method of the ConsoleView class.
     */
    @Test
    void testDisplayItinerary() {
        // Create sample destinations and activities
        Destination destination1 = new Destination("Destination 1");
        Activity activity1 = new Activity("Activity 1", "Description 1", 20.0, 5, destination1);
        Activity activity2 = new Activity("Activity 2", "Description 2", 30.0, 8, destination1);
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);

        Destination destination2 = new Destination("Destination 2");
        Activity activity3 = new Activity("Activity 3", "Description 3", 25.0, 6, destination2);
        destination2.addActivity(activity3);

        // Create a TravelPackage with the sample destinations
        List<Destination> destinations = new ArrayList<>();
        destinations.add(destination1);
        destinations.add(destination2);

        List<Passenger> passengers = new ArrayList<>();
        TravelPackage travelPackage = new TravelPackage("Test Package", 15, destinations, passengers);

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the displayItinerary method
        ConsoleView consoleView = new ConsoleView();
        consoleView.displayItinerary(travelPackage);

        // Restore System.out
        System.setOut(System.out);

        // Check if the printed output matches the expected output
        String expectedOutput = "Travel Package Itinerary:\n" +
                "Package Name: Test Package\n" +
                "\n" +
                "Destination: Destination 1\n" +
                "  Activity: Activity 1\n" +
                "    Cost: 20.0\n" +
                "    Capacity: 5\n" +
                "    Description: Description 1\n" +
                "  Activity: Activity 2\n" +
                "    Cost: 30.0\n" +
                "    Capacity: 8\n" +
                "    Description: Description 2\n" +
                "\n" +
                "Destination: Destination 2\n" +
                "  Activity: Activity 3\n" +
                "    Cost: 25.0\n" +
                "    Capacity: 6\n" +
                "    Description: Description 3\n";
        String normalizedExpectedOutput = expectedOutput.replaceAll("\r\n", "\n").trim();
        String normalizedActualOutput = outContent.toString().replaceAll("\r\n", "\n").trim();

        assertEquals(normalizedExpectedOutput, normalizedActualOutput);
        System.out.println("Expected Output: \n" + normalizedExpectedOutput);
        System.out.println("Actual Output: \n" + normalizedActualOutput);
    }

    // Additional test cases can be added for other methods in ConsoleView
}
