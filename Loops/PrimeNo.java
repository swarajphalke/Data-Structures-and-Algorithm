// The No.s who comes in the own tables and 1's table

public class PrimeNo {
    public static void main(String[] args) {
        int num = 3;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is Not Prime Number");
        }
    }
}
