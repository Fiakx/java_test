public class Main {
    public static void main(String[] args) {
        Matrix test1 = new Matrix(10, 10, 1);
        Matrix test2 = new Matrix(10, 10, 2);

        test1.add(test2);
        test1.printMatrix();
    }
}

class Matrix {
    int n, m;
    int[][] matrice;

    Matrix(int n, int m, int q) {
        this.n = n;
        this.m = m;
        matrice = new int[m][n];
        createMatrix(q);
    }

    void createMatrix(int q) {
        for (int i = 0; i < m; i++) {
            for (int y = 0; y < n; y++) {
                matrice[i][y] = q;
            }
        }
    }

    void printMatrix() {
        for (int i = 0; i < m; i++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matrice[i][y]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void add(Matrix b){
        for (int i = 0; i < m; i++) {
            for (int y = 0; y < n; y++) {
                matrice[i][y] += b.matrice[i][y];
            }
        }
    }
}
