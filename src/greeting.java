import  java.util.*;

public class greeting {
    public static void main(String [] args){
        Scanner s1 = new Scanner(System.in);
        int button = s1.nextInt();
      /*  if(button==1){
            System.out.println("Namaste");
        }
        else if(button==2){
            System.out.println("Welcome");
        } else if (button==3) {
            System.out.println("Vanakam");
        }
        else {
            System.out.println("invalid button");
        }*/

        switch (button){
            case 1:
                System.out.println("Namaste");
                break;
            case 2:
                System.out.println("Welcome");
                break;
            case 3:
                System.out.println("Vanakam");
                break;
            default:
                System.out.println("invalid button");
        }
    }
}
