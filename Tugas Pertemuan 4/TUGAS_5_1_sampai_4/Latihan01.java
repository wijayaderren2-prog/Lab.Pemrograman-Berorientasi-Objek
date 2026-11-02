package TUGAS_5_1_sampai_4;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan01 {
    public static void main(String[] args) {
        // Inisialisasi ArrayList 2D untuk Matrix A dan B
        ArrayList<ArrayList<Integer>> matrixA = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixB = new ArrayList<>();

        // Input Matrix A (2x2)
        JOptionPane.showMessageDialog(null, "Masukkan elemen untuk Matrix A (2x2)");
        for (int i = 0; i < 2; i++) {
            matrixA.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Matrix A [" + i + "][" + j + "]:");
                matrixA.get(i).add(Integer.parseInt(input));
            }
        }

        // Input Matrix B (2x2)
        JOptionPane.showMessageDialog(null, "Masukkan elemen untuk Matrix B (2x2)");
        for (int i = 0; i < 2; i++) {
            matrixB.add(new ArrayList<>());
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog("Matrix B [" + i + "][" + j + "]:");
                matrixB.get(i).add(Integer.parseInt(input));
            }
        }

        // Format Tampilan Output
        String output = "Matrix A:\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output += matrixA.get(i).get(j) + " ";
            }
            output += "\n";
        }

        output += "\nMatrix B:\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output += matrixB.get(i).get(j) + " ";
            }
            output += "\n";
        }

        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
}