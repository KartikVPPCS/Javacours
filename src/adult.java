import  java.util.*;
public class adult {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        int a= s1.nextInt();
        int b= s1.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if (a>b){
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }
    }
}
