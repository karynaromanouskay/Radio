package org.example;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = maxStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
        this.minVolume = 0;
        this.maxVolume = 9;
        this.currentStation = maxStation;
    }

    public Radio(int size) {
        this.maxStation = size - 1;
    }

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

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (currentStation < minStation) {
            currentStation = minStation;
        }
        if (currentStation > maxStation) {

            currentStation = maxStation;

        }
    }

    public void setNextStation() {
        currentStation++;
        if (currentStation > maxStation) {
            currentStation = minStation;

        }

    }

    public void setPrevStation() {
        currentStation--;
        if (currentStation < minStation) {
            currentStation = maxStation;

        }

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
