import java.util.Scanner;
public class User {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        String nama = "Fathi_SI4503";

        System.out.print("Enter your name and class: ");
        String enter = Scanner.nextInt();

        while (enter != nama) {
            System.out.println("\n Wrong name please try again");
            System.out.print("Enter your name and class: ");
            enter = Scanner.nextString();
        }
    }
}
