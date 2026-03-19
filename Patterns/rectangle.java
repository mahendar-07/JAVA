/* 
displaying the rectangle on the console
example 
enter length =5
enter breadth=6
******
******
******
******
******
*/
import java.util.*;
class rectangle{
public static void rec(int l,int b){
for(int i=1;i<=l;i++)
{
for(int j=1;j<=b;j++){
System.out.print("*");
}
System.out.println("");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter length:");
int len=sc.nextInt();
System.out.print("enter breadth:");
int bre=sc.nextInt();
rec(len,bre);
}
}