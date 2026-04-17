//Remove spaces from the given String 
import java.util.*;
class Solution{
public String removespaces(String strr){
StringBuilder rs=new StringBuilder();
for(char ch:strr.toCharArray()){
if(ch==' '){
continue;
}
rs.append(ch);
}
return rs.toString();
}

}
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the String ");
String str=sc.nextLine();
Solution sol=new Solution();

System.out.prinln(sol.removespaces(str));
}
}