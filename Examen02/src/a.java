import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        int n = 10, m[][] = new int[n][n];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<n*n; i++) m[i/n][i%n] = Math.random() > 0.8 ? 1 : 0;

        for (int g = 1; ; g++) {
            System.out.println("\nGen " + g);
            for (int[] f : m) {
                for (int c : f) System.out.print(c + " ");
                System.out.println();
            }

            if (g >= 2) {
                System.out.print("¿Otra? (s/n): ");
                if (!sc.next().equalsIgnoreCase("s")) break;
            }

            int[][] s = new int[n][n];
            for (int r = 0; r < n; r++)
                for (int c = 0; c < n; c++) {
                    int v = 0;
                    for (int i = -1; i <= 1; i++)
                        for (int j = -1; j <= 1; j++)
                            v += m[(r+i+n)%n][(c+j+n)%n];
                    v -= m[r][c];
                    s[r][c] = (v == 3 || (v == 2 && m[r][c] == 1)) ? 1 : 0;
                }
            m = s;
        }
    }
}