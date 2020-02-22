package Sudoku;

import java.util.Set;
import java.util.HashSet;

public class SudokuValidator {
    public static boolean check(int[][] sudoku) {
        Set<Integer> arr = new HashSet<>();
        Set<Integer> arrTwo = new HashSet<>();
        Set<Integer> arrThree = new HashSet<>();
        Set<Integer> arrFour = new HashSet<>();
        Set<Integer> arrFive = new HashSet<>();
        Set<Integer> arrSix = new HashSet<>();
        Set<Integer> arrSeven = new HashSet<>();
        Set<Integer> arrEight = new HashSet<>();
        Set<Integer> arrNine = new HashSet<>();
        for(int a=0; a<sudoku.length; a++){
            arr.clear();
            for(int b=0; b<sudoku.length; b++){
                if(arr.add(sudoku[b][a]) == false | sudoku[b][a] <= 0 | sudoku[b][a] >9){
                    return false;
                }
            }
        }
        for (int[] row : sudoku){
            arr.clear();
            for(int c=0; c<sudoku.length; c++){
                if(arr.add(row[c]) == false){
                    return false;
                }
            }
        }
        arr.clear();
        for (int d=0; d<sudoku.length; d++){
            for (int e=0; e<sudoku.length; e++){
                if(e < 3 && d<3){
                    if(arr.add(sudoku[d][e]) == false){
                        return false;};
                }
                else if(e>2 && e<6 && d<3){
                    if(arrTwo.add(sudoku[d][e]) == false){
                        return false;};
                }
                else if(e>5 && d<3){
                    if(arrThree.add(sudoku[d][e]) == false){
                        return false;};
                }
                else if(e<3 && d>2 && d<6){
                    if(arrFour.add(sudoku[d][e]) == false){
                        return false;};
                }
                else if(e>2 && e<6 && d>2 && d<6){
                    if(arrFive.add(sudoku[d][e]) == false){
                        return false;};
                }
                else if(e>5 && d>2 && d<6){
                    if(arrSix.add(sudoku[d][e]) == false){return false;};
                }
                else if(e<3 && d>5){
                    if(arrSeven.add(sudoku[d][e]) == false){return false;};
                }
                else if(e>2 && e<6 && d>5){
                    if(arrEight.add(sudoku[d][e]) == false){return false;};
                }
                else if(e>5 && d>5){
                    if(arrNine.add(sudoku[d][e]) == false){return false;};
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] firstsolution = {
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


        int[][] secondSolution = new int[][]{
                {6, 2, 4, 6, 7, 8, 9, 1, 2},
                {5, 8, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[][] thirdSolution = new int[][]{
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 0, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(check(firstsolution));
        System.out.println(check(secondSolution));
        System.out.println(check(thirdSolution));
    }
}