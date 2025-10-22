package tema2_debug;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        double suma = 0;

        System.out.print("Introduce el número de alumnos: ");
        int numAlumnos = sc.nextInt();

        while (contador <= numAlumnos) {
            System.out.print("Introduce la nota del alumno " + contador + ": ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
            	do {
            		System.out.print("Introduce una nota válida para el alumno "+contador+": ");
            		nota = sc.nextDouble();
            	}while (nota < 0 || nota > 10);
                
            }
            suma = suma + nota;
            contador++;
            }
        

        double media = suma / numAlumnos;
        System.out.println("La media del grupo es: " + media);

        sc.close();
    }
}