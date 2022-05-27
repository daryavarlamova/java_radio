package ru.netology;

public class Radio {

    private int countStantions = 10;
    private int currentNumberStantion = 0;
    private int currentVolume = 30;

    public Radio() {
    }

    public Radio(int countStantions) {
        this.countStantions = countStantions;
    }

    public int getcountStantions() {
        return countStantions;
    }

    public int getCurrentNumberStantion() {
        return currentNumberStantion;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCountStantions(int tempcountStantions) {
        countStantions = tempcountStantions;
    }

    public void setCurrentNumberStantion(int currentNumber) {
        if (currentNumber > countStantions - 1) {
            return;
        }
        if (currentNumber < 0) {
            return;
        }
        currentNumberStantion = currentNumber;
    }

    public void setCurrentVolume(int tempcurrentVolume) {
        if (tempcurrentVolume > 100) {
            return;
        }
        if (tempcurrentVolume < 0) {
            return;
        }
        currentVolume = tempcurrentVolume;
    }

    public void setNumberStationNext() {
        if (currentNumberStantion < countStantions - 1) {
            currentNumberStantion = currentNumberStantion + 1;
            return;
        }
        currentNumberStantion = countStantions - 1;
    }

    public void setNumberStationPrev() {
        if (currentNumberStantion > 0) {
            currentNumberStantion = currentNumberStantion - 1;
            return;
        }
        currentNumberStantion = countStantions - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return;
    }

}
