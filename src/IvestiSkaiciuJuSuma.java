import java.util.Scanner;

public class IvestiSkaiciuJuSuma {
    public static void main(String[] args) {
        System.out.println("Vesk pirmą skaičių");
        Scanner in = new Scanner(System.in);
        Integer x = in.nextInt();
        int y = x;
        System.out.println("Vesk antrą skaičių");
        while (x !=0) {
            System.out.println();
            x = in.nextInt();
            y = x + y;
            System.out.println("Dabartinė suma " + y);


        }
        System.out.println("Viskas, suma" + y);
    }
}