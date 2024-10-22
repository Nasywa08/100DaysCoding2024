import java.util.Scanner;


public class Day51 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int jam = sc.nextInt();
        
        switch(jam){
            case 6:
                System.out.println("bangun pagi");
                break;
            case 7:
                System.out.println("breakfast");
                break;
            case 13:
                System.out.println("makan siang");
                break;
            case 19:
                System.out.println("makan malam");
                break;
            default:
                System.out.println("jangan lupa makan");
        }
    }
}
