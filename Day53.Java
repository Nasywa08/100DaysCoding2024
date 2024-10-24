import java.util.Scanner;


public class DAY53 {
    public static void main(String[] args) {
        System.out.println("looping for");
        Scanner sc = new Scanner (System.in);
        
        int akhir = sc.nextInt();
       
        for(int mulai = 15 ; mulai > akhir ; mulai--){
            System.out.print(mulai+" ");
        }
        
    }
    
}
