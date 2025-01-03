import java.util.Scanner;
public class MatrixAddition{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int N=s.nextInt();
        System.out.println("Enter the no of columns: ");
        int M=s.nextInt();
        int[][] matrixA=new int[N][M];
        int[][] matrixB=new int[N][M];
        int[][] matrixC=new int[N][M];
        System.out.println("Enter the elements of the matrixA: ");
        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matrixA[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter the elements of the matrixB: ");
        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matrixB[i][j]=s.nextInt();
            }
        }
        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matrixC[i][j]=matrixA[i][j]+matrixB[i][j];
            }
        }
        System.out.println("Sum of the Matrixes: ");
        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++){
               System.out.print(matrixC[i][j]+" ");
            }
            System.out.println();
        }
    }
}
