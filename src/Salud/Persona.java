package Salud;

import java.util.Scanner;

public class Persona {
    //Atributos
    private String tipoDoc;
    public int documento;
    public String nombre;
    public String apellido;
    public double peso;
    public double estatura;
    public int edad;
    public String sexo;
    public double pesoActual;


    //Métodos

    public void pedirDatos(){
        Scanner captura=new Scanner(System.in);
        System.out.println("ingrese los siguientes datos");

        System.out.println("ingrese su tipo de documento");
        tipoDoc=captura.next();

        System.out.println("ingrese su documento");
        documento=captura.nextInt();

        System.out.println("ingrese su nombre");
        nombre=captura.next();

        System.out.println("ingrese su apellido");
        apellido=captura.next();

        System.out.println("ingrese su peso");
        peso=captura.nextDouble();

        System.out.println("ingrese su estatura");
        estatura=captura.nextDouble();

        System.out.println("ingrese su edad");
        edad=captura.nextInt();

        System.out.println("Ingrese su sexo");
        sexo=captura.next();

    }

    public void mostrarPersona(){
      System.out.println("Su tipo de documento es:" +tipoDoc);
      System.out.println("Su  documento es:" +documento);
      System.out.println("Su nombre es:" +nombre);
      System.out.println("Su apellido es:" +apellido);
      System.out.println("Su peso es:" +peso);
      System.out.println("Su estatura es:" +estatura);
      System.out.println("Su edad es:" +edad);
      System.out.println("Su sexo es:" +sexo);
    
    }
    public void calculcarmc(){
       pesoActual=peso/estatura;
       
       if(pesoActual<20){
        System.out.println("el peso esta por debajo de lo ideal ");

       }else if(pesoActual>=20){
        System.out.println("el peso es ideal");
       }else if(pesoActual>25){
        System.out.println("usted tiene sobre peso");
       }else{
        System.out.println("error");
       }

        }
        public void mayorEdad(){
        if(edad>=18){
        System.out.println("usted es mayor de edad");
        }else if(edad<18){
        System.out.println("usted es menor de edad");
        }else{
        System.out.println("error");
        }
        }
    }



