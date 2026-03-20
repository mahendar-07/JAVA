/*
checking the ~ operation on the digits how it works..
~n=-(n+1)
~5=-6
*/
import java.util.*;
class notop{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the num:");
int num=sc.nextInt();
System.out.println(~num);
}
}