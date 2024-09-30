import java.math.BigInteger;


public class DAY29 {
    public static void main(String[] args) {
        System.out.println("tipe data reference: BigInteger");
        
        BigInteger x = new BigInteger ("20");
        BigInteger y = new BigInteger ("5");
       
        //aritmatika
        BigInteger jumlah = x.add(y);
        BigInteger kurang = x.subtract(y);
        BigInteger kali = x.multiply(y);
        BigInteger bagi = x.divide(y);
        
        System.out.println("penjumlahan: "+jumlah);
        System.out.println("pengurangan: "+kurang);
        System.out.println("perkalian: "+kali);
        System.out.println("pembagian: "+bagi);
       
        /*BigInteger adalah tipe data reference atau non primitif yang menyimpan 
         bilangan bulat dan tidak ada batasannya*/

        
        
    }
}
