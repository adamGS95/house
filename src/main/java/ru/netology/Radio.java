package ru.netology;

public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;
    private int numStations;

    public Radio() {
        this(10);
    }

    public Radio(int numStations) {
        this.numStations = (numStations <= 0) ? 10 : numStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getNumStations() {
        return numStations;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= 0) {
            if (newCurrentStation < numStations) {
                currentStation = newCurrentStation;
            } else {
                currentStation = 0;
            }
        } else {
            currentStation = 0;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else if (newCurrentVolume > 100) {
            currentVolume = 100;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void next() {
        if (currentStation == numStations - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = numStations - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

