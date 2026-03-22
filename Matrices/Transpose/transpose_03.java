/*
displaying the matrix transpose 
| 1 2 3 |   | 1 4 7 |
| 4 5 6 | =>| 2 5 8 |   
| 7 8 9 |   | 3 6 9 |

*/
class column_wise_02{
public static void main(String args[]){
int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
System.out.println("row = "+ mat.length +" column="+mat[0].length);
System.out.println(" Transpose of a matrix :");
for(int col=0;col<mat[0].length;col++){
System.out.print("| ");
for(int row=0;row<mat.length;row++){
System.out.print(mat[row][col]+" ");
}
System.out.print("|");
System.out.println("");
}
System.out.println("");
}
}