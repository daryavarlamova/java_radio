package ru.netology;

public class Radio {

    private int currentNumberStantion=10;
    private int countStantions=10;
    private int currentVolume=30;

    public Radio (){
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

    public void setCurrentNumberStantion(int currentNumber){
        if (currentNumber > countStantions) {
            return;
        }
        if (currentNumber < 0) {
            return;
        }
        currentNumberStantion=currentNumber;
    }
    public void setCurrentVolume(int tempcurrentVolume){
        if (tempcurrentVolume > 100) {
            return;
        }
        if (tempcurrentVolume < 0) {
            return;
        }
        currentVolume=tempcurrentVolume;
    }

    public void setNumberStationNext() {
        if (currentNumberStantion < countStantions) {
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
        currentNumberStantion = countStantions;
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
