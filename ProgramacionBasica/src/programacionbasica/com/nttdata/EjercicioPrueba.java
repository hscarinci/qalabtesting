package programacionbasica.com.nttdata;


import java.util.Scanner;

public class
EjercicioPrueba {

    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        Scanner cmd = new Scanner(System.in);
        String nombre = "";
        String clavevalida = "4567";
        String claveingresada = "";

        //ingresar clave
        System.out.println("Ingresar clave");
        claveingresada = cmd.nextLine();

        if (claveingresada.contentEquals(clavevalida)) {

            System.out.println("clave valida");

            //ingresar nombre
            System.out.println("Ingresar nombre");
            nombre = cmd.nextLine();

            System.out.println("Hola " + nombre + " Bienvenido !!");

        } else {
            System.out.println("clave invalida");
        }


    }
}