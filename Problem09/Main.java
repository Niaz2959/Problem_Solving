package Problem09;

    import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String A = sc.nextLine();
            Double B = sc.nextDouble();
            Double C = sc.nextDouble();
            Double TOTAL;
            TOTAL = B+((C*15)/100);

            System.out.printf("TOTAL"+" = "+"R$ "+"%.2f"+"\n",TOTAL);
        }
    }

