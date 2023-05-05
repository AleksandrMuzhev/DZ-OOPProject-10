package org.example.javaqa10oopp.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetToOverLimitStation1() {
        Radio station = new Radio();
        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToBelowLimitStation2() {
        Radio station = new Radio();
        station.setCurrentStation(-1);

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMediumLimitStation3() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        int expected = 5;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationStepAfterMax4() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.next();

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationStepBeforeMax5() {
        Radio station = new Radio();
        station.setCurrentStation(8);
        station.next();

        int expected = 9;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationStepBeforeMin6() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prev();

        int expected = 9;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevStationStepAfterMin7() {
        Radio station = new Radio();
        station.setCurrentStation(1);
        station.prev();

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetToRandomStation8() {
        Radio station = new Radio();
        station.setRandomStation(10);

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testHighBelowMaxLimitVolume9() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.setIncreaseOverMaxVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLowAfterMinLimitVolume10() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.setIncreaseBelowMinVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseOverMaxVolume11() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.setIncreaseOverMaxVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseBelowMinVolume12() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.setIncreaseBelowMinVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
