package principal;
//Se importan las clases
import Salud.*;


    //Se crea la Clase de Inicio
public class Inicio {

    //Metodo Main para la Ejecucion
    public static void main(String[] args) {

        //Se instancia un nuevo objeto en la clase persona
        persona Persona = new persona();

        empleado Empleado = new empleado();


        //Metodos de las clases
        Empleado.pedirDatos();

        Empleado.mostrarEmpleado();

        Persona.pedirdatos();

        Persona.mostrarpersona();
        

        //Datos del indice de masa corporal de la persona
        System.out.println("IMC: " + Persona.calcularImc());

        //confirma si es mayor o menor de edad con una sentencia if
        if (Persona.mayorEdad()) {

            System.out.println("Es mayor de edad");

        } else {

            System.out.println("Es menor de edad");

        }
    }
}
