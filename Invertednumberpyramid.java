import java.util.Scanner;
public class Invertednumberpyramid {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int r =input.nextInt();
        for(int i=r; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
