package ru.netology.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void validStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validMinStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validMaxStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validBellowMinStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validAboveMinStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validBellowMaxStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validAboveMaxStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validLevelVolume() {
        Radio radio = new Radio();

        radio.setCurrentVollume(50);

        int expected = 50;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validMinLevelVolume() {
        Radio radio = new Radio();

        radio.setCurrentVollume(0);

        int expected = 0;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validMaxLevelVolume() {
        Radio radio = new Radio();

        radio.setCurrentVollume(100);

        int expected = 100;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validBellowMinLevelVolume() {
        Radio radio = new Radio();

        radio.setCurrentVollume(-1);

        int expected = 0;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validAboveMinLevelVolume() {
        Radio radio = new Radio();

        radio.setCurrentVollume(1);

        int expected = 1;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validBellowMaxLevelVolume() {
        Radio radio = new Radio();

        radio.setCurrentVollume(99);

        int expected = 99;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void validAboveMaxLevelVolume() {
        Radio radio = new Radio();

        radio.setCurrentVollume(101);

        int expected = 0;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVollume(50);

        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1AboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVollume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1FromMax() {
        Radio radio = new Radio();
        radio.setCurrentVollume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume1ToMin() {
        Radio radio = new Radio();
        radio.setCurrentVollume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVollume(50);

        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1BelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVollume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1ToMin() {
        Radio radio = new Radio();
        radio.setCurrentVollume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1FromMax() {
        Radio radio = new Radio();
        radio.setCurrentVollume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVollume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationToMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationFromMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationFromMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationToMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationToMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


}
