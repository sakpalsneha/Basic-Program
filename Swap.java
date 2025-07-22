public class Swap {
    public static void main(String[] args) {
        int num1 = 200;
        int num2 = 100;
        System.out.println("Before swapping : num1 is "+ num1 +" num2 is "+ num2);

        int tem = num1;
        num1 = num2;
        num2 = tem;
        System.out.println("After swapping : num1 is "+ num1 +" num2 is "+ num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping : num1 is "+ num1 +" num2 is "+ num2);

    }
}
