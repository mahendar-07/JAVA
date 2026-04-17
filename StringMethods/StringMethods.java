import java.util.*;
class StringMethods{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the string it takes only sigle word:");
String str=sc.next();
sc.nextLine();
System.out.println(str);
System.out.println("");
System.out.println("nextLine()->it takes the next word or entire line");
System.out.print("enter any String:");
str=sc.nextLine();
System.out.println(str);
System.out.println("");
System.out.println("1)length()");
System.out.println(str.length());
System.out.println(str);
System.out.println("2)charAt(index)");
System.out.println("str.charAt(0)"+str.charAt(0));
System.out.println("");
System.out.println("String Comparisons");
System.out.println("3)equals");
String a="hello";
String ab=new String("hello");
System.out.println("String a=\"hello\";\nString ab=new String(\"hello\");");
System.out.println("a==ab"+a==ab);
System.out.println("a.equals(ab):"+a.equals(ab));
System.out.println("");
String abc="Hello";
System.out.println("4)equalsIgnoreCase()");
System.out.println("String abc=\"Hello\"");
System.out.println("a.equals(abc):"+a.equals(abc));
System.out.println("a.equalsIgnoreCase(abc):"+a.equalsIgnoreCase(abc));
System.out.println("");
System.out.println("5)compareTo() -> compares in lexicographical order \nif return 0 -> equal ,\n +ve first string greater ,\n -ve first string is smaller ");
System.out.println("a.compareTo(abc) :	 "+a.compareTo(abc));
System.out.println("a.compareTo(abc) :	 "+a.compareTo(ab));
System.out.println("");
System.out.println("Searching strings");
System.out.println("6)contains()->checks substring");








}
}