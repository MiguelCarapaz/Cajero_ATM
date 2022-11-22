import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cajero cuenta=new Cajero();
        int opcion=0;
        boolean exit=false;
        Scanner leer = new Scanner(System.in);
        while(!exit){
            System.out.println("1.- Depositar dinero");
            System.out.println("2.- Retirar dinero");
            System.out.println("3.- Salir");
            System.out.print("Ingrese la opcion: ");
            opcion = leer.nextInt();
            switch (opcion){
                case 1: {
                    //DEPOSITO
                    cuenta.ingresar_datos();
                    cuenta.deposito();
                    cuenta.mostar_datos();
                    }
                    break;
                case 2:
                {
                   //RETIRO
                    cuenta.ingresar_datos();
                    cuenta.retiro();
                    cuenta.mostar_datos();
                    }
                    break;
                case 3:
                    //SALIR DEL BUCLE
                    exit = true;
                    break;
                default:
                    System.out.println("Ingrese un numero que este en el rango de 1 - 3");
            }
        }
    }
}
