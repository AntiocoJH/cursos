import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int contador = 0;
        while (contador != 3){
            System.out.println("Escribe la nota que le darias a la pelicula Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones += nota;
            contador++;

        }
        System.out.println("La media de evaluaciones para Matrix es " +mediaEvaluaciones / 3);
    }
}
