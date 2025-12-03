public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        String TipoPlan = "plus";
        double notaDeLaPelicula = 8.2;
        if(fechaDeLanzamiento>=2022){
          System.out.println("peliculas mas populares");
        }else{
            System.out.println("peliculas retro que valen la pena ver");
        }

        if(incluidoEnElPlan && TipoPlan.equals("plus")){
            System.out.println("Disfrute su plan");
        }else{
            System.out.println("Pelicula no disponible en su plan actual");
        }/*
        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("El día 1 es lunes");
                break;
            case 2:
                System.out.println("El día 2 es martes");
                break;
            case 3:
                System.out.println("El día 3 es miércoles");
                break;
            // otros casos posibles...
            default:
                System.out.println("Día no válido");
        }*/
    }

}
