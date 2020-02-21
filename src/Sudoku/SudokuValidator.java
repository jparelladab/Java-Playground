package Sudoku;

import java.util.Arrays;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        for(int a=0; a<sudoku.length-1; a++){
            for(int b=0; b<sudoku.length; b++){
                if(sudoku[a][b] == sudoku[a][b+1]){
                    return false;

                for(int c=0; c<sudoku.length; c++){
                    for(int d=0; d<sudoku.length; d++){
                        if(sudoku[a][c] == sudoku[b][d]){
                            return false;
                        }
                    }

                }

            }
        }
        for(int l=0; l<sudoku.length; l++){
            for(int n=0; n<sudoku.length-1; n++){
                if(sudoku[l][n] == sudoku[l][n+1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] validSolution = new int[][] {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
 };
        int[][] invalidSolution = new int[][]{
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 0, 3, 4, 8},
                {1, 0, 0, 3, 4, 2, 5, 6, 0},
                {8, 5, 9, 7, 6, 1, 0, 2, 0},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 0, 1, 5, 3, 7, 2, 1, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 0, 0, 4, 8, 1, 1, 7, 9}
        };
        System.out.println(check(validSolution));
        System.out.println(check(invalidSolution));
    }
}