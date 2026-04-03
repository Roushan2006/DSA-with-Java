import java.util.Scanner;

public class TakingInput {
    static  void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for first number:");
        int first = sc.nextInt();
        System.out.println("Enter the value for second number:");
        int second = sc.nextInt();
        int ans = first + second;
        System.out.println("Answer is :"+ ans);
    }
}
