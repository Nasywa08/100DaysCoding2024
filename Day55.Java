import java.util.Scanner;


public class DAY55 {
    public static void main(String[] args) {
        System.out.println("looping : for decrement");
        
        Scanner sc = new Scanner (System.in);
        int akhir = sc.nextInt();
       
        for(int mulai = 10 ; mulai > akhir ; mulai--){
            System.out.print(mulai+" ");
        }
    }
}
