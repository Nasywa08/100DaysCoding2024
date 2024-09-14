public class Evaluasi {
    public static void main(String[] args){
        
        int part1,part2; //deklarasi part1 dan part2
        part1= 10;//dua variabel diatas di inisialisasi
        part2= 10;
        
        System.out.printf("part1 d%.\n",part1);
        System.out.println("part2 "+part2);
        
        part1= 60;//kemudian setelah di inisialisasi maka nilainya di update
        part2= 50;
        
       byte part3= 20;
       short part4= 20;     //inisialisasi 3 variabel dengan tipe data int,byte,short,dan int
       final int part5= 40; //membuat variabel final
        //int part5=60;    jika part5 di update maka akan error
        
        part3=50;//mengupdate salah satu variabel
        
        String nama="Nasywa";//membuat variabel dengan tipe data String
        
        System.out.printf("part1 d%.\n"+part1);
        System.out.println("part2 "+part2);
        System.out.println("part3 "+part3); //print setiap variabel
        System.out.println("part4 "+part4);
        System.out.println("part5 "+part5);
        System.out.println("Nama ku "+nama);
        
        
    }
}
