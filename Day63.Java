public class DAY63 {
    public static void main(String[] args) {
        System.out.println("keywoard: continue");
        
        for (int i = 2; i <= 30; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }
}
