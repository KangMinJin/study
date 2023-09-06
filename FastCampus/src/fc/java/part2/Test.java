package fc.java.part2;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cost = sc.nextInt();
        int item = sc.nextInt();
        int sum = 0;

        int price = 0;
        for (int i = 0; i < item; i++) {
            price = sc.nextInt();
            int ea = sc.nextInt();
            sum += price * ea;
        }
        System.out.println(cost == sum? "Yes" : "No");
//        if (cost == sum) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
        sc.close();
    }
}
