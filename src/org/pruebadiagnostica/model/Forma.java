package org.pruebadiagnostica.model;

public abstract class Forma {
    private String color;

    public abstract void calcularArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }    
}
