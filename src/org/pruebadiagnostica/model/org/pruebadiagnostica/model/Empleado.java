
package org.pruebadiagnostica.model;


public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double isSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public abstract void trabajar();
    
    public void trabajar(int horas){
        System.out.println(getNombre() + "ha trabajado un total de " + horas + "horas.");
    }
    
    public void trabajar(String proyecto){
        System.out.println(getNombre() + "esta trabajando en el proyecto llamado:" + proyecto);
        
    }
    
    
    public void trabajar(String herramienta, String proyecto){
        System.out.println("La herramienta que utiliza es" + herramienta + "Nombre del proyecto:" + proyecto);
    }
    
    
}

