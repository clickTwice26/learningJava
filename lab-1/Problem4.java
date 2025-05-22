import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " is a even number");
        }else{
            System.out.println(number + " is a odd number");

        }
        input.close();

    }
}
