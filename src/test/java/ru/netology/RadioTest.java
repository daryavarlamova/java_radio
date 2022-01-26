package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testgetCurrentNumberStantion() {
        Radio rad = new Radio();
        int expected = 0;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetNumberStationNext() {
        Radio rad = new Radio();
        rad.setCurrentNumberStantion(9);
        rad.setNumberStationNext();
        int expected = 0;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetNumberStationNext2() {
        Radio rad = new Radio();
        rad.setCurrentNumberStantion(8);
        rad.setNumberStationNext();
        int expected = 9;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetNumberStationPrev() {
        Radio rad = new Radio();
        rad.setCurrentNumberStantion(0);
        rad.setNumberStationPrev();
        int expected = 9;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetNumberStationPrev2() {
        Radio rad = new Radio();
        rad.setCurrentNumberStantion(7);
        rad.setNumberStationPrev();
        int expected = 6;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetCurrentNumberStantion() {
        Radio rad = new Radio();
        rad.setCurrentNumberStantion(8);
        int expected = 8;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetCurrentNumberStantion2() {
        Radio rad = new Radio();
        rad.setCurrentNumberStantion(10);
        int expected = 0;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testsetCurrentNumberStantion3() {
        Radio rad = new Radio();
        rad.setCurrentNumberStantion(-1);
        int expected = 0;
        int actual = rad.getCurrentNumberStantion();

        assertEquals(expected, actual);
    }
    @Test
    public void testincreaseVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(7);
        rad.increaseVolume();
        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testincreaseVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(9);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testincreaseVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.increaseVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testgetCurrentVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);
        int expected = 8;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testgetCurrentVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testgetCurrentVolume3() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testdecreaseVolume1() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);
        rad.decreaseVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void testdecreaseVolume2() {
        Radio rad = new Radio();
        rad.decreaseVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }
}