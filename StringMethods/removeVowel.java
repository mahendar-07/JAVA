import java.util.*;
class removeVowel{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String strr=sc.nextLine();
StringBuilder str=new StringBuilder(); 
for(char ch:strr.toCharArray()){
ch=Character.toLowerCase(ch);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
continue;
}
str.append(ch);
}
System.out.println(str);
}

}