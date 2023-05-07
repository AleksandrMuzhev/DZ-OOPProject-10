package org.example.javaqa10oopp.services;

public class Radio {
    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = 9;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentStation;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
        maxStation = amountStation - 1;
    }

    public Radio(int newCurrentStation, int maxStation) {
        newCurrentStation = newCurrentStation + 1;
        if (newCurrentStation > maxStation) {
            this.maxStation = amountStation - 1;
            this.currentStation = minStation;
        } else {
            this.currentStation = newCurrentStation;
        }
    }

    public Radio(int minStation, int newCurrentStation, int maxStation) {
        newCurrentStation = newCurrentStation - 1;
        if (newCurrentStation < minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = newCurrentStation;
        }
    }

//    public Radio(int newCurrentVolume, long minVolume, long maxVolume) {
//        newCurrentVolume = newCurrentVolume + 1;
//        if (newCurrentVolume > maxVolume) {
//            this.currentVolume = maxVolume;
//        } else {
//            this.currentVolume = newCurrentVolume;
//        }
//    }
//    public Radio(int newCurrentVolume, long minVolume, int maxVolume) {
//        newCurrentVolume = newCurrentVolume - 1;
//        if (newCurrentVolume < minVolume) {
//            this.currentVolume = minVolume;
//        } else {
//            this.currentVolume = newCurrentVolume;
//        }
//    }

    public int getNumberStation() {
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

    public int getSoundVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


//    public void setNext(int newCurrentStation) {
//        newCurrentStation = newCurrentStation + 1;
//        if (newCurrentStation > maxStation) {
//            currentStation = minStation;
//        } else {
//            currentStation = newCurrentStation;
//        }
//    }

//    public void setPrev(int newCurrentStation) {
//        newCurrentStation = newCurrentStation - 1;
//        if (newCurrentStation < minStation) {
//            currentStation = maxStation;
//        } else {
//            currentStation = newCurrentStation;
//        }
//    }

    public void setRandomStation(int newCurrentStation) {
        int target = newCurrentStation;
        setCurrentStation(target);
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
