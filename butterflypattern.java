import java.util.Scanner;

public class butterflypattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n= sc.nextInt();

        for(int i= 1; i<=n; i++){
            //1st Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            int spaces= 2*(n-i);
            for(int j = 1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd Part
            for(int j= 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            //1st Part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            int spaces= 2*(n-i);
            for(int j = 1; j<=spaces; j++){
                System.out.print(" ");
            }
            //2nd Part
            for(int j= 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
