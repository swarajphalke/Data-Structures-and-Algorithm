import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // Type Casting
        // explicite

        Scanner sc = new Scanner(System.in);
        float a = 25.129999f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        int num = ch;
        System.out.println(num); //show asci value
    }
}
