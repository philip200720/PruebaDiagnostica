package org.pruebadiagnostica.Figuras;

public abstract class Forma {
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double calcularArea();
}
