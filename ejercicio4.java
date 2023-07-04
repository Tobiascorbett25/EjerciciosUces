package PreParcial;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Parcial 2 ejercicio 4: ");
        System.out.println("Ingrese un numero entero: ");
        int n= scanner.nextInt();
        int factorial =1;
        int i=1;

        while (i<=n){
        factorial*=i;
        i++;
        }

        System.out.println("El factorial de " +n+ "es: "+factorial);
        System.out.println();

    }
}