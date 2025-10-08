import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in); //Lee los datos ingresados por el usuario

        int num1, num2, resultado;        //declaramos la variables
        double resultadoDiv;
        String operador;

        System.out.println("Ingrese un digito");
        num1 = x.nextInt();
        System.out.println("Ingese segundo digito");
        num2 = x.nextInt();
        System.out.println("Ingese operador /  *  +  -");
        operador = x.next();

        if (operador.equals("+")) {  //utilizamos condicionales
            resultado = num1 + num2;              //calcula la suma de las variables
            System.out.println("La suma de los numero es = "+resultado);

        } else if (operador.equals("-")) {
            resultado = num1 - num2;                  //calcula la resta de las variables
            System.out.println("La resta de los numeros es = "+resultado);

        } else if (operador.equals("*")) {
            resultado = num1 * num2;                  //calcula la multiplicacion de las variables
            System.out.println("La multiplicacion de los numeros es = "+resultado);

        } else if (operador.equals("/")) {
            resultadoDiv = (double)num1 / num2;          //calcula la division de las variables
            System.out.println("La division de los numeros es = "+ resultadoDiv);

        } else {
            System.out.println();
        }
    }
}