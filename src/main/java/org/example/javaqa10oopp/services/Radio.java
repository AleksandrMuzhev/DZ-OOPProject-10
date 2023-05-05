package org.example.javaqa10oopp.services;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getNumberStation() {
        return currentStation;
    }

    public int getSoundVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void next() {
        int target = currentStation + 1;
        if (target > 9) {
            currentStation = 0;
        } else {
            currentStation = target;
        }
    }

    public void prev() {
        int target = currentStation - 1;
        if (target < 0) {
            currentStation = 9;
        } else {
            currentStation = target;
        }
    }

    public void setRandomStation(int newCurrentStation) {
        int target = newCurrentStation;
        setCurrentStation(target);
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
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
