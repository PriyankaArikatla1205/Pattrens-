import java.util.*;
public class Diamond {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =r; i>=1; i--){
            for(int j=1; j<=r-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
