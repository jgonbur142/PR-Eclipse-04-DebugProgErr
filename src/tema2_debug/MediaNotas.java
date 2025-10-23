package tema2_debug;

import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 1;
        double suma = 0;
        int numAlumnos;

        do {
        	System.out.print("Introduce el número de alumnos: ");
        	numAlumnos = sc.nextInt();
        }while (numAlumnos <=0);

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
        System.out.printf("La media del grupo es: %.2f",media);

        sc.close();
    }
}
