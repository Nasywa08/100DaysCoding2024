import java.util.Scanner;


public class dayevaluasi {
    public static void main(String[] args) {
        System.out.println("evaluasi");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
