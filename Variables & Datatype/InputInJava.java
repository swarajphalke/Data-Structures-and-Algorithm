import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        int num = sc.nextInt();
        System.out.println(num);

        float price = sc.nextFloat();
        System.out.println(price);
    }
}
