package hostel;

import hostel.model.Guest;
import hostel.model.Room;

public class Hostel {
    public static void main(String[] args) {
        // To do: Rates class,

        /*int a = 2;
        int b = 1;
        System.out.println("Hello world!..." + (a+b));*/

        Room firstClassOne = new Room("101", "first", 4, true );
        Guest newGuestOne = new Guest("Garfunkel", "Simon", "101");

        System.out.println("Room: " + firstClassOne.getRoomNumber());
        System.out.println("Guest's Last Name: " + newGuestOne.getLastName());
    }
}
