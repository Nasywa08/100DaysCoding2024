import java.util.Scanner;


public class DAY41 {
    public static void main(String[] args) {
        System.out.println("evaluasi mentor ");
        //soal 1
        Scanner sc = new Scanner (System.in);
        
        final double PI = 3.14159;//menetapkan nilai PI 
        
        System.out.print("jari-jari: ");  
        int j = sc.nextInt();
        
        System.out.print("satuan: ");
        String satuan = sc.next();
        
        double k = 2 * PI * j;
        double l = PI * j * j;
        
        System.out.println("=============HASIL=============");
        System.out.println("jari-jari: "+j+" "+satuan);
        System.out.println("keliling: "+k+" "+satuan);
        System.out.println("luas: "+l+" "+satuan+"^2");
        //soal 2
        
        int a,b;
        a = 15;
        b = 20;
        
        System.out.println("nilai b: "+b);//20
        b %= a;
        System.out.println("nilai b: "+b);//5
        b *= a;
        System.out.println("nilai b: "+b);//75
        b -= a;
        System.out.println("nilai b: "+b);//60
        b /= a;
        System.out.println("nilai b: "+b);//4
        b += a;
        System.out.println("nilai b: "+b);//19
                
                
        
        
        
        
    }
}
