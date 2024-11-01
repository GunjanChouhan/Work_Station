package Company;

public class DSA_24_SpiralMatrix {
    public static void printSpiralMatrix(int [][] matrix){
        int startRow=0;
        int startcol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while (startRow <= endRow && startcol <= endCol){
            for (int j=startcol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            for (int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            for (int j=endCol-1;j>=startcol;j--){
                if (startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for (int i=endRow-1;i>=startRow+1;i--){
                if (startcol==endCol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }
            startcol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int matrix[][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
         printSpiralMatrix(matrix);
    }
}
