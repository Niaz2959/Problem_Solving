package Problem12;

     import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Double A = sc.nextDouble();
            Double B = sc.nextDouble();
            Double C = sc.nextDouble();

            Double TRIANGULO = (0.5)*A*C;
            Double CIRCULO   = (3.14159)*C*C;
            Double TRAPEZIO  = ((A+B)/2)*C;
            Double QUADRADO  = (B*B);
            Double RETANGULO = A*B;

            System.out.printf("TRIANGULO"+": "+"%.3f"+"\n",TRIANGULO);
            System.out.printf("CIRCULO"+": "+"%.3f"+"\n",CIRCULO);
            System.out.printf("TRAPEZIO"+": "+"%.3f"+"\n",TRAPEZIO);
            System.out.printf("QUADRADO"+": "+"%.3f"+"\n",QUADRADO);
            System.out.printf("RETANGULO"+": "+"%.3f"+"\n",RETANGULO);
        }
    }


