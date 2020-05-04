import java.util.Arrays;

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        boolean [][] isMine = new boolean[m + 2][n + 2];
        int [][] countNeighboring = new int [m + 2][n + 2];
        if (k > m * n) {
            k = m * n;
        }

        for (int i = 0; i < m && k > 0; i++) {
            for (int j = 0; j < n && k > 0; j ++){
                isMine[i][j] = true;
                k--;
            }
        }

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                int r = i + (int) (Math.random() * (m - i));
                int q = j + (int) (Math.random() * (n - j));
                boolean temp = isMine[r][q];
                isMine[r][q] = isMine[i][j];
                isMine[i][j] = temp;
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (isMine[i][j]) {
                    countNeighboring[i][j] += 1;
                }
                if (isMine[i][j + 1]) {
                    countNeighboring[i][j] += 1;
                }
                if (isMine[i][j - 1]) {
                    countNeighboring[i][j] += 1;
                }
                if (isMine[i + 1][j]) {
                    countNeighboring[i][j] += 1;
                }
                if (isMine[i - 1][j]) {
                    countNeighboring[i][j] += 1;
                }
                if (isMine[i + 1][j + 1]) {
                    countNeighboring[i][j] += 1;
                }
                if (isMine[i + 1][j - 1]) {
                    countNeighboring[i][j] += 1;
                }
                if (isMine[i - 1][j + 1]) {
                    countNeighboring[i][j] += 1;
                }
                if (isMine[i - 1][j - 1]) {
                    countNeighboring[i][j] += 1;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (isMine[i][j]) {
                    System.out.print("*  ");
                } else {
                    System.out.print(countNeighboring[i][j] + "  ");
                }
            }
            System.out.println();
        }

    }
}
