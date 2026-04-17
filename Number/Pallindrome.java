import java.util.*;
class Pallindrome{
public static int checkpallindrome(int num){
int rem=0;
int rev=0;
int count=1;
while(num!=0){
System.out.println(count++);
rem=num%10;
System.out.println("remainder :"+rem);
rev=rem+(rev*10);
System.out.println("reverse:"+rev);
num=num/10;
System.out.println("number :"+num);
}
return rev;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter the number :");
int n=sc.nextInt();
int re=checkpallindrome(n);
if(n==re){
System.out.println(n+" the number is a Pallindrome:");
}
else{
System.out.println(n+" number is not a pallindrome");
}
}
}