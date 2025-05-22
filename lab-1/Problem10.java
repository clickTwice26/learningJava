import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, c: ");
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        double root2 = (((-1)*(Math.sqrt(Math.pow(b, 2) - (4*a*c))) - b)/(2*a));
        double root1 = ((Math.sqrt(Math.pow(b, 2) - (4*a*c)) - b)/(2*a));
        System.out.printf("Roots are : %.1f and %.1f\n", root1, root2);
        input.close();

    }
}
