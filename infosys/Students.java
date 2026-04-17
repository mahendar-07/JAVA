class Students{
private String stdname;
private int stdId;
private float qualifyingExammarks;
private char residentialStatus;
private int yearOfEngineering;
public void setStdId(int id){
this.stdId=id;
}
public int getStdId(){
return stdId;
}
public void setstdname(String name){
this.stdname=name;
}
public String getstdname(){
return stdname;
}
public void setmarks(float marks){
this.qualifyingExammarks=marks;
}
public float getmarks(){
return qualifyingExammarks;
}
public void setresidentstatus(char rs){
this.residentialStatus=rs;
}
public char getresidentStatus(){
return residentialStatus;
}
public void setyearOfEngineering(int yoe){
this.yearOfEngineering=yoe;
}
public int getyearOfEngineering(){
return yearOfEngineering;
}
public static void main(String args[]){
Students s1=new Students();
s1.setstdname("jacob");
s1.setStdId(1001);
s1.setmarks(80);
s1.setresidentstatus('H');
s1.setyearOfEngineering(3);
System.out.println("Student Name        :  "+s1.getstdname());
System.out.println("Student Id          :  "+s1.getStdId());
System.out.println("Qualifying marks    :  "+s1.getmarks());
System.out.println("Year of Engineering :  "+s1.getyearOfEngineering());
System.out.println("Residential status  :  "+(s1.getresidentStatus()=='H'?"Hostellers":"Day Scholar"));
System.out.println("");
Students s2=new Students();
s2.setstdname("Peter");
s2.setStdId(1002);
s2.setmarks(83);
s2.setresidentstatus('D');
s2.setyearOfEngineering(2);
System.out.println("Student Name        :  "+s2.getstdname());
System.out.println("Student Id          :  "+s2.getStdId());
System.out.println("Qualifying marks    :  "+s2.getmarks());
System.out.println("Year of Engineering :  "+s2.getyearOfEngineering());
System.out.println("Residential status  :  "+(s2.getresidentStatus()=='H'?"Hostellers":"Day Scholar"));
System.out.println("");


}
}