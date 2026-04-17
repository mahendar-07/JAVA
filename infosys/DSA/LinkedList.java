//creation node
class Node{
private String data;
private Node next;

//constructor
public Node(String data){
this.data=data;
}
//assign data
public void setdata(String data){
this.data=data;
}

public void setnext(Node node){
this.next=node;
}
//get data
public String getdata(){
return this.data;
}
public Node getnext(){
return this.next;
}
}
class LList{
private Node head;
private Node tail;

public Node gethead(){
return this.head;
}
public Node gettail(){
return this.tail;
}
public void addatend(String data){
Node node=new Node(data);
if(this.head==null){
this.head=this.tail=node;
}
else{
this.tail.setnext(node);
this.tail=node;
}
}
//add data at beggining
public void addAtbegining(String data){
Node node=new Node(data);
if(this.head==null){
this.head=this.tail=node;
}
else{
node.setnext(this.head);
this.head=node;
}
}
public void display(){
Node temp=this.head;
while(temp!=null){
System.out.print(temp.getdata()+"->");
temp=temp.getnext();
}
}
public Node find(String data){
Node temp=this.head;
while(temp!=null){
if(temp.getdata().equals(data)){
return temp;
}
temp=temp.getnext();
}
return null;
}
/*
insert(data,dataBefore)
1.Create a new node with the given data
3.Find the node with dataBefore. If found then,
    a.Call this as the nodeBefore
    b.Make the link of the new node refer to the link of nodeBefore
    c.Make the link of nodeBefore refer to the new node
    d.If link of the new node is null, make it as the tail node
4. If node with dataBefore is not found, display appropriate error message
*/
public void insert(String data,String dataBefore){
Node node=new Node(data);
if(this.head==null){
this.head=this.tail=node;
}
else{
Node nodeBefore=this.find(dataBefore);
if(nodeBefore!=null){
node.setNext(nodeBefore.getNext());
nodeBefore.setNext(node);
if(nodeBefore==this.tail){
this.tail=node;
}
else{
System.out.println("Node not found");
}
}
}
}
}
class Linkedlist{
public static void main(String args[]){
LList list=new LList();
list.addatend("A");
list.addatend("B");
list.addatend("C");
list.addatend("be happy");
System.out.println("Adding elements");
list.addAtbegining("Z");
list.display();
System.out.println(list.find("A"));
}
}