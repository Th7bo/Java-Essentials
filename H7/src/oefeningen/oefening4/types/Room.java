package oefeningen.oefening4.types;

import oefeningen.oefening4.util.DirectionUtil;

public class Room {

    private String name;
    private Room[] doors = new Room[4];

    public Room(String name) {
        this.name = name;
    }

    public Room explore(Direction direction) {
        return doors[direction.ordinal()];
    }

    public String toString() {
        return name;
    }

    public void setDoor(Direction direction, Room room) {
        if (doors[direction.ordinal()] == null && room.doors[DirectionUtil.getOpposite(direction).ordinal()] == null) {
            doors[direction.ordinal()] = room;
            room.doors[DirectionUtil.getOpposite(direction).ordinal()] = this;
        }
    }

    public String getName() {
        return name;
    }

    public String getInstructions() {
        StringBuilder instructions = new StringBuilder("== " + name + " ==\nDoors here lead:\n");
        for (Direction direction : Direction.values()) {
            Room room = doors[direction.ordinal()];
            if (room != null) {
                instructions.append(direction).append(" ").append(room).append("\n");
            }
        }
        return instructions.toString();
    }
}
