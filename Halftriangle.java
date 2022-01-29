import java.util.*;
public class Halftriangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int r= input.nextInt();
        for(int i=1; i<=r; i++){
            for(int j=1; j<r-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i ; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
