package org.example.javaqa10oopp.services;

public class Radio {
    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;


    public Radio(int amountStation) {
        this.maxStation = amountStation - 1;
        this.amountStation = maxStation;
    }

    public Radio() {
    }

    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > amountStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void next() {
        int target = currentStation + 1;
        if (target > amountStation) {
            currentStation = minStation;
        } else {
            currentStation = target;
        }
    }

    public void prev() {
        int target = currentStation - 1;
        if (target < minStation) {
            currentStation = maxStation;
        } else {
            currentStation = target;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setIncreaseOverMaxVolume() {
        int target = currentVolume + 1;
        setCurrentVolume(target);
    }

    public void setIncreaseBelowMinVolume() {
        int target = currentVolume - 1;
        setCurrentVolume(target);
    }
}
