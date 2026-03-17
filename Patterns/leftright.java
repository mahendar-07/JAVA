
import java.util.*;
class leftright{
    public static void printleftright_triangle(int n){
        for(int i=0;i<n;i++){
            //for displaying the spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        printleftright_triangle(n);
    }
}


