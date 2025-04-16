
public class ternary {

    public static void main(String a[]) {
        int n = 6;
        int result = 0;
        // if (n % 2 == 0) {
        //     result = 10; 
        // }else {
        //     result = 20;
        // }
        result = n % 2 == 0 ? 10 : 20;
        System.err.println(result);
        int i = 1;
        while (i <= 4) {
            System.err.println("Hii " + i);
            i++;
        }
    }
}
