import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean diagonale = true;
        int[][] m = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; i++) {
                System.out.println("inserire elemento");
                m[i][j] = in.nextInt();
            }
        }
        System.out.println(isDiagonale(m, diagonale));
    }

    private static boolean isDiagonale(int[][] m, boolean diagonale) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; i++) {
                if (m[i][j] != m[j][i]) {
                    diagonale = false;
                    break;
                }
            }
        }
        return diagonale;
    }
}