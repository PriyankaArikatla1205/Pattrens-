import java.util.*;
public class Halfnumberpyramid {
    public static void main(String[]aStrings) {
        Scanner input =new Scanner(System.in);
        int r=input.nextInt();
       
        for(int i=1; i<=r; i++){
            int num=1;
            for(int j=1; j<=i; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
