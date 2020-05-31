package Problem10;

     import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int A1 = sc.nextInt();
            int Q1 = sc.nextInt();
            Double P1 = sc.nextDouble();
            int A2 = sc.nextInt();
            int Q2 = sc.nextInt();
            Double P2 = sc.nextDouble();
            Double TOTAL;
            TOTAL = ((Q1*P1)+(Q2*P2));

            System.out.printf("VALOR A PAGAR"+" : "+"R$ "+"%.2f"+"\n",TOTAL);
        }
    }

