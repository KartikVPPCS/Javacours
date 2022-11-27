/*Make a menu-driven program. The user can enter 2 numbers, either 1 or 0.
        If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
        If they enter 0 then stop.
        If he/ she scores :
        Marks >=90 -> print “This is Good”
        89 >= Marks >= 60 -> print “This is also Good”
        59 >= Marks >= 0 -> print “This is Good as well”
        Because marks don’t matter but our effort does.
        (Hint : use do-while loop but think & understand why)*/


import java.util.*;
public class problem {
    public static void main(String [] args){
        Scanner s1= new Scanner(System.in);
        int input;
        do {
            {
                int marks=s1.nextInt();
                if (marks>=90){
                    System.out.println("Distension");
                } else if (89>=marks && marks>=60) {
                    System.out.println("First Class");
                } else if (59>= marks && marks>=0) {
                    System.out.println("just Pass");
                }
                else {
                    System.out.println("Because marks dose not  matter our efforts matters");
                }
                System.out.println("Want to continue? (yes(1) or no(0))");
                input =s1.nextInt();
                System.out.println("Enter your marks");
            }
        }while (input==1);
    }
}
