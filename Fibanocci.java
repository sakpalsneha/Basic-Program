public class Fibanocci {
    public static void main(String[] args) {
        int first =0;
        int second =1;
        int num =13;

        for(int i=1;i<=num;i++){
            System.out.print(first+" ");
            int next = first + second;
            first=second;
            second=next;
        }
    }
}
