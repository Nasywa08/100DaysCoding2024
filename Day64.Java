public class DAY64 {
    public static void main(String[] args) {
        System.out.println("break label");
        
        perulanganLuar:
        for (int i = 2; i <= 30; i++) {//loop luar
            for (int f = 3; f <= 30; f++) {//loop dalam
                System.out.println("i: "+i+",f: "+f);
                
                if (f == 10) {//akan berhenti jika nilai f sudah mencapai 10
                    break perulanganLuar;
                    
                }
            }
        }
        System.out.println("loop selesai");
    }
}
