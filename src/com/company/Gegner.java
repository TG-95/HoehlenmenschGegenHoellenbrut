package com.company;

public class Gegner {

    // Gegner Variablen
    private String gegnerName;
    private int gegnerHp;
    private int getGegnerHpMax;
    private int gegnerSchadenMin;
    private int gegnerSchadenMax;
    private int lvl;
    private int gegnerHaeufigkeit;
    private int KillCounter;

    public String getGegnerName() {
        return gegnerName;
    }

    public void setGegnerName(String gegnerName) {
        this.gegnerName = gegnerName;
    }

    public int getGegnerHp() {
        return gegnerHp;
    }

    public void setGegnerHp(int gegnerHp) {
        this.gegnerHp = gegnerHp;
    }

    public int getGegnerHpMax() {
        return getGegnerHpMax;
    }

    public void setGegnerHpMax(int getGegnerHpMax) {
        this.getGegnerHpMax = getGegnerHpMax;
    }

    public int getGegnerSchadenMin() {
        return gegnerSchadenMin;
    }

    public int getGegnerSchadenMax() {
        return gegnerSchadenMax;
    }

    public void setGegnerSchadenMax(int gegnerSchadenMax) {
        this.gegnerSchadenMax = gegnerSchadenMax;
    }

    public void setGegnerSchadenMin(int gegnerSchadenMin) {
        this.gegnerSchadenMin = gegnerSchadenMin;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getGegnerHaeufigkeit() {
        return gegnerHaeufigkeit;
    }

    public void setGegnerHaeufigkeit(int gegnerHaeufigkeit) {
        this.gegnerHaeufigkeit = gegnerHaeufigkeit;
    }

    public int getKillCounter() {
        return KillCounter;
    }

    public void setKillCounter(int killCounter) {
        KillCounter = killCounter;
    }
}
