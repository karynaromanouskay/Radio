package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation != 9) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void setPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
            return;
        }
        currentStation = 9;
    }


    public void setNextVolume() {
        if (currentVolume >= 100) {
            return;
        }

        currentVolume++;
    }

    public void setPrevVolume() {
        if (currentVolume <= 0) {
            return;
        }
        currentVolume--;
    }
}
