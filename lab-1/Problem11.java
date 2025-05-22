import java.util.Scanner;
public class Problem11 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String number = input.next();

        for(int i = (number.length()-1); i >= 0;i--){
            System.out.print(number.charAt(i));
        }
        
        input.close();
    }

}
