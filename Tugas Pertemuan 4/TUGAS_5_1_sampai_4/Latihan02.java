package TUGAS_5_1_sampai_4;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan02 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixC = new ArrayList<>();

        // Input Matrix A
        JOptionPane.showMessageDialog(null, "Masukkan elemen untuk Matrix A (2x2)");
        for (int i = 0; i < 2; i++) {
            matrixA.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Matrix A [" + i + "][" + j + "]:");
                matrixA.get(i).add(Integer.parseInt(input));
            }
        }

        // Input Matrix B
        JOptionPane.showMessageDialog(null, "Masukkan elemen untuk Matrix B (2x2)");
        for (int i = 0; i < 2; i++) {
            matrixB.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Matrix B [" + i + "][" + j + "]:");
                matrixB.get(i).add(Integer.parseInt(input));
            }
        }

        // Perkalian Matrix: C = A * B
        for (int i = 0; i < 2; i++) {
            matrixC.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                int sum = 0;
                for (int k = 0; k < 2; k++) {
                    sum += matrixA.get(i).get(k) * matrixB.get(k).get(j);
                }
                matrixC.get(i).add(sum);
            }
        }

        // Format Tampilan Output
        String output = "Hasil Perkalian Matrix C (A * B):\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output += matrixC.get(i).get(j) + " ";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
}