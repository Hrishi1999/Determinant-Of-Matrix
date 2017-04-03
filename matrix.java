import java.util.Scanner;

public class matrix {
 
/*  
 00 01 02
 10 11 12
 20 21 22    
 */

 public double determinant(double A[][], int x) {
  double det = 0;
  if (x == 1) {
   det = A[0][0];
  } else if (x == 2) {
   det = A[0][0] * A[1][1] - A[1][0] * A[0][1];
  } else if (x == 3) {
   det = A[0][0] * (A[1][1] * A[2][2] - A[2][1] * A[1][2]) - A[0][1] * (A[1][0] * A[2][2] - A[2][0] * A[1][2]) + A[0][2] * (A[1][0] * A[2][1] - A[2][0] * A[1][1]);
  }

  return det;
 }


 public static void main(String args[]) {

  System.out.println("Currently only supports 2X2 and 3X3");

  Scanner input = new Scanner(System.in);
  System.out.println("Order :");
  int n = input.nextInt();

  if (n < 5) {
   System.out.println("Enter elements");
   double[][] mat = new double[n][n];
   for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
     mat[i][j] = input.nextDouble();
    }
   }

   matrix I = new matrix();
   System.out.println("The determinant of the Matrix is : " + I.determinant(mat, n));

  } else {
   System.out.println("Currently doesnt support more than order 3");
  }

  input.close();


 }
}