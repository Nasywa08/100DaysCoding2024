import java.util.Scanner;


public class DAY35 {
    public static void main(String[] args) {
        System.out.println("operator aritmatika + dan -");
        Scanner sc = new Scanner (System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
     
        System.out.println("penjumlahan: "+(x+y));
        System.out.println("pengurangan: "+(x-y));
    }
}
