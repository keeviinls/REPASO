package Z__OCTUBRE;

import java.util.Scanner;

public class EsPar {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num =sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("el numero "+num+" Es par");
        }
        else {
            System.out.println("el numero "+num+" Es impar");
        }


    }
}
