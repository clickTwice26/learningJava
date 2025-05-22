import java.util.Scanner;
public class Problem8{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int principal, rate, time;
        System.out.print("Principal: ");
        principal = input.nextInt();
        System.out.print("Rate: ");
        rate = input.nextInt();
        System.out.print("Time: ");
        time = input.nextInt();

        System.out.println("Simple Interest: "+(((float)principal*rate*time)/100));
        input.close();

    }


}