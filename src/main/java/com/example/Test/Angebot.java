package com.example.test;

public class Angebot {

    private String titel;
    private String name;

    public Angebot(String titel, String name) {
        this.titel = titel;
        this.name = name;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
