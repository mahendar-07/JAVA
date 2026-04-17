/*
pallindrome bruteforce
*/
import java.util.*;
class bruteforce{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int n=str.length();
boolean flag=true;
for(int i=0;i<n/2;i++){
if(str.charAt(i)!=str.charAt(n-i-1)){
flag=false;
break;
}
}
System.out.println(flag?"Pallindrome":"Not Pallindrome");

}
}