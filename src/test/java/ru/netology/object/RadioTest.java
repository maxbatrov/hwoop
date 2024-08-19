package ru.netology.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void radioCreatWithParameter() {
        Radio radio = new Radio(30);
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(29, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentVollume());

    }

    @Test
    public void radioCreatWithoutParameter() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getCurrentVollume());
    }

    @Test
    public void changesStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(10);
        int expected = (10);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCurrentStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(35);
        int expected = (0);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchValueMoreMax() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(22);
        int expected = (22);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void lessMinValue() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(0);
        int expected = (0);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setDirectlyBellowMin() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(-1);
        int expected = (14);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextStation() {
        Radio radio = new Radio(20);
        radio.next();
        int expected = (1);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        int expected = (0);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCurrentVolume() {
        Radio radio = new Radio(100);
        radio.setCurrentVollume(48);
        int expected = (48);
        int actual = radio.getCurrentVollume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TurnUpTheVolume() {
        Radio radio = new Radio(99);
        radio.setCurrentVollume(100);
        int expected = (100);
        int actual = radio.getCurrentVollume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TurnDownVollume() {
        Radio radio = new Radio(87);
        radio.setCurrentVollume(86);
        int expected = (86);
        int actual = radio.getCurrentVollume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void increaseVolume() {
        Radio radio = new Radio(50);
        radio.increaseVollume();
        int expected = (1);
        int actual = radio.getCurrentVollume();
        Assertions.assertEquals(expected, actual);
    }

}
