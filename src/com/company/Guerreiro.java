package com.company;

import com.company.Poder;
import com.company.Raca;

public class Guerreiro implements Cloneable{
    private Poder poder;
    private Raca raca;
    private Escudo escudo;
    private Espada espada;

    public Poder getPoder() {
        return poder;
    }

    public Guerreiro setPoder(Poder poder) {
        this.poder = poder;
        return this;
    }

    public Raca getRaca() {
        return raca;
    }

    public Guerreiro setRaca(Raca raca) {
        this.raca = raca;
        return this;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public Guerreiro setEscudo(Escudo escudo) {
        this.escudo = escudo;
        return this;
    }

    public Espada getEspada() {
        return espada;
    }

    public Guerreiro setEspada(Espada espada) {
        this.espada = espada;
        return this;
    }

    public Guerreiro(Poder poder, Raca raca, Escudo escudo, Espada espada){
        this.poder = poder;
        this.raca = raca;
        this.escudo = escudo;
        this.espada = espada;
    }

    @Override
    public Guerreiro clone() throws CloneNotSupportedException {
        Guerreiro guerreiroTemp = (Guerreiro) super.clone();
        guerreiroTemp.setEspada(guerreiroTemp.getEspada().clone());
        guerreiroTemp.setEscudo(guerreiroTemp.getEscudo().clone());

        return guerreiroTemp;
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "poder=" + poder +
                ", raca=" + raca +
                ", escudo=" + escudo +
                ", espada=" + espada +
                '}';
    }
}
