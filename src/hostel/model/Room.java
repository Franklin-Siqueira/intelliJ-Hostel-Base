package hostel.model;

import java.util.Objects;

public class Room {

    private String roomNumber;
    private String roomClass;
    private Integer roomBeds;
    private Boolean roomStatus;

    public Room(String roomNumber, String roomClass, Integer roomBeds, Boolean roomStatus) {
        this.roomNumber = roomNumber;
        this.roomClass = roomClass;
        this.roomBeds = roomBeds;
        this.roomStatus = true;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomClass() {
        return roomClass;
    }

    public void setRoomClass(String roomClass) {
        this.roomClass = roomClass;
    }

    public Integer getRoomBeds() {
        return roomBeds;
    }

    public void setRoomBeds(Integer roomBeds) {
        this.roomBeds = roomBeds;
    }

    public Boolean getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Boolean roomStatus) {
        this.roomStatus = roomStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber.equals(room.roomNumber) && roomClass.equals(room.roomClass) && roomBeds.equals(room.roomBeds) && roomStatus.equals(room.roomStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, roomClass, roomBeds, roomStatus);
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", roomClass='" + roomClass + '\'' +
                ", roomBeds=" + roomBeds + '\'' +
                ", roomStatus=" + roomStatus +
                '}';
    }
}
