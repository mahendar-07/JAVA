/*
-->in-place transpose works only for nxn matrix
-->not works for the rectangular matrix
without using any new array to store ,
using existing array to replace elements

*/
class inplace_transpose_05{
public static void main(String args[]){
int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
System.out.println("the original matrix:");
for(int i=0;i<mat.length;i++){
System.out.print("|");
for(int j=0;j<mat[0].length;j++){
System.out.print(mat[i][j]+" ");
}
System.out.print("|");
System.out.println();
}

System.out.println("using in-place ");
for(int r=0;r<mat.length-1;r++)
{
for(int c=r+1;c<mat[0].length;c++){
int temp=mat[r][c];
mat[r][c]=mat[c][r];
mat[c][r]=temp;
}
}
System.out.println("after in-place displaying transpose of the matrix:");
for(int i=0;i<mat.length;i++){
System.out.print("| ");
for(int j=0;j<mat[0].length;j++){
System.out.print(mat[i][j]+" ");
}
System.out.print("|");
System.out.println();
}
}
}