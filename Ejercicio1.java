package PreParcial;

import java.util.Scanner;
//ejericio 1 numero negativo o positivo
public class Ejercicio1 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Ejercicio 1: ");
System.out.println("Ingrese numero positivo: ");
int numero = scanner.nextInt();
 if (numero>0) {
     System.out.println("El numero es positivo: ");
 }else if (numero<0){
         System.out.println("El numero es negativo: ");


 }else{
     System.out.println("El numero es 0: ");
 }

    }

}
