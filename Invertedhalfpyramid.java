import java.util.*;
public class Invertedhalfpyramid {
    public  static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int r=input.nextInt();
       int num=1;
        for(int i=r;i>=1; i--){
            
            for(int j=1; j<=i; j++){
                System.out.print(num);
                
            }
            System.out.println();
            num++;
        }
       
    }
}
