import java.util.*;
public class Hallowbutterfly {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int r=input.nextInt();
        //upperpart
        for(int i=1; i<=r; i++){
            for(int j=1; j<=i; j++){
                if(j==1||j==i){
                    System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
            }
                //spaces
                int space=2*(r-i);
                for(int j=1; j<=space; j++){
                    System.out.print(" ");

                }
                for(int j=1; j<=i; j++){
                    if(j==1||j==i){
                        System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
            }
        
        System.out.println();
        }
        for(int i=r; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1||j==i){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                //spaces
                int space=2*(r-i);
                for(int j=1; j<=space; j++){
                    System.out.print(" ");

                }
                for(int j=1; j<=i; j++){
                    if(j==1||j==i){
                        System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
            }
        
        System.out.println();
        }
    }
}
