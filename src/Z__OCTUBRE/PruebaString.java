package Z__OCTUBRE;

public class PruebaString {

    public static void main(String[] args) {
        String nombre="kevin";
        String apellido="LOAYZA";

        System.out.println("voy a pasar a mayuscula el nombre "+nombre.toUpperCase());
        System.out.println("voy a pasar a minusculas el apellido "+apellido.toLowerCase());
        System.out.println("concatenar caracteres "+nombre.concat(" "+apellido));
        String napa =  apellido.charAt(0)+"";
        System.out.println("mostrar la inicial de mi apellido "+napa.toLowerCase());
        System.out.println("el numero de caracteres de "+nombre+" es "+nombre.length());
        System.out.println("el numero de caracteres de "+apellido+" es "+apellido.length());
    }




}
