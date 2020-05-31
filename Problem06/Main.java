package Problem06;

    import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Double A = sc.nextDouble();
            Double B = sc.nextDouble();
            Double C = sc.nextDouble();
            Double MEDIA;
            MEDIA = (((A * 2) + (B * 3) + (C * 5)) / (2+3+5));
            System.out.printf("MEDIA"+" = "+"%.1f"+"\n",MEDIA);

        }
    }

