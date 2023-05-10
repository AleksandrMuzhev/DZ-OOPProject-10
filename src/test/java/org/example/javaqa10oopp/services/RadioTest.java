package org.example.javaqa10oopp.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testNonAmountStation1() {
        Radio station = new Radio();

        Assertions.assertEquals(10, station.getAmountStation());
    }

    @Test
    public void testDefaultAmountStation2() {
        Radio station = new Radio(10);

        Assertions.assertEquals(9, station.getMaxStation());
    }

    @Test
    public void testChangeNextOverLimitStation3() {
        Radio station = new Radio(10);
        station.setCurrentStation(9);
        station.next();

        Assertions.assertEquals(0, station.getCurrentStation());
    }


    @Test
    public void testChangeAmountStation4() {
        Radio station = new Radio(0, 30);

        Assertions.assertEquals(0, station.getMinStation());
        Assertions.assertEquals(29, station.getMaxStation());

    }

    @Test
    public void testChangePrevBelowLimitStation5() {
        Radio station = new Radio(10);
        station.setCurrentStation(0);
        station.prev();

        Assertions.assertEquals(9, station.getCurrentStation());
    }


    @Test
    public void testNextMediumLimitStation6() {
        Radio station = new Radio(10);
        station.setCurrentStation(5);
        station.next();

        Assertions.assertEquals(6, station.getCurrentStation());
    }

    @Test
    public void testPrevMediumLimitStation7() {
        Radio station = new Radio(10);
        station.setCurrentStation(4);
        station.prev();

        Assertions.assertEquals(3, station.getCurrentStation());
    }

    @Test
    public void testSetToOverLimitStation8() {
        Radio station = new Radio(10);
        station.setCurrentStation(10);

        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void testSetToBelowLimitStation9() {
        Radio station = new Radio(10);
        station.setCurrentStation(-1);

        Assertions.assertEquals(0, station.getCurrentStation());
    }

    @Test
    public void testSetToMediumLimitStation10() {
        Radio station = new Radio(10);
        station.setCurrentStation(5);

        Assertions.assertEquals(5, station.getCurrentStation());
    }

    @Test
    public void shouldSetToHighBelowMaxLimitVolume12() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.setIncreaseOverMaxVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLowAfterMinLimitVolume13() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.setIncreaseBelowMinVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseOverMaxVolume14() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.setIncreaseOverMaxVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseBelowMinVolume15() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.setIncreaseBelowMinVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
