package com.company;

public class Waffen extends Gegenstaende {

    int zusatzSchaden;
    int dropWahrscheinlichkeit;

    public Waffen(String name) {
        super(name);
    }

    public Waffen(String name, int zusatzSchaden, int dropWahrscheinlichkeit)  {
        super(name);
        this.zusatzSchaden = zusatzSchaden;
        this.dropWahrscheinlichkeit = dropWahrscheinlichkeit;
    }

    public int getZusatzSchaden() {
        return zusatzSchaden;
    }
    public void setZusatzSchaden(int zusatzSchaden) {
        this.zusatzSchaden = zusatzSchaden;
    }

    public int getDropWahrscheinlichkeit() {
        return dropWahrscheinlichkeit;
    }
    public void setDropWahrscheinlichkeit(int dropWahrscheinlichkeit) {
        this.dropWahrscheinlichkeit = dropWahrscheinlichkeit;
    }
}
