package PreParcial;
//ejercicio 4 vocales
public class Ejercicio3 {
    public static void main(String[] args) {

            String[] Vocales = {"A", "E", "Ikkku", "O", "U", "Marta"};

            int contador = 0;

            for (String V : Vocales) {
                for (int i = 0; i < V.length(); i++) {
                    char c = Character.toLowerCase(V.charAt(i));
                    if (c == 'a' ||c == 'e'||c == 'i'||c == 'o' || c == 'u') {
                        contador++;
                    }
                }
            }

            System.out.println("La cantidad de vocales en el array es: " + contador);
        }
    }

