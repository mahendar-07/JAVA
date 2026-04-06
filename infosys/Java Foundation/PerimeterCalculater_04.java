/*Develop a basic Java program to understand 
class and initialize the instance variable of a class.
*/
class Rectangle_03{
private int length;
private int breadth;
public void setlength(int l){
this.length=l;
}
public void setbreadth(int b){
this.breadth=b;
}
public int getlength(){
return length;
}
public  int getbreadth(){
return breadth;
}
public void display(){
System.out.println("Rectangle dimensions are:");
System.out.println("length: "+getlength()+" Breadth :"+getbreadth());
}
public void calculatePerimeter(){

System.out.println("Perimeter: "+2*(getlength()+getbreadth()));

}
}
public class PerimeterCalculater_04{
public static void main(String args[]){

Rectangle_03 r1=new Rectangle_03();
r1.setlength(2);
r1.setbreadth(3);
r1.display();
r1.calculatePerimeter();
}
}