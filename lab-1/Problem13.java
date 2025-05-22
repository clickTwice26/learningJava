import java.util.Scanner;
public class Problem13 {
    public static void main(String args[]){
        System.out.println("Insert Your Information");
        Scanner input = new Scanner(System.in);
        String full_name, student_id, hometown, description;
        char section;

        System.out.print("Full Name : ");
        full_name = input.nextLine();
        System.out.print("Student Id : ");
        student_id = input.nextLine();
        System.out.print("Section : ");
        section = input.next().charAt(0);
        System.out.print("Hometown : ");
        hometown = input.next();
        input.nextLine();
        
        System.out.print("Description : ");
        
        description = input.nextLine();


        System.out.printf(
            "Full Name : %s\nSection : %c\nStudent Id: %s\nHometown: %s\nDescription: %s\n",full_name,section,student_id,hometown,description
        );
        input.close();



    
    }
}
