
import java.util.*;

public class Aula014_Matrizes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Width of matrix:");

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");

        for(int i = 0; i<mat.length; i++){
            System.out.println(mat[i][i] + " ");
        }

        int count = 0;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println("Negative numbers: " + count);
        sc.close();
    }
}
