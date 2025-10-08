import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = 50;
        int h = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        boolean x = true;
        while (x) {
            System.out.println("Selecciones una opcion 1 2 3 4 5");
            int n = s.nextInt();
            if (n == 1) {
                if (g > 10) {
                    g = g - 10;
                    h = h + 5;
                    a = a + 1;
                } else {
                    System.out.println("x");
                }
            } else if (n == 2) {
                if (g > 7) {
                    g = g - 7;
                    h = h + 3;
                    b = b + 1;
                } else {
                    System.out.println("x");
                }
            } else if (n == 3) {
                if (g > 20) {
                    g = g - 20;
                    h = h + 10;
                    c = c + 1;
                } else {
                    System.out.println("x");
                }
            } else if (n == 4) {
                System.out.println(g);
                System.out.println(h);
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else if (n == 5) {
                x = false;
            }
            if (g < 0) {
                System.out.println("end");
                x = false;
            }
        }
    }
}
