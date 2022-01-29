import java.util.*;
public class Hallowrhombus {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int r=input.nextInt();
        for(int i=1; i<=r;i++){
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            if(i==1||i==r){
                for(int j=1; j<=r; j++){
                    System.out.print("*");
                }
            }
            else{
            for(int j=1;j<=r; j++){
                if(j==1||j==r){
                System.out.print("*");
                }

                else{
                    System.out.print(" ");
                }
            }
            }
        
            System.out.println();
        }
    }
}
