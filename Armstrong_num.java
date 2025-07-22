import java.util.*;
import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int num_digit = String.valueOf(num).length();
        int original = num;
        int sum =0;

        while(num!=0){
            int last_digit = num %10;
            sum +=Math.pow(last_digit,num_digit);
            num= num/10;
        }

        System.out.println("Sum of digits is "+ sum);

        if(sum==original){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not armstrong");
        }
    }
}
