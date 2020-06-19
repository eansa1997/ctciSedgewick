package Arrays_and_Strings.Q8_Zero_Matrix;

import edu.princeton.cs.algs4.StdOut;

public class answer {
    public static void main(String[] args) throws Exception {
        int[][] arr = { {1,0,3,4},
                        {2,3,5,5}, 
                        {1,3,6,7} };
        printArray(arr);
        StdOut.println();
        zeroMatrix(arr);
        printArray(arr);
    }
    public static void zeroMatrix(int[][] matrix){
        int[] rowStatus = new int[matrix.length];
        int[] colStatus = new int[matrix[0].length];

        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    if(rowStatus[i] == 0){
                        for(int r = 0; r < matrix.length; r++){
                            matrix[r][j] = 0;
                        }
                        rowStatus[i] = 1;
                    }
                    if(colStatus[j] == 0){
                        for(int c = 0; c < matrix[i].length; c++){
                            matrix[i][c] = 0;
                        }
                        colStatus[j] = 1;
                    }
                }
            }
        }
        
    }
    public static void printArray(int[][] matrix){
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length; j++){
                StdOut.print(matrix[i][j]+" ");
            }
            StdOut.println();
        }
    }
}