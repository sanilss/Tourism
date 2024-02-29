# Travel Management System

This project implements a Travel Management System where users can create and manage travel packages, each consisting of various destinations, activities, and passengers. The system supports different types of passengers, including Standard, Gold, and Premium passengers, each with distinct functionalities. Passengers can sign up for activities, and the system enforces constraints such as capacity limits for each activity.

# Features

*TravelPackage:* Represents a travel package with a name, passenger capacity, destinations, and enrolled passengers.

*Destination:* Represents a destination with a name and a list of activities available at that destination.

*Activity:* Represents an activity with details like name, description, cost, capacity, and the destination it belongs to. It tracks signed-up passengers.

*Passenger:* Represents a general passenger with a name, passenger number, and a list of signed-up activities.

*StandardPassenger, GoldPassenger, PremiumPassenger:* Subtypes of passengers with specific functionalities based on the user type.

*TravelService:* Handles the business logic for managing travel packages, signing up passengers for activities, and providing information to the console view.

*ConsoleView:* Provides console-based views to display itinerary, passenger lists, details, and available activities.

# Usage

*Create Travel Package:* Instantiate TravelPackage with destinations and passengers.

*Add Destinations:* Create Destination instances and add them to the travel package.

*Add Activities:* Create Activity instances and add them to the respective destinations.

*Add Passengers:* Create Passenger instances (Standard, Gold, or Premium) and add them to the travel package.

*Sign Up Passengers:* Use TravelService to sign up passengers for activities.

*Print Information:* Utilize ConsoleView to print itinerary, passenger lists, details, and available activities.


# High Level Design Link

https://drive.google.com/file/d/1oiB1nC4uWgMvYSM6VTGyCk-Y58lJISe9/view?usp=sharing

