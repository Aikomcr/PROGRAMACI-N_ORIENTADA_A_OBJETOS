package Salud;
import java.util.Scanner;

public class empleado extends persona {
    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private String departamento;
    private double RETEICA = 0.00966;
    
    public void pedirDatos() {

        System.out.println("Ingrese los siguientes Datos");

        Scanner lectura = new Scanner(System.in);

        System.out.print("Tipo de documento: ");

        String tipoDoc = lectura.nextLine();

        this.setTipoDoc(tipoDoc);

        System.out.print("Documento: ");

        int documento = lectura.nextInt();

        this.setDocumento(documento);

        System.out.print("Nombre: ");

        String nombre = lectura.nextLine();

        this.setNombre(nombre);

        System.out.print("Apellido: ");

        String apellido = lectura.nextLine();

        this.setApellido(apellido);

        System.out.print("Peso: ");

        double peso = lectura.nextDouble();

        this.setPeso(peso);

        System.out.print("Estatura: ");

        double estatura = lectura.nextDouble();

        this.setEstatura(estatura);

        System.out.print("Edad: ");

        int edad = lectura.nextInt();

        this.setEdad(edad);

        System.out.print("Sexo: ");

        String sexo = lectura.next();

        this.setSexo(sexo);

        lectura.nextLine(); 
        
        System.out.print("Cargo: ");

        String cargo = lectura.nextLine();

        this.cargo = cargo;

        System.out.print("Departamento: ");

        String departamento = lectura.nextLine();

        this.departamento = departamento;

        System.out.print("Horas: ");

        int horasTrabajadas = lectura.nextInt();

        this.horasTrabajadas = horasTrabajadas;

        System.out.print("Precio de la Hora: ");

        double valorHora = lectura.nextDouble();

        this.valorHora = valorHora;

        lectura.close();
    }

    public void mostrarEmpleado() {
        System.out.println("Tipo de Documento: " + this.getTipoDoc());

        System.out.println("Documento: " + this.getDocumento());

        System.out.println("Nombre: " + this.getNombre());

        System.out.println("Apellido: " + this.getApellido());

        System.out.println("Peso: " + this.getPeso());

        System.out.println("Estatura: " + this.getEstatura());

        System.out.println("Edad: " + this.getEdad());

        System.out.println("Sexo: " + this.getSexo());

        System.out.println("Cargo: " + this.cargo);

        System.out.println("Departamento: " + this.departamento);

        System.out.println("Horas Trabajadas: " + this.horasTrabajadas);

        System.out.println("Valor por Hora: " + this.valorHora);

        System.out.println("Total a Pagar: " + this.Honorarios());
    }

    //Evalua los honorarios del empleado
    
    public double Honorarios() {
        double honorarios = (this.valorHora * this.horasTrabajadas) * (1 - this.RETEICA);
        return honorarios;
    }

}
