package Problem05;

import java.util.*;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           Double A = sc.nextDouble();
            Double B = sc.nextDouble();
            Double MEDIA;
            MEDIA = (((A * 3.5) + (B * 7.5)) / (3.5 + 7.5));
            System.out.printf("MEDIA"+" = "+"%.5f"+"\n",MEDIA);

        }
}
