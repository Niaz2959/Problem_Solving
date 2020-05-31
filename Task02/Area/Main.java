package Task02.Area;

import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Double R;
            Double A;
            R = sc.nextDouble();

            A = (3.14159)*R*R;

            System.out.printf("A"+"="+"%.4f"+"\n", A);
        }
    }


