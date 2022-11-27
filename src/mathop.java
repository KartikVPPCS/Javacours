import  java.util.*;

public class mathop {
    public static void main(String [] args){
        System.out.println("choice your operation");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Scanner s1 = new Scanner(System.in);

        int button = s1.nextInt();
        switch (button){
            case 1:{
                System.out.println("Enter first no");
                int a= s1.nextInt();
                System.out.println("Enter second no");
                int b= s1.nextInt();
                int add = a+b;
                System.out.println("the addition of two numbers is");
                System.out.println(add);
                break;
            }
            case 2:{
                System.out.println("Enter first number");
                int a = s1.nextInt();
                System.out.println("Enter second number");
                int b = s1.nextInt();
                int sub =a-b;
                System.out.println("the substraction of two numbers is");
                System.out.println(sub);
                break;
            }
            case 3:{
                System.out.println("Enter first number");
                int a= s1.nextInt();
                System.out.println("Enter second number");
                int b= s1.nextInt();
                int mult= a*b;
                System.out.println("the multiplication of two numbers is");
                System.out.println(mult);
                break;
            }
            case 4:{
                System.out.println("Enter  first number");
                int a= s1.nextInt();
                System.out.println("Enter  second number");
                int b= s1.nextInt();
                int div=a/b;
                System.out.println("the division of two numbers is");
                System.out.println(div);
                break;
            }
            default:
                System.out.println("invalid button");
        }
    }
}
