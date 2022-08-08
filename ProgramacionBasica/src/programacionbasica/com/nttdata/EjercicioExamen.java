package programacionbasica.com.nttdata;

public class EjercicioExamen {
    public static void main(String[] args) {
        int suma = suman(5);
        System.out.println(suma);
    }
    public static int suman(int n){
        if (n<1) {
            return 0;
        }else{ return n + suman (n-1);
        }


    }
}
