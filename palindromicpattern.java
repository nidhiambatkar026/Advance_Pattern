import java.util.Scanner;

public class palindromicpattern {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n= sc.nextInt();

        for(int i= 1; i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1st Part
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd part
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
