package Rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {
    private Room room;
    @Before
    public void setUp() {
        room = new Room();
    }

    @Test
    public void getEnemies() {
        System.out.println(room.getEnemies());
    }
}