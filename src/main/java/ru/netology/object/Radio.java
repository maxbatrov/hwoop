package ru.netology.object;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation = minStation;
    private int currentVollume;

    public void next() {
        int target = currentStation + 1;
        setCurrentStation(target);
    }


    public Radio(int size) {
        maxStation = minStation + size - 1;

    }

    public Radio() {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVollume() {
        return currentVollume;
    }


    public void increaseVollume() {
        int target = currentVollume + 1;
        setCurrentVollume(target);
    }


    public void setCurrentVollume(int newCurrentVolume) {
        currentVollume = newCurrentVolume;
    }
}
