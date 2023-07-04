package PreParcial;

public class Ejercicio5 {
    public static void main(String[] args) {


        Producto[] produ = new Producto[2];
        produ[0] = new Producto("Intel i7", 241);
        produ[1] = new Producto("Monitor 240", 450);


        for (Producto objeto : produ) {
            System.out.println("El nombre del producto es: " + objeto.getNombre() + ". " + "Posee un valor de: " + objeto.getPrecio()+ " USD");
        }
    }
}


class Producto {
    private
    String nombre;
    int Precio;
    public
    Producto(String n, int p){
        nombre = n;
        Precio = p;


    }
    String getNombre (){
        return nombre;
    }
    int getPrecio() {
        return Precio;
    }
}


