package com.company;

public class Traenke extends Gegenstaende{
    private final String Kategorie = "Trank";
    private String groesse;
    private int heilung;

    public Traenke(String name, String groesse, int heilung){
        super(name);
        this.groesse = groesse;
        this.heilung = heilung;
    }

    public String getGroesse() {
        return groesse;
    }
    public void setGroesse(String groesse) {
        this.groesse = groesse;
    }

    public int getHeilung() {
        return heilung;
    }
    public void setHeilung(int heilung) {
        this.heilung = heilung;
    }

}
