package com.company;

public class Espada implements Cloneable{

    private int dureza;
    private int comprimento;
    private Material material;

    public Espada(int dureza, int comprimento, Material material){
        this.comprimento = comprimento;
        this.dureza = dureza;
        this.material = material;
    }

    public int getDureza() {
        return dureza;
    }

    public Espada setDureza(int dureza) {
        this.dureza = dureza;
        return this;
    }

    public int getComprimento() {
        return comprimento;
    }

    public Espada setComprimento(int comprimento) {
        this.comprimento = comprimento;
        return this;
    }

    public Material getMaterial() {
        return material;
    }

    public Espada setMaterial(Material material) {
        this.material = material;
        return this;
    }

    @Override
    public Espada clone() throws CloneNotSupportedException {
        return (Espada) super.clone();
    }

    @Override
    public String toString() {
        return "Espada{" +
                "dureza=" + dureza +
                ", comprimento=" + comprimento +
                ", material=" + material +
                '}';
    }
}
