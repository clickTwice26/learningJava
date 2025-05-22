import java.util.Scanner;
public class Problem12 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int product = number;

        while(number >= 2){
            product*=(number-1);
            number -= 1;
        }
        System.out.println(product);

    }
}
