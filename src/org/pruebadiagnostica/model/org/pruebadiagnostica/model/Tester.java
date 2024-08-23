
package org.pruebadiagnostica.model;


public class Tester extends Empleado {
    String tipoPruebas;
    
   public Tester(String nombre, int edad, double salario, String tipoPrueba) {
        super(nombre, edad, salario);
        this.tipoPruebas = tipoPruebas;
    }

    public String getTipoPruebas() {
        return tipoPruebas;
    }

    public void setTipoPruebas(String tipoPruebas) {
        this.tipoPruebas = tipoPruebas;
    }
    @Override
    public void trabajar(String herramienta, String proyecto){
        System.out.println("La herramienta que utiliza es" + herramienta + " y el nombre del proyecto:" + proyecto);
    }
    @Override
    public void trabajar(){
        System.out.println(getNombre() + "esta realizando" + tipoPruebas);
        
    }
    
    @Override
    public void trabajar(int horas) {
        System.out.println(getNombre() + "ha trabajado un total de " + horas + "horas.");
    }
    
    
}

