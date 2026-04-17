/*
row wise displaying the matrix 
| 1 2 3 |
| 4 5 6 |
| 7 8 9 |

*/
class matrix{
public static void main(String args[]){
int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
System.out.println("row = "+ mat.length +" column="+mat[0].length);
System.out.println("row-wise traversal :");
for(int row=0;row<mat.length;row++){
System.out.print("| ");
for(int col=0;col<mat[0].length;col++){
System.out.print(mat[row][col]+" ");
}
System.out.print("|");
System.out.println("");
}
System.out.println("");
}
}