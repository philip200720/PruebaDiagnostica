package org.pruebadiagnostica.dispositivos;

public class DispositivosController {
    {
        Telefono telefono1 = new Telefono("Apple", "iPhone 12", 2019, "Standard");
        Telefono telefono2 = new Telefono("Samsung", "Galaxy S23", 2020, "Ultra");
        Telefono telefono3 = new Telefono("Google", "Pixel 9", 2024, "Standard");
    
        Computadora computadora1 = new Computadora("Apple", "MacBook Pro", 2023, "macOS");
        Computadora computadora2 = new Computadora("Lenovo", "ThinkPad X1", 2020, "Linux");
        Computadora computadora3 = new Computadora("Microsoft", "Surface Laptop", 2023, "Windows");
    
        Televisor televisor1 = new Televisor("Samsung", "Smart TV", 2020, "4K");
        Televisor televisor2 = new Televisor("Hisense", "TV 4K", 2019, "1080p");
        Televisor televisor3 = new Televisor("Apple", "Apple TV 4K", 2020, "4K");


        telefono1.mostrarInformacion();
        telefono2.mostrarInformacion();
        telefono3.mostrarInformacion();

        computadora1.mostrarInformacion();
        computadora2.mostrarInformacion();
        computadora3.mostrarInformacion();

        televisor1.mostrarInformacion();
        televisor2.mostrarInformacion();
        televisor3.mostrarInformacion();

        telefono1.encender("1234");
        telefono2.encender(50.0);
        telefono3.encender();

        computadora1.encender("abc123");
        computadora2.encender(120.5);
        computadora3.encender();

        televisor1.encender(69);
        televisor2.encender(60.0);
        televisor3.encender();
    }
}