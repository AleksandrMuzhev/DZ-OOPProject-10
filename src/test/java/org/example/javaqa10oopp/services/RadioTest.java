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
        Radio station = new Radio(9, 9);

        Assertions.assertEquals(9, station.getMaxStation());
        Assertions.assertEquals(0, station.getNumberStation());
    }


    @Test
    public void testChangePrevBelowLimitStation4() {
        Radio station = new Radio(0, 0, 9);

        Assertions.assertEquals(0, station.getMinStation());
        Assertions.assertEquals(9, station.getMaxStation());
        Assertions.assertEquals(9, station.getNumberStation());
    }


    @Test
    public void testNextMediumLimitStation5() {
        Radio station = new Radio(5, 9);

        Assertions.assertEquals(9, station.getMaxStation());
        Assertions.assertEquals(6, station.getNumberStation());
    }

    @Test
    public void testPrevMediumLimitStation6() {
        Radio station = new Radio(0, 4, 9);

        Assertions.assertEquals(0, station.getMinStation());
        Assertions.assertEquals(9, station.getMaxStation());
        Assertions.assertEquals(3, station.getNumberStation());
    }

    @Test
    public void testSetToOverLimitStation7() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetToBelowLimitStation8() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetToMediumLimitStation9() {
        Radio station = new Radio();

        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToRandomStation10() {
        Radio station = new Radio();
        station.setRandomStation(10);

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToHighBelowMaxLimitVolume11() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);

        volume.setIncreaseOverMaxVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLowAfterMinLimitVolume12() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.setIncreaseBelowMinVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseOverMaxVolume13() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.setIncreaseOverMaxVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseBelowMinVolume14() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.setIncreaseBelowMinVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
