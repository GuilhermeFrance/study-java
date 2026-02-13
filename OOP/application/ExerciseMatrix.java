package OOP.application;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseMatrix {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose the width of matrix: ");

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for( int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Enter a number for matrix: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for(int i = 0; i < n; i++){
                System.out.println(Arrays.toString(mat[i]));
        }


        System.out.println("Which number you want to know more? ");
        int x = sc.nextInt();

        for(int i = 0; i < mat.length ; i++){
            for(int j = 0; j < mat.length; j++){
                if(mat[i][j] == x){
                    System.out.println("Number found! ");
                    System.out.println("Position: " + " [" + i + " , " +  j + "]");
                    System.out.println("Left: " + (mat[i][i]-1));
                    System.out.println("Right: " + (mat[j][j]+1));
                }
            }
        }



    }

}