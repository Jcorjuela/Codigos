import java.util.Scanner;
public class calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer número: ");                                             
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        numero2 = sc.nextInt();
        
        System.out.print("Introduce operacion(1 para suma, 2 para resta, 3 para multiplicar y 4 para dividir): ");
        int operacion = sc.nextInt();
          if (operacion==1) {
            resultado = sumar(numero1, numero2);
            System.out.println(+ resultado);
          }
          if (operacion==2) {
            resultado = restar(numero1, numero2);
            System.out.println(+ resultado);
          }
          if (operacion==3) {
            resultado = multiplicar(numero1, numero2);
            System.out.println(+ resultado);
          }
          if (operacion==4) {
            resultado = dividir(numero1, numero2);
            System.out.println(+ resultado);
          }

        //resultado;
       // System.out.println(+ resultado);
    
    }

        //método sumar
    public static int sumar(int a, int b){
           int c;
           c = a + b;
           return c;
    }

        //método restar
    public static int restar(int a, int b){
           int c;
           c = a - b;
           return c;
    }

        //método multiplicar
    public static int multiplicar(int a, int b){
           int c;
           c = a * b;
           return c;
    }

        //método dividir
    public static int dividir(int a, int b){
           int c;
           c = a / b;
           return c;
    }

}