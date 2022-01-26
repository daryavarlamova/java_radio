package ru.netology;

public class Radio {

    private int currentNumberStantion;
    private int currentVolume;

    public int getCurrentNumberStantion() {
        return currentNumberStantion;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentNumberStantion(int currentNumber){
        if (currentNumber > 9) {
            return;
        }
        if (currentNumber < 0) {
            return;
        }
        currentNumberStantion=currentNumber;
    }
    public void setCurrentVolume(int tempcurrentVolume){
        if (tempcurrentVolume > 10) {
            return;
        }
        if (tempcurrentVolume < 0) {
            return;
        }
        currentVolume=tempcurrentVolume;
    }

    public void setNumberStationNext() {
        if (currentNumberStantion < 9) {
            currentNumberStantion = currentNumberStantion + 1;
            return;
        }
        currentNumberStantion = 0;
    }

    public void setNumberStationPrev() {
        if (currentNumberStantion > 0) {
            currentNumberStantion = currentNumberStantion - 1;
            return;
        }
        currentNumberStantion = 9;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
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
