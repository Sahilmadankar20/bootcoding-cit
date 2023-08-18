import java.sql.SQLOutput;
import java.util.Scanner;

public class InputEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int n =sc.nextInt();
        System.out.println("Enter second number :");
        int m=sc.nextInt();
        int add=n+m;
        System.out.println("Addition ="+add);

    }
}
