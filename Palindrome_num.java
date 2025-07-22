import java.util.*;
import java.util.Scanner;


public class Palindrome_num {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int rev =0;

        while(num!=0){
            int last_digit = num %10;
            rev = rev*10 + last_digit;
            num = num/10;
        }

        System.out.println("Reverse number is "+rev);
        if(original==rev){
            System.err.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }
    }
}
