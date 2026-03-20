import java.util.*;
class listcreation{
class node{
int val;
node next;
node(int data){
this.val=data;
this.next=null;
}
}
node head;
node tail;
public void add(int data){
node nn=new node(data);
 if(head==null){
head=nn;
tail=nn;
}
else{
tail.next=nn;
tail=nn;
}
}
public void printlist(){
node temp=head;
while(temp!=null){
System.out.print(temp.val +"->");
temp=temp.next;
}
System.out.println("null");
}
public static void main(String args[]){
listcreation lst=new listcreation();
lst.add(20);
lst.add(30);
lst.add(40);
lst.add(50);
lst.printlist();
}
}