import java.util.Scanner;
public class Problem5 {
    public static void main(String args[]){
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println("Addition: "+(number1+number2));
        System.out.println("Subtraction: "+(number1-number2));
        System.out.println("Multiplication: "+(number1*number2));
        System.out.println("Division: "+ ((float)number1/number2));
        input.close();



    }
}
