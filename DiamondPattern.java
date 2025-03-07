import java.util.Scanner;

public class DiamondPattern {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
