package Z__OCTUBRE;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        //declaracion e inicializacion de variables
        int a=25,b =5,c=2;
        int suma, resta, multiplicacion,division,resto=0;
        suma =a+b+c;
        resta=c-b;
        multiplicacion=a*b*c;
        division=a/b;
        resto= a%b;
        System.out.println("la suma es => "+suma);
        System.out.println("la resta es => "+resta);
        System.out.println("la multiplicacion es => "+multiplicacion);
        System.out.println("el cociente es => "+division);
        System.out.println("el resto es => "+resto);
        a++;
        System.out.println("el nuevo valor de a es => "+a);
        b=b+1;
        System.out.println("el nuevo valor de a es => "+b);
    }
}
