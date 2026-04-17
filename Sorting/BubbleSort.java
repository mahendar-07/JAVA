/*

*/
import java.util.*;
class BubbleSort{
public static void BS(int a[]){
int n=a.length;
int temp=0;
for(int i=0;i<n;i++){
for(int j=i;j<n;j++){
if(a[i]>a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("After Sorting the array using the BubbleSort");
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter size of an array:");
int n=sc.nextInt();
System.out.print("enter the array elements");
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("array elements are:");
for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
}
BS(arr);
}
}