import java.util.*;
class Solution{

//Remove spaces from the given String 
public String removespaces(String strr){
StringBuilder rs=new StringBuilder();
for(char c:strr.toCharArray()){
if(c != ' ' && c != '\t' && c != '\n'){
rs.append(c);
}

}
return rs.toString();
}
//6)Remove characters except the alphabets from the String
public String removecharacters(String st){
if(st==null){
return "";
}
StringBuilder rc=new StringBuilder();
for(char ch:st.toCharArray()){
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){//if(Character.isLetter(ch))
rc.append(ch);
}
}
return rc.toString();
}
//7)String Reverse
//using BruteForce
public String reverse(String s){

 if (s == null) return "";

    StringBuilder sb = new StringBuilder();

    for (int i = s.length() - 1; i >= 0; i--) {
        sb.append(s.charAt(i));
    }

    return sb.toString();
}
//8)Remove brackets from an algebraic expression
public String removebrackets(String s){
if(s==null)return "";
StringBuilder rb=new StringBuilder();
for(char c:s.toCharArray()){
if(c!='('&&c!=')'){
rb.append(c);
}
}
return rb.toString();
}



}
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the String ");
String str=sc.nextLine();
Solution sol=new Solution();
//System.out.println(sol.removespaces(str));
//System.out.println(sol.removecharacters(str));
//System.out.println(sol.reverse(str));
System.out.println(sol.removebrackets(str));

}
}