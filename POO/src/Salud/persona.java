package Salud;
import java.util.Scanner;
public class persona {

    //Se declaran las variables con identificador de Acceso Privado

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    
    //Metodo Setters
    public persona(String tipoDoc, int documento, String nombre, 
                    String apellido, double peso, double estatura, 
                    int edad, String sexo) {

        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    
    public persona() {
    }

    public void pedirdatos(){
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese a continuacion los siguientes Datos");

        System.out.print("Tipo de Identificacion "); tipoDoc = lectura.next();

        System.out.print("Ingrese su numero de documento "); documento = lectura.nextInt();
        
        System.out.print("ingrese su nombre "); nombre=lectura.next();

        System.out.print("ingrese su apellido "); apellido=lectura.next();

        System.out.print("Ingrese Estatura "); estatura=lectura.nextDouble();

        System.out.print("Ingrese peso "); peso=lectura.nextDouble();
        
        System.out.print("Ingrese Edad "); edad=lectura.nextInt();
        
        System.out.print("Ingrese Sexo "); sexo=lectura.next();
    }

    public void mostrarpersona(){
        System.out.println("Tipo de documento: " + tipoDoc);
        System.out.println("Número de documento: " + documento);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Estatura: " + estatura + " m");
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    // Métodos getter
    public String getTipoDoc() {
        return tipoDoc;
    }
    
    public int getDocumento() {
        return documento;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getEstatura() {
        return estatura;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    // Métodos setter
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    

    public void pedirDatos() {

    }
    
    public void mostrarPersona() {

    }
    
    public String calcularImc() {

        double pesoActual = peso / (estatura * estatura);

        if (pesoActual < 20) {
            return "Tiene el peso muy bajo";

        } else if (pesoActual >= 20 && pesoActual <= 25) {
            return "Tiene un buen peso";
        } else {
            return "Tiene sobre peso";
        }
    }
    
    public boolean mayorEdad() {
        if (edad >= 18) {

            return true;

        } else {
            return false;
            
        }
    }
}
