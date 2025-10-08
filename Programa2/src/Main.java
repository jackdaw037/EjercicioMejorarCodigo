import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int num = (int)(Math.random() * 10 + 1); //Generamos un numero aleatorio
    int resultado = 0;  // Variable donde se va a guardar el numero aleatorio

    while (resultado != num) { //El programa se repetira hasta encontrar el numero
        resultado = s.nextInt();
        if (resultado == num)  //El progrma se detendra al terminar el numero
            System.out.println("acertaste el numero");
        else if (resultado > num) //indica que el menor al puesto
            System.out.println("el numero es menor");
        else                        //indica que el mayor al puesto
            System.out.println("el numero es mayor");
    }
}
}