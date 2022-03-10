
import java.util.Scanner;

public class Actividad {

    private static double nota;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int estudiantes = 0, contador = 0;
        double suma = 0, promedio = 0;

        System.out.println("""
                           Ingrese la primera letra de la materia de la cual se va a calcular el promedio grupal: 
                           M = Matemáticas
                           E = Español
                           I = Inglés""");
        char materia = scan.next().charAt(0);

        //En caso de ser una materia inválida, aviso al usuario y ejecuto el método main de nuevo.
        if (materia != 'M' & materia != 'E' & materia != 'I') {
            System.out.println("""
                               Por favor ingrese una materia válida.
                               """);
            Actividad.main(args);
        }

        System.out.println("Ingrese el número de estudiantes: ");
        estudiantes = scan.nextInt();

        System.out.println("Ingrese las notas de los estudiantes, por favor escriba una por una y presione enter entre cada nota: ");

        switch (materia) {

            case 'M':
                for (contador = 0; contador < estudiantes; contador++) {
                    nota = scan.nextDouble();
                    suma += nota;
                }
                promedio = suma / estudiantes;
                System.out.println("El promedio del grupo en la materia MATEMÁTICAS es: " + promedio);
                break;

            case 'E':
                while (contador < estudiantes) {
                    nota = scan.nextDouble();
                    suma += nota;
                    contador++;
                }
                promedio = suma / estudiantes;
                System.out.println("El promedio del grupo en la materia ESPAÑOL es: " + promedio);
                break;

            case 'I':
                do {
                    nota = scan.nextDouble();
                    suma += nota;
                    contador++;
                } while (contador < estudiantes);

                promedio = suma / estudiantes;
                System.out.println("El promedio del grupo en la materia INGLÉS es: " + promedio);
                break;
        }
    }
}
