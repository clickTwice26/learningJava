import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        // System.out.printf("Area: %.10f\n", radius*radius*3.1416);
        System.out.println(radius*radius*3.1416);
        input.close();
           

    }
}
