package org.pruebadiagnostica.figuras;

public class Triangulo extends Forma{
    private double base;
    private double altura;

    public Triangulo(double base, double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    @Override
    double calcularArea() {
        return (base*altura)/2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "color: " + color + ", base: " + base + ", altura: " + altura;
    }
}
