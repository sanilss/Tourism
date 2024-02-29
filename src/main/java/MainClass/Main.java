//package MainClass;
//
//import java.util.List;
//import model.StandardPassenger;
//import model.GoldPassenger;
//import model.Passenger;
//import model.Activity;
//import model.Destination;
//import model.TravelPackage;
//import service.TravelService;
//import view.ConsoleView;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // Create instances of your service, model, and view classes
//        TravelService travelService = new TravelService();
//        ConsoleView consoleView = new ConsoleView();
//
//        // Create destinations
//        Destination destination1 = new Destination("City1");
//        Destination destination2 = new Destination("City2");
//
//        // Create activities for each destination
//        Activity activity1 = new Activity("Sightseeing", "Explore the city", 50.0, 20, destination1);
//        Activity activity2 = new Activity("Hiking", "Enjoy nature", 30.0, 15, destination2);
//
//        // NOTE: In the absence of an 'addActivity' method, assign activities directly to the destination
//        destination1.setActivities(List.of(activity1));
//        destination2.setActivities(List.of(activity2));
//
//        // Create passengers
//        Passenger passenger1 = new StandardPassenger("John", 1, 100.0);
//        Passenger passenger2 = new GoldPassenger("Alice", 2, 150.0);
//
//        // Create a TravelPackage with destinations and passengers
//        TravelPackage travelPackage = new TravelPackage("Vacation Package", 30, List.of(destination1, destination2), List.of(passenger1, passenger2));
//
//        // Use the service to perform actions
//        travelService.addTravelPackage(travelPackage);
//        travelService.signUpPassengerForActivity(travelPackage, passenger1, activity1);
//
//        // Print information using ConsoleView
//        consoleView.displayItinerary(travelPackage);
//        consoleView.displayPassengerList(travelPackage);
//        consoleView.displayPassengerDetails(passenger1);
//        consoleView.displayAvailableActivities(travelService.getAvailableActivities(travelPackage));
//    }
//}
