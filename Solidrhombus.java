import java.util.*;
public class solidrhombus {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        for(int i=1; i<r; i++){
            // space
            for(int j=1; j<=r-i;j++){
                System.out.print(" ");
            }
            //stars
            for( int j=1; j<=r; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
