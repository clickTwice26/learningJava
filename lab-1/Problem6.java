import java.util.Scanner;
public class Problem6 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Before Swap: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int temp = a;
        
        a = b;
        b = temp;
    

        System.out.printf(
            "After Swap: a = %d, b = %d\n", a, b
        );
        input.close();
    }
}
