public class Numbersfrom1to100divby3 {
    public static void main(String[] args) {
        System.out.println("1到100之间能被3整除的数字：");
        
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
