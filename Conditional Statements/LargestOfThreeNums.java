 
public class LargestOfThreeNums {
    public static void main(String[] args) {
        int a = 100;
        int b = 30;
        int c = 60;

        if((a >= b) && (a>=c)){
            System.out.println("A is Largest" );
        }else if(b>c){
            System.out.println("B is Largest");
        }else{
            System.out.println("C is Largest");
        }
    }
}
