import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : 44");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum+ i;
            i++;
        }
        System.out.println("Sum is : "+sum);
    }
}
