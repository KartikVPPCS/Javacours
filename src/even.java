import java.util.*;

public class even {
    public static void main(String [] args){
        Scanner s1= new Scanner(System.in);
        int n= s1.nextInt();
        for(int i=2;i<n;i=i+2){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
