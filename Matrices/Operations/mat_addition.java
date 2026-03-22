/*
Matrix Addition
taking input through the keyboard for matrix one and two and 
next adding them
  matrix-A	matrix B 	addition is 
| 1 2 3 |	| 1 2 3 |	| 2  4  6  |
| 4 5 6 |   +	| 4 5 6 |  ==>	| 8  10 12 |
| 7 8 9 |	| 7 8 9 |	| 14 16 18 |


*/
import java.util.*;
class mat_addition{
public static void mat_add(int m1[][],int m2[][]){
if(m1.length != m2.length || m1[0].length != m2[0].length) {
            System.out.println("Subtraction not possible: Different matrix sizes");
            return;
        }
int r=m1.length;
int c=m1[0].length;
int[][] sum=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
sum[i][j]=m1[i][j]+m2[i][j];
}
}
System.out.println("displaying addition of the matrix:");
for(int i=0;i<r;i++){
System.out.print("| ");
for(int j=0;j<c;j++){
System.out.print(sum[i][j]+" ");
}
System.out.print("|");
System.out.println();
}

}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter row for matrix1:");
int rows=sc.nextInt();
System.out.print("enter columns for matrix1:");
int columns=sc.nextInt();
int mat1[][]=new int[rows][columns];
System.out.println("enter the elements of the array");
for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){
mat1[i][j]=sc.nextInt();
}
}

int mat2[][]=new int[rows][columns];
System.out.println("enter the elements of the matrix2:");
for(int i=0;i<rows;i++){
for(int j=0;j<columns;j++){
mat2[i][j]=sc.nextInt();
}
}
System.out.println("displaying matrix 1 elements:");
for(int i=0;i<rows;i++){
System.out.print("| ");
for(int j=0;j<columns;j++){
System.out.print(mat1[i][j]+" ");
}
System.out.print("|");
System.out.println();
}

System.out.println("displaying matrix 1 elements:");
for(int i=0;i<rows;i++){
System.out.print("| ");
for(int j=0;j<columns;j++){
System.out.print(mat2[i][j]+" ");
}
System.out.print("|");
System.out.println();
}
mat_add(mat1,mat2);
}
}