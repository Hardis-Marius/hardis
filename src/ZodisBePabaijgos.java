import java.util.Scanner;


public class ZodisBePabaijgos {
    public static void main(String[] args) {

        System.out.println("Įveskite žodį");
        Scanner in = new Scanner(System.in);
        String x = in.next();
        while (!x.equals("Pabaiga")) {
            System.out.println(x);
            x = in.next();
            System.out.println("Ivestas "+x);
        }
        System.out.println("GAME OVER");
    }
}

