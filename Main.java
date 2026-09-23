import java.util.Locale;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] e = new int[7];
        for (int i = 0; i < e.length; i++) {
            e[i] = 6 + 2 * i;
        }
        float[] x = new float[16];
        Random random = new Random();
        for (int j = 0; j < x.length; j++) {
            x[j] = -13.0f + random.nextFloat() * (8.0f - (-13.0f));
        }
        double[][] e1 = new double[7][16];
        for (int i = 0; i < e1.length; i++) {
            for (int j = 0; j < e1[i].length; j++) {
                e1[i][j] = calculate(e[i], x[j]);
            }
        }
        printMatrix(e1);
    } 
    public static double calculate(int ei, float xf) {
        double x = xf;
        if (ei == 16) {
            double base = 0.25 / (2 - Math.pow(x / 0.5, 2)) / 4;
            double power = 0.5 / (1 - Math.exp(x));
            return Math.pow(base, power);
    } else if (ei == 8 ) {
        double inner = (Math.pow(x * (x - 1), 2) + 0.5) / 2;
        return Math.exp(Math.pow(inner, Math.exp(x)));
    } else if (ei == 10) {
        double inner = (Math.pow(x * (x - 1), 2) + 0.5) / 2;
        return Math.exp(Math.pow(inner, Math.exp(x)));
    } else if (ei == 14) {
        double inner = (Math.pow(x * (x - 1), 2) + 0.5) / 2;
        return Math.exp(Math.pow(inner, Math.exp(x)));
    } else {
        double root = Math.cbrt(Math.exp(Math.log(Math.abs(x))));
        return Math.pow(2.0 / 3 * (root + 1), 2);
    }
}
 public static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double v : row) {
                System.out.printf(Locale.US, "%10.4f", v);
            }
            System.out.println();
        }
    }
}


	
