package PreParcial;

public class Ejercicio2 {


    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,29};
        int inpar = 0;
        int par = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 ==0){
                par++;
            }else{
                inpar++;
            }


        }
        System.out.println("Numero total de pares: "+par);
        System.out.println("Numero total de inpares: "+inpar);
    }
}




