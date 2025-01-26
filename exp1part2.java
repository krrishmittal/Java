import java.util.Scanner;

public class exp1part2 {
    public static void sum(int [][]matrix1, int [][]matrix2,int n,int m){
        int [][]mat=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Sum of matrix:" );
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void sub(int [][]matrix1,int [][]matrix2,int n,int m){
        int [][]mat=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        System.out.println("Substraction of matrix:" );
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");;
            }
            System.out.println();
        }
    }
    public static void mul(int [][]matrix1,int [][]matrix2,int n,int m){
        int [][]mat=new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = 0; // Initialize each cell to 0
                for (int k = 0; k < m; k++) {
                    mat[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Multiply of matrix:" );
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n=in.nextInt();
        int m=in.nextInt();
        int [][]matrix1=new int[n][m];
        int [][]matrix2=new int [n][m];
        System.out.println("ENter input for matrix1: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int val=in.nextInt();
                matrix1[i][j]=val;
            }
        }
        System.out.println("ENter input for matrix2: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int val=in.nextInt();
                matrix2[i][j]=val;
            }
        }
        sum(matrix1,matrix2,n,m);
        sub(matrix1,matrix2,n,m);
        mul(matrix1,matrix2,n,m);
    }
}
