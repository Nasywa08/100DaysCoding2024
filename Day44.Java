public class DAY44 {
    public static void main(String[] args) {
        System.out.println("operator: AND");
        
        int x,y;
        x = 60;
        y = 30;
        
        System.out.println(x>y && y<x);//true
        System.out.println(x<y && x>y);//false
        System.out.println(x>=y && x<=y);//false
        System.out.println(x<=y && x>=y);//false
        
        /*Operator logika AND adalah operator yang membandingkan dua nilai yaitu true dan false,
        operator ini akan bernilai benar/true jika kedua nilai bernilai true
        */
    }
}
