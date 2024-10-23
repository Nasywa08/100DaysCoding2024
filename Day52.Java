import java.util.Scanner;


public class DAY52 {
    public static void main(String[] args) {
        System.out.println("ternary");
        
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        
        String hasil =(x > 0)? "positif" : "negatif";
        System.out.println(x+" adalah angka "+hasil);
        
        
    }
    
}
