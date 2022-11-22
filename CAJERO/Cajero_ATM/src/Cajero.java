import java.util.Scanner;
public class Cajero {
    //ATRIBUTOS
    Scanner leer = new Scanner(System.in);
    String nombre, ncuenta;
    double monto;
  //CONSTRUCTOR
    public Cajero(){
        nombre="Miguel";
        ncuenta="18727574";
        monto=100;
    }
    public void ingresar_datos(){
        System.out.println("Ingrese el nombre:");
        nombre= leer.next();
        System.out.println("Ingrese el numero de cuenta:");
        ncuenta= leer.next();
        System.out.println("--------------------------:");
    }
    public void deposito(){
      Cajero cuenta=new Cajero();
      System.out.println("Ingrese el monto a depositar:");
      double sumar= leer.nextInt();
      System.out.println("El monto a sido ingresado correctamente:");
      monto=monto+sumar;
        System.out.println("--------------------------:");
    }
    public void retiro(){
        System.out.println("Ingrese el monto a retirar:");
        double restar= leer.nextInt();
        if(restar>monto){
            System.out.println("la cantidad es mayor al monto que usted tiene actualmente");
            monto=monto;
        }
        else {
            System.out.println("El retiro ha sido exitoso:");
            monto = monto - restar;
            System.out.println("--------------------------:");
        }
    }
    public void mostar_datos(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Cuenta: "+getNcuenta());
        System.out.println("Monto: "+getMonto());
    }
//GETTER AND SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNcuenta() {
        return ncuenta;
    }
    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
}