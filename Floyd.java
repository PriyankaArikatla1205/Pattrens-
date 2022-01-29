
import java.util.*;
public class Floyd {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int num =1;
        for(int i=0; i<r;i++){
            for(int j=0; j<=i; j++){
                System.out.print(num+"  ");
                num++;
            }
  System.out.println();
        }
    }
}
