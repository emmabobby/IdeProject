package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomaticBikeTest {
    @Test
    public void testThatBikeCanBeOn() {
        AutomaticBike automaticBike = new AutomaticBike();
        assertFalse(automaticBike.isOn());

        automaticBike.key();
        assertTrue(automaticBike.isOn());
    }

    @Test
    public void testThatBikeCanBeOff() {
        AutomaticBike automaticBike = new AutomaticBike();
        assertFalse(automaticBike.isOn());

        automaticBike.key();
        assertTrue(automaticBike.isOn());
        automaticBike.key();
        assertFalse(automaticBike.isOn());
    }

    @Test
    public void testThatBikeCanBeAccelerated() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.key();

        assertEquals(1, automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());

        automaticBike.accelerate();
        assertEquals(1, automaticBike.getSpeed());
        assertEquals(1, automaticBike.getGear());

    }

    @Test
    public void testThatBikeCanBeAcceleratedAndGearChangeToOne() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.key();

        assertEquals(1, automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());

        for (int counter = 0; counter < 20; counter++) {
            automaticBike.accelerate();
        }

        assertEquals(20, automaticBike.getSpeed());

        assertEquals(1, automaticBike.getGear());

    }

    @Test
    public void testThatBikeCanBeAcceleratedAndGearChangeToTwo() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.key();

        assertEquals(1, automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());

        for (int counter = 0; counter <= 20; counter++) {
            automaticBike.accelerate();
        }

        assertEquals(22, automaticBike.getSpeed());

        assertEquals(2, automaticBike.getGear());

    }


    @Test
    public void testThatBikeCanBeAcceleratedAndGearChangeToThree() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.key();

        assertEquals(1, automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());

        for (int counter = 0; counter <= 28; counter++) {
            automaticBike.accelerate();
        }
        assertEquals(42, automaticBike.getSpeed());

        assertEquals(3, automaticBike.getGear());
    }


    @Test
    public void testThatBikeCanBeAcceleratedAndGearChangeToFour() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.key();

        assertEquals(1, automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());

        for (int counter = 0; counter <= 32; counter++) {
            automaticBike.accelerate();
        }
        assertEquals(42, automaticBike.getSpeed());

        assertEquals(4, automaticBike.getGear());
    }


    @Test
    public void testThatBikeCanDecelerate() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.key();

        assertEquals(1, automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());

        for (int counter = 0; counter < 20; counter++) {
            automaticBike.accelerate();
        }
        assertEquals(20, automaticBike.getSpeed());

        automaticBike.decelerate();

        assertEquals(19, automaticBike.getSpeed());

    }

    @Test
    public void testThatBikeCanDecelerate2() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.key();

        assertEquals(1, automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());

        for (int counter = 0; counter < 20; counter++) {
            automaticBike.accelerate();
        }
        assertEquals(20, automaticBike.getSpeed());
        automaticBike.accelerate();
        automaticBike.decelerate();
        automaticBike.decelerate();
        assertEquals(19, automaticBike.getSpeed());


    }

    @Test
    public void testThatBikeCanDecelerate3() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.key();

        assertEquals(1, automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());

        for (int counter = 0; counter < 20; counter++) {
            automaticBike.accelerate();
        }
        assertEquals(20, automaticBike.getSpeed());
        automaticBike.accelerate();
        automaticBike.decelerate();
        automaticBike.decelerate();
        assertEquals(16, automaticBike.getSpeed());


    }

    @Test
    public void testThatBikeCanDecelerate4() {
        AutomaticBike automaticBike = new AutomaticBike();
        automaticBike.key();

        assertEquals(1, automaticBike.getGear());
        assertEquals(0, automaticBike.getSpeed());

        for (int counter = 0; counter < 20; counter++) {
            automaticBike.accelerate();
        }
        assertEquals(20, automaticBike.getSpeed());
        automaticBike.accelerate();
        automaticBike.decelerate();
        automaticBike.decelerate();
        assertEquals(12, automaticBike.getSpeed());
    }

}





