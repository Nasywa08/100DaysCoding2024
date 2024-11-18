import java.util.Scanner;

public class DAY78 {
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("makanan favorit: ");
         String fav = sc.nextLine();
         
         String n = fav.equalsIgnoreCase("bakso") ? "iya" : "nda";
         System.out.println("oh jadi kamu suka "+ fav+ " ? "+n);
    }
}
