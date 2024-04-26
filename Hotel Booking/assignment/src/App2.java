import java.util.Scanner;

public class App2 {
    static class Room {
        int number;
        String status;
        String guestName;
        String contactInfo;

        // Constructor to initialize a room with number and status
        public Room(int number, String status) {
            this.number = number;
            this.status = status;
            this.guestName = ""; // Initialize guest name as empty
            this.contactInfo = ""; // Initialize contact info as empty
        }

        // Method to reserve the room with guest details
        public void reserve(String guestName, String contactInfo) {
            this.status = "Occupied";
            this.guestName = guestName;
            this.contactInfo = contactInfo;
        }

        // Method to check out from the room
        public void checkOut() {
            this.status = "Vacant";
            this.guestName = ""; // Clear guest name
            this.contactInfo = ""; // Clear contact info
        }

        // Override toString method to display room details
        @Override
        public String toString() {
            return "Room " + number + " " + status + " Guest: " + guestName + " Contact: " + contactInfo;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Room[] rooms = { new Room(101, "Vacant"), new Room(102, "Occupied"), new Room(103, "Vacant") };

        System.out.println("Welcome to the Hotel Reservation System!\n");

        while (true) {
            System.out.println("1. View Available Rooms");
            System.out.println("2. Reserve a Room");
            System.out.println("3. Check Out");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    viewAvailableRooms(rooms);
                    break;
                case 2:
                    reserveRoom(rooms, scanner);
                    break;
                case 3:
                    checkOutRoom(rooms, scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the Hotel Reservation System.");
                    scanner.close(); // Close the scanner before exiting
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to display available rooms
    public static void viewAvailableRooms(Room[] rooms) {
        System.out.println("\nAvailable Rooms:");
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    // Method to reserve a room
    public static void reserveRoom(Room[] rooms, Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter your contact information: ");
        String contact = scanner.nextLine();

        System.out.println("\nAvailable Rooms:");
        for (Room room : rooms) {
            if (room.status.equals("Vacant")) {
                System.out.println(room);
            }
        }

        System.out.print("Enter the room number you want to reserve: ");
        int roomNumber = scanner.nextInt();

        for (Room room : rooms) {
            if (room.number == roomNumber && room.status.equals("Vacant")) {
                room.reserve(name, contact);
                System.out.println("Room " + roomNumber + " reserved successfully for " + name + ".");
                return;
            }
        }

        System.out.println("Invalid room number or room is already occupied.");
    }

    // Method to check out from a room
    public static void checkOutRoom(Room[] rooms, Scanner scanner) {
        System.out.println("\nOccupied Rooms:");
        for (Room room : rooms) {
            if (room.status.equals("Occupied")) {
                System.out.println(room);
            }
        }

        System.out.print("Enter the room number you want to check out: ");
        int roomNumber = scanner.nextInt();

        for (Room room : rooms) {
            if (room.number == roomNumber && room.status.equals("Occupied")) {
                room.checkOut();
                System.out.println("Room " + roomNumber + " checked out successfully.");
                return;
            }
        }

        System.out.println("Invalid room number or room is already vacant.");
    }
}
