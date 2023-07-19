public class Test {
    public static void main(String[] args) {
        
        int num1 =242;
        int num2 =0;

        if(num1 != 0){
            int rem = num1%10;
            num2 = num2*10 + rem;
            num1 = num1/10;
        }

        if(num1 == num2){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}
