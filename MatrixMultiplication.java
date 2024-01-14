
import java.util.Scanner;
 class MultiplyException extends Exception {
     public MultiplyException(String string) {
         super(string);
     }
 }

public class MatrixMultiplication {
    public static void main(String[] main){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the order of 1st matrix :");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int a[][] =new int[m][n];

    System.out.println("Enter the order of 2nd matrix :");
    int p = sc.nextInt();
    int q = sc.nextInt();
    int b[][] =new int[p][q];

        try {
            if (p != n)
                throw  new MultiplyException("MAtrix multiplication is not possible");
        } catch(MultiplyException e) {
            System.out.println("Matrix Exception "+ e );
            return;
        }

    System.out.println("Enter the elements of first matrix :");
    for(int i = 0; i< m; i++) {
        for (int j = 0; j < n; j++) {
            a[i][j] = sc.nextInt();
        }
    }
        System.out.println("Enter the elements of second matrix :");
        for(int i = 0; i< p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = sc.nextInt();
            }
        }


        int c[][] = new int[m][q];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                c[i][j] = 0;
                for (int k = 0; k < p; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("The  matrix :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.println(c[i][j]);
            }
        }
    }
 }

