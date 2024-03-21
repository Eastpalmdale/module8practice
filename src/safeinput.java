import java.util.Scanner;
public class safeinput {
    public static String yourName(Scanner pipe){
        String fname = "";
        String lname = "";

        System.out.println("Whats your first name");
        fname = pipe.nextLine();

        System.out.println("Whats your last name");
        lname = pipe.nextLine();


        return fname  + lname;
    }

    public static int twoNumbers(int a, int b){

        int c = 0;

        c = a+b;

        return c;
    }

    public static void prettyHeader(String msg){

        int totalSpaces = 60 - 6 -msg.length();
        int leftSpace;
        int rightSpace;

        if (totalSpaces % 2 ==0){

            leftSpace = rightSpace = totalSpaces / 2;

        }
        else {

            rightSpace = totalSpaces / 2;
            leftSpace = rightSpace + 1;

        }

        //print top border
        for (int i = 0; i <= 60; i++ ){
            System.out.print("*");
        }
        System.out.println();
        // first 3 *
        System.out.print("***");
        for(int i = 0; i <=leftSpace; i++) {

            System.out.print(" ");
        }
        // printing message
        System.out.print(msg);
        //print right side
        for(int i = 0; i <=rightSpace; i++) {

            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();
        //bottom border
        for (int i = 0; i <= 60; i++ ){
            System.out.print("*");
        }


        return;
    }
}
