public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getNumberStation() {
        return currentStation;
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


    public void setNext(int newCurrentStation) {
        newCurrentStation = newCurrentStation + 1;
        if (newCurrentStation > 9) {
            currentStation = 0;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void setPrev(int newCurrentStation) {
        newCurrentStation = newCurrentStation - 1;
        if (newCurrentStation < 0) {
            currentStation = 9;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void setRandomStation(int newCurrentStation) {
        int target = newCurrentStation;
        setCurrentStation(target);
    }


    public int getSoundVolume() {
        return currentVolume;
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
