package A__EXAMENES_Y_EJERCICIOSWORD;

import java.util.Arrays;
import java.util.Scanner;

public class SOLOPRUEBAS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dimension = 0;
        double[] array;
        System.out.println("DIME EL TAMAÑO DEL ARRAY");
        dimension = sc.nextInt();
        array = new double[dimension];
        for (int i=0;i<array.length;i++){
            System.out.println("Dime el valor de  "+i);
            array[i]= sc.nextDouble();
        }

        System.out.println("El array quedaria  "+ Arrays.toString(array));
        double [] array_invertido = new double[dimension];
        for (int i=0;i<array.length;i++){
            array_invertido [i] = array.length-i;

        }

        System.out.println("El array invertido es "+Arrays.toString(array_invertido));
    }

}
