/**
 * Rect
 */
import java.io.*;
import java.util.Scanner;
public class Rect {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int r =input.nextInt();
        int c = input.nextInt();
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }

    
}