package org.pruebadiagnostica.system;

import org.pruebadiagnostica.model.Desarrollador;
import org.pruebadiagnostica.model.Tester;

public class DiagnosticoPoo {
    public static void main(String[] args) {
        
        Desarrollador desarrollador = new Desarrollador("filipo", 20, 5800.0, "Java");
        Tester testeo = new Tester("josepghisto", 25, 15600.0, "poo ejercicio");
       
        desarrollador.trabajar(); 
        desarrollador.trabajar("Prueba interesante de POO");
        desarrollador.trabajar(5);
        
        testeo.trabajar();
        testeo.trabajar("Netbeans", "DiagnostigoPoo");
        testeo.trabajar(8);
        
    }
}


























