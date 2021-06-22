package com.company;

import com.company.Material;

public class Escudo implements Cloneable{
    private int dureza;
    private int diametro;
    private Material material;

    public Escudo(int dureza, int diametro, Material material){
        this.diametro = diametro;
        this.dureza = dureza;
        this.material = material;
    }

    public int getDureza() {
        return dureza;
    }

    public Escudo setDureza(int dureza) {
        this.dureza = dureza;
        return this;
    }

    public int getDiametro() {
        return diametro;
    }

    public Escudo setDiametro(int diametro) {
        this.diametro = diametro;
        return this;
    }

    public Material getMaterial() {
        return material;
    }

    public Escudo setMaterial(Material material) {
        this.material = material;
        return this;
    }

    @Override
    public Escudo clone() throws CloneNotSupportedException {
        return (Escudo) super.clone();
    }

    @Override
    public String toString() {
        return "Escudo{" +
                "dureza=" + dureza +
                ", diametro=" + diametro +
                ", material=" + material +
                '}';
    }
}
