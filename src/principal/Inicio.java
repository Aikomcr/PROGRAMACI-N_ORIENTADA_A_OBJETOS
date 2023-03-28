package principal;

import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {


        //crear un objeto para poder ejecutar

       Persona panda = new Persona();
        //invocando un método 
        panda.pedirDatos();
        panda.mostrarPersona(); 
        panda.calculcarmc();
        panda.mayorEdad();
    

    }
}
