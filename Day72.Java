public class DAY72 {
    // Metode rekursif
    public static int f(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * f(n - 1);
        }
    }

    public static void main(String[] args) {
        int angka = 5; 
        System.out.println("Faktorial: " + angka + " adalah: " + f(angka));
    }
}
