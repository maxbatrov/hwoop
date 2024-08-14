package ru.netology.object;

public class Radio {
    private int currentStation;
    private int currentVollume;

    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
    }


    public void increaseVolume() {
        if (currentVollume < 100) {
            currentVollume = currentVollume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVollume > 0) {
            currentVollume = currentVollume - 1;
        }
    }


    public int getCurrentStation() {
        return currentStation;
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

    public int getCurrentVollume() {
        return currentVollume;
    }

    public void setCurrentVollume(int currentVollume) {
        if (currentVollume < 0) {
            return;
        }
        if (currentVollume > 100) {
            return;
        }
        this.currentVollume = currentVollume;
    }
}
