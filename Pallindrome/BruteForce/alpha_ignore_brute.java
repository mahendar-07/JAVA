/*
skipping the alphanumeric characters
!Character.isLetterOrDigit(s.charAt(i)
*/
import java.util.*;
class alpha_ignore_brute{
public static boolean ispallindrome(String s){
int left=0,right=s.length()-1;
while(left<right){
if(!Character.isLetterOrDigit(s.charAt(left))){
left++;
}
else if(!Character.isLetterOrDigit(s.charAt(right))){
right--;
}
else if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
return false;
}
else{
left++;
right--;
}
}
return true;
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the string:");
String str=sc.nextLine();
boolean result=ispallindrome(str);
System.out.println(result?"Pallindrome":"Not Pallindrome");

}
}