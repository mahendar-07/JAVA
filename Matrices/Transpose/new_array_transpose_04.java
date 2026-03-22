/*
creating the new array for transpose of matrix

*/
class new_array_transpose_04{
public static void main(String args[]){
int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
System.out.println("the original matrix:");
for(int r=0;r<mat.length;r++){
System.out.print("|");
for(int c=0;c<mat[0].length;c++){
System.out.print(mat[r][c] +" ");
}
System.out.print("|");
System.out.println();
}
System.out.println("creating new array for the matrix Transpose ");
int Tramat[][]=new int[mat.length][mat[0].length];
for(int c=0;c<mat[0].length;c++){
for(int r=0;r<mat.length;r++){
Tramat[c][r]=mat[r][c];
}
}
System.out.println("displaying the new Transpose matrix");
for(int i=0;i<Tramat.length;i++){
System.out.print("|");
for(int j=0;j<Tramat[0].length;j++){
System.out.print(Tramat[i][j]+" ");
}
System.out.print("|");
System.out.println();
}
}
}