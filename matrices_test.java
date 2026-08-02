public class Main {
    public static void main(String[] args) {
        Matrix test2 = new Matrix(2, 3, new int[][] {{1,2,3},{4,5,6}});
        Matrix test1 = new Matrix(2, 2, new int[][] {{1,2},{3,4}});

        test1.multp(test2);
        test1.printMatrix();
    }
}
class Matrix {
    int n, m;
    int[][] matrice;

    Matrix(int n, int m, int[][] q) {
        this.n = n;
        this.m = m;
        matrice = new int[n][m];
        createMatrixfull(q);
    }

    void createMatrixfull(int[][] q) {
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < m; y++) {
                matrice[i][y] = q[i][y];
            }
        }
    }

    void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < m; y++) {
                System.out.print(matrice[i][y]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void add(Matrix b) {
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < m; y++) {
                matrice[i][y] += b.matrice[i][y];
            }
        }
    }

    void multp(Matrix b) {
        if (this.m != b.n) {
            throw new IllegalArgumentException(
                "dimensions incompatibles pour la multiplication : "
                + this.n + "x" + this.m + " * " + b.n + "x" + b.m
            );
        }

        int[][] result = new int[this.n][b.m];

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < b.m; j++) {
                int sum = 0;
                for (int k = 0; k < this.m; k++) {
                    sum += this.matrice[i][k] * b.matrice[k][j];
                }
                result[i][j] = sum;
            }
        }

        this.matrice = result;
        this.m = b.m;
    }
}
