package Problem11;

    import java.util.*;
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Double R = sc.nextDouble();
            Double VOLUME;
            VOLUME = (4/3.0)*3.14159*(R*R*R);

            System.out.printf("VOLUME"+" = "+"%.3f"+"\n",VOLUME);
        }
    }

