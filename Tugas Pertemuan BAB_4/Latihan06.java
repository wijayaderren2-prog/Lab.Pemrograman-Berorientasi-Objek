package Tugas_BAB_4;

import javax.swing.JOptionPane;

public class Latihan06 {
    public static void main(String[] args) {
    	
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];

        // Input Matrix A
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null, "Masukkan nilai Matrix A [" + i + "][" + j + "]:");
                matrixA[i][j] = Integer.parseInt(input);
            }
        }

        // Input Matrix B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                String input = JOptionPane.showInputDialog(null, "Masukkan nilai Matrix B [" + i + "][" + j + "]:");
                matrixB[i][j] = Integer.parseInt(input);
            }
        }

        StringBuilder output = new StringBuilder("Matrix A:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output.append(matrixA[i][j]).append(" ");
            }
            output.append("\n");
        }

        output.append("\nMatrix B:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output.append(matrixB[i][j]).append(" ");
            }
            output.append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Output Matrix", JOptionPane.INFORMATION_MESSAGE);
    }
}