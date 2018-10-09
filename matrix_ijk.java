import java.io.*;
public class Main {

    static int N = 5000;
    static int BORDER = 1000;

    // This function multiplies mat1[][]
    // and mat2[][], and stores the result
    // in res[][]
    static void multiply1(int mat1[][],
                         int mat2[][], int res[][])
    {
        System.out.println("i,j,k");
        int i, j, k;
        for (i = 0; i < N; i++)
        {
            for (j = 0; j < N; j++)
            {
                for (k = 0; k < N; k++)
                    res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }

    static void multiply2(int mat1[][], int mat2[][], int res[][])
    {
        System.out.println("i,k,j");
        int i, j, k;
        for (i = 0; i < N; i++)
        {
            for (k = 0; k < N; k++)
            {
                for (j = 0; j < N; j++)
                    res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }

    static void multiply3(int mat1[][], int mat2[][], int res[][])
    {
        System.out.println("j,i,k");
        int i, j, k;
        for (j = 0; j < N; j++)
        {
            for (i = 0; i < N; i++)
            {
                for (k = 0; k < N; k++)
                    res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }

    static void multiply4(int mat1[][], int mat2[][], int res[][])
    {
        System.out.println("j,k,i");
        int i, j, k;
        for (j = 0; j < N; j++)
        {
            for (k = 0; k < N; k++)
            {
                for (i = 0; i < N; i++)
                    res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }

    static void multiply5(int mat1[][], int mat2[][], int res[][])
    {
        System.out.println("k,i,j");
        int i, j, k;
        for (k = 0; k < N; k++)
        {
            for (i = 0; i < N; i++)
            {
                for (j = 0; j < N; j++)
                    res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }

    static void multiply6(int mat1[][], int mat2[][], int res[][])
    {
        System.out.println("k,j,i");
        int i, j, k;
        for (k = 0; k < N; k++)
        {
            for (j = 0; j < N; j++)
            {
                for (i = 0; i < N; i++)
                    res[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }

    // Driver code
    public static void main (String[] args)
    {

        long x,y;

        int[][] mat1 = new int[N][N];
        int[][] mat2 = new int[N][N];

        int[][] res1 = new int[N][N];
        int[][] res2 = new int[N][N];
        int[][] res3 = new int[N][N];
        int[][] res4 = new int[N][N];
        int[][] res5 = new int[N][N];
        int[][] res6 = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat1[i][j] = (int) (Math.random() * BORDER);
                mat2[i][j] = (int) (Math.random() * BORDER);
                res1[i][j] = 0;
                res2[i][j] = 0;
                res3[i][j] = 0;
                res4[i][j] = 0;
                res5[i][j] = 0;
                res6[i][j] = 0;
            }//end for loop
        }
        x = System.nanoTime();
        multiply1(mat1, mat2, res1);
        y = System.nanoTime();
        System.out.println(y-x);
        multiply2(mat1, mat2, res2);
        x = System.nanoTime();
        System.out.println(x-y);
        multiply3(mat1, mat2, res3);
        y = System.nanoTime();
        System.out.println(y-x);
        multiply4(mat1, mat2, res4);
        x = System.nanoTime();
        System.out.println(x-y);
        multiply5(mat1, mat2, res5);
        y = System.nanoTime();
        System.out.println(y-x);
        multiply6(mat1, mat2, res6);
        x = System.nanoTime();
        System.out.println(x-y);

    }
}
