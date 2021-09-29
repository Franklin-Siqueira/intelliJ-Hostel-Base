package hostel.model;

import java.util.Objects;

public class Guest {
    private String lastName;
    private String firstName;
    private String roomNumber;

    public Guest(String lastName, String firstName, String roomNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.roomNumber = roomNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return lastName.equals(guest.lastName) && firstName.equals(guest.firstName) && roomNumber.equals(guest.roomNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, roomNumber);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
