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
    public void shouldSetToNextStationStepAfterMax4() {
        Radio station = new Radio();

        station.setNext(9);

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToNextStationStepBeforeMax5() {
        Radio station = new Radio();

        station.setNext(7);

        int expected = 8;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationStepBeforeMin6() {
        Radio station = new Radio();

        station.setPrev(0);

        int expected = 9;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToPrevStationStepAfterMin7() {
        Radio station = new Radio();

        station.setPrev(2);

        int expected = 1;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToRandomStation8() {
        Radio station = new Radio();

        station.setRandomStation(10);

        int expected = 0;
        int actual = station.getNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToLimitVolume9() {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetIncreaseOverMaxVolume10() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);

        volume.setIncreaseOverMaxVolume();

        int expected = 100;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseBelowMinVolume11() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.setIncreaseBelowMinVolume();

        int expected = 0;
        int actual = volume.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
