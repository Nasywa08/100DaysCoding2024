import java.util.Scanner;


public class DAY50 {
    public static void main(String[] args) {
        System.out.println("Percabangan: if-else if-else");
        
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        
        if(x <= 10){
            System.out.println("alooo");
        }else if(x > 20){
            System.out.println("helloww");
        }else{
            System.out.println("anyyeong");
        }
    }
}
