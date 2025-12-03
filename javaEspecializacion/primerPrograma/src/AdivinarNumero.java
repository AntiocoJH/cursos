import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(10);
        for (int i=0; i<3;i++){
            System.out.println("Escribe el numero");
            int numeroIntroducido = teclado.nextInt();
            if(numeroSecreto==numeroIntroducido){
                System.out.println("Lo adivinaste");
                if(i==0) {
                    System.out.println("Lo adivinaste en el  primer intento ");
                }
                if(i>=1) {
                    System.out.println("Lo adivinaste en "+ (i+1) + " intentos");
                }
                break;
            }

        }
        System.out.println("El numero secreto es "+ numeroSecreto);
    }
}
