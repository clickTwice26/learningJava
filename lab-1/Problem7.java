import java.util.Scanner;
public class Problem7 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Before Swap: ");
        int a = input.nextInt();
        int b = input.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.printf(
            "After Swap: a = %d, b = %d\n", a, b
        );
        input.close();
    }
}
