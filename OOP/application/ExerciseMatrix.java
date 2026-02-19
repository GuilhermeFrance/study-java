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
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == x){
                    System.out.println("Number found! ");
                    System.out.println("Position: " + " [" + i + " , " +  j + "]");

                    if(j>0){
                        System.out.println("Left: " + mat[i][j - 1]);
                    }else{
                        System.out.println("Left: null");
                    }
                    if(j < mat[i].length - 1){
                        System.out.println("Right: " + mat[i][j + 1]);
                    }else{
                        System.out.println("Right: null");
                    }
                    if(i < mat[i].length - 1){
                        System.out.println("Down: " + mat[i+1][j]);
                    }else{
                        System.out.println("Down: null");
                    }

                }
            }
        }



    }

}