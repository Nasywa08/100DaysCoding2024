import java.util.Scanner;

public class DAY66 {

    public static void main(String[] args) {
        System.out.println("pola persegi & persegi panjang");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println(" ");
        System.out.println("======================");
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int d = 0; d < x ; d++){
            for(int e = 0; e < y; e++){
                System.out.print("o ");
            }
            System.out.println();
        }
        System.out.println(" ");
    }
}
