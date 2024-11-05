public class DAY65 {
    public static void main(String[] args) {
        System.out.println("nested loop");
        
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                    System.out.println("i: "+i+" ,j: "+j);
                    if(j % 2 == 0){
                       break;
                    }
                }
            }
        }
    }
