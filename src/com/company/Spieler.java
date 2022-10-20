package com.company;

public class Spieler {

    // Spieler Variablen
    private int spielerHp = 100;
    private int spielerHpMax = 100;
    private int spielerSchadenMin = 20;
    private int spielerSchadenMax = 25;
    private int spielerEp = 0;
    private int spielerLvl = 1;

    public int getSpielerHp() {
        return spielerHp;
    }
    public void setSpielerHp(int spielerHp) {
        this.spielerHp = spielerHp;
    }

    public int getSpielerHpMax() {
        return spielerHpMax;
    }
    public void setSpielerHpMax(int spielerHpMax) {
        this.spielerHpMax = spielerHpMax;
    }

    public int getSpielerSchadenMin() {
        return spielerSchadenMin;
    }
    public void setSpielerSchadenMin(int spielerSchadenMin) {
        this.spielerSchadenMin = spielerSchadenMin;
    }

    public int getSpielerSchadenMax() {
        return spielerSchadenMax;
    }
    public void setSpielerSchadenMax(int spielerSchadenMax) {
        this.spielerSchadenMax = spielerSchadenMax;
    }

    public int getSpielerEp() {
        return spielerEp;
    }
    public void setSpielerEp(int spielerEp) {
        this.spielerEp = spielerEp;
    }

    public int getSpielerLvl() {
        return spielerLvl;
    }
    public void setSpielerLvl(int spielerLvl) {
        this.spielerLvl = spielerLvl;
    }

}
