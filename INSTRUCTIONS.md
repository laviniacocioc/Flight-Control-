Flight Control Application Implementation

=> In this project, I developed a flight control application designed to manage airplanes and their flight routes. The system keeps track of each airplane's identifier and capacity, as well as the details of various flights, which include the airplane used, departure airport ID (e.g., HEL), and destination airport ID (e.g., BAL).

=> Application Overview
The application operates in two main parts:
1. Airport Asset Control: The user can enter information about airplanes and flights.
2. Flight Information Service: The user can access various flight-related operations.
The application supports multiple airplanes and flights, allowing the same airplane to be scheduled for multiple flights.

=> User Interaction
When the program starts, the user is presented with a menu to choose actions in the airport asset control. The user can select from the following options:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control

=> If the user selects to add an airplane, they are prompted to enter the airplane ID and capacity. The same process occurs for adding flights, where the user provides the airplane ID, departure airport ID, and destination airport ID.

=> Here’s an example of how the user interacts with the application:

Airport Asset Control
Choose an action:
[1] Add an airplane
[2] Add a flight
[x] Exit Airport Asset Control
> 1
Give the airplane id: HA-LOL
Give the airplane capacity: 42

=> After entering airplane and flight details, the user can exit the airport asset control and proceed to the flight information service.

=> Flight Information Service
In the flight information service, the user can perform three key operations:
[1] Print airplanes: This option lists all airplanes with their IDs and capacities.
[2] Print flights: This option displays all flights, showing the airplane capacity along with departure and destination airport IDs.
[3] Print airplane details: This option allows the user to enter an airplane ID and view its details.
The user can also choose to exit the flight information service by selecting [x] Quit.

=> Example interactions in the flight information service include:

Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
> 1
G-OWAC (101 capacity)
HA-LOL (42 capacity)

=> Another interaction example for printing flights:

Choose an action:
[1] Print airplanes
[2] Print flights
[3] Print airplane details
[x] Quit
> 2
HA-LOL (42 capacity) (HEL-BAL)
HA-LOL (42 capacity) (BAL-HEL)
G-OWAC (101 capacity) (JFK-BAL)

=> Final Exit
The user can exit the program at any point by entering [x] in either the airport asset control or flight information service menus.

=> Overall, the flight control application effectively manages airplanes and their flight routes while providing a user-friendly interface for data entry and retrieval.
