import java.util.Scanner;
public class Invertedpyramid {
    public static void main(String[]args){
        Scanner input  = new Scanner(System.in);
        int r = input.nextInt();
        for(int i=r ;i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
    System.out.println();

    }
    }
}
