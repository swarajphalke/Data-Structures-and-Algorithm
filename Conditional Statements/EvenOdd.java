import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter a number : 3");
        int num = sc.nextInt();
        if(num%2==0){
            
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
}
