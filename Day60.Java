import java.util.Scanner;


public class DAY60 {
    public static void main(String[] args) {
        System.out.println("loop: do while");
        
        Scanner sc = new Scanner (System.in);
        System.out.println("================");
        String nama,NIM,ulang;
        do{
            System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("NIM : ");
        NIM = sc.nextLine();
        System.out.println("==================");
        System.out.println(nama+" dengan NIM "+NIM);
        System.out.println("ulang? yes/no");
        ulang = sc.nextLine();
        }while(ulang.equals("yes"));
        System.out.println("finish");
        
    }
}
