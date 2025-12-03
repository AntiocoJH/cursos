import java.util.Scanner;

public class DesafioCuentaBancaria {
    public static void main(String[] args) {
        String cliente="Antioco Juarez Hernandez";
        String TipoCuenta="Corriente";
        Double saldo=100.01;
        int opcion = 0;
        System.out.println("************************************************");
        System.out.println("\nNombre del cliente: "+cliente);
        System.out.println("El tipo de cuenta es: "+TipoCuenta);
        System.out.println("Su saldo disponible es : "+"$ "+saldo);
        System.out.println("\n************************************************");
        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1.- Consultar saldo
                2.- Retirar
                3.- Depositar
                9.- Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion!=9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es "+"$"+saldo);
                    break;
                case 2:
                    System.out.println("¿Cual es el monto que desea retirar?");
                    double valorRetirar = teclado.nextDouble();
                    if (saldo<valorRetirar){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo=saldo-valorRetirar;
                        System.out.println("El nuevo saldo es "+(saldo));
                    }
                    break;
                case 3 :
                    System.out.println("¿Cual es el monto que desea depositar?");
                    double valorDepositar = teclado.nextDouble();
                    saldo=+valorDepositar;
                    System.out.println("El nuevo saldo es "+(saldo));
                    break;
                case 9:
                    System.out.println("Gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");

            }
        }


    }
}
