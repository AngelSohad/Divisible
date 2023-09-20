package divisible;

import java.util.Scanner;

/**
 *
 * @author ASAG
 *
 */
public class Divisible {

    
        public void Ejerc1() {
        int n, d;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca dos enteros:");
        n = entrada.nextInt();
        d = entrada.nextInt();
        if (n % d == 0) {
            System.out.println(n + " es divisible por " + d);
        }else{
            System.out.println(" Tas muy menso mano " + n + " NO es divisible por " + d);
        }
    }

    public static void main(String[] args) {
        Divisible divisible = new Divisible();
        divisible.Ejerc1();
    }
}
