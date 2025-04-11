public class ReverseNo {
    public static void main(String[] args) {
        int num = 3442;
         while(num>0){
            int rem = num%10;
            System.out.print(rem + " ");
            num=num/10;
         }
         System.out.println();
    }
}
