package org.pruebadiagnostica.model;

public class Desarrollador extends Empleado {

    private String lenguajePrograma;

    public Desarrollador(String nombre, int edad, double salario, String lenguajePrograma) {
        super(nombre, edad, salario);
        this.lenguajePrograma = lenguajePrograma;
    }

    public String getLenguajePrograma() {
        return lenguajePrograma;
    }

    public void setLenguajePrograma(String lenguajePrograma) {
        this.lenguajePrograma = lenguajePrograma;
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + "Esta trabajando en:" + lenguajePrograma);
    }

    @Override
    public void trabajar(String proyecto, String lenguajePrograma) {
        System.out.println(getNombre() + "esta trabajando en el proyecto llamado:" + proyecto + "con el lenguaje llamado:" + lenguajePrograma);
    }

    @Override
    public void trabajar(int horas) {
        System.out.println(getNombre() + "ha trabajado un total de " + horas + "horas.");
    }

}

