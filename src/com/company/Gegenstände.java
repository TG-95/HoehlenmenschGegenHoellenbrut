package com.company;

abstract class Gegenstaende {
    private String name;
    private String Kategorie;
    private int preis;

    public Gegenstaende(String name){
    this.name = name;
    }

    public Gegenstaende(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getKategorie() {
        return Kategorie;
    }
    public void setKategorie(String kategorie) {
        Kategorie = kategorie;
    }

    public int getPreis() {
        return preis;
    }
    public void setPreis(int preis) {
        this.preis = preis;
    }
}
