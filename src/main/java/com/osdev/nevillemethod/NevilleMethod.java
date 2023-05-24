package com.osdev.nevillemethod;

import com.osdev.nevillemethod.ui.MainForm;

/**
 *
 * @author a1den
 */
public class NevilleMethod {

    public static void main(String[] args) {

        MainForm mf = new MainForm();
        mf.setTitle("Metodo de Neville");
        mf.setVisible(true);
        mf.setLocationRelativeTo(null);

        double[] x = {1.0, 2.0, 4.0};
        double[] y = {3.0, 5.0, 7.0};
        double p = 3.0;

        double result = Neville(x, y, p);
//        System.out.println(result);

    }

    public static double Neville(double[] x, double[] y, double p) {
        int n = x.length;
        double[][] q = new double[n][n];

        for (int i = 0; i < n; i++) {
            q[i][0] = y[i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                q[i][j] = ((p - x[i - j]) * q[i][j - 1] - (p - x[i]) * q[i - 1][j - 1]) / (x[i] - x[i - j]);
            }
        }

        return q[n - 1][n - 1];
    }
}
