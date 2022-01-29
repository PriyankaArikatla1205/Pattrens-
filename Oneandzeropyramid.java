import java.util.*;

public class Oneandzeropyramid {
    public static void main(String[]args) {
        Scanner input =new Scanner(System.in);
        int r=input.nextInt();
        for(int i=0;i<=r;i++){
            for(int j=0;j<=i; j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
