import java.util.*;
public class Butterfly {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        //upper part
        for(int i=1;i<=r; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int space = 2*(r-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            System.out.println();
        }
         for(int i=r; i>=1; i--){
             for(int j=1; j<=i; j++){
                 System.out.print("*");
             }
             int space =2*(r-i);
             for(int j=1; j<=space; j++){
                 System.out.print(" ");
             }
             for(int j=1; j<=i; j++ ){
                 System.out.print("*");
             }
             System.out.println();
         }

    }
}
 