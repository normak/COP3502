public class MatrixAddition {
	public static void main(String[] args) {
		double[][] matrix1 = {{5, 3, 9, 12},
								{ 3, 5, 1, 10},
								{ 4, 12, 17, 1},
								{ 45, 23, 1, 2}};
		double[][] matrix2 = {{6, 3, 6, 14},
								{ 7, 3, 9, 12},
								{5, 13, 7, 10},
								{4, 2, 12, 5}};
		double[][] matrix3 = addMatrix(matrix1, matrix2);
		for (int r = 0; r < matrix3.length; r++) {
         for (int c = 0; c < matrix3[r].length; c++) {
					if(c % 4 == 0 || c > 3) {
					System.out.println();
					}
         
            System.out.print(matrix3[r][c]+ " ");}
      }
   }
   


	public static double[ ][ ] addMatrix(double[ ][ ] a, double[ ][ ] b) {
		double[][] matrix = new double[4][4];
		for (int r = 0; r < matrix.length; r++)
      {
         for (int c = 0; c < matrix.length; c++)
         {
            matrix[r][c] += a[r][c];
            matrix[r][c] += b[r][c];
         }
      }
      return matrix;
   }
}
