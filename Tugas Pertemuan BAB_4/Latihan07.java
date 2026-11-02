package Tugas_BAB_4;

import javax.swing.JOptionPane;

public class Latihan07 {
    public static void main(String[] args) {
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];
        int[][] matrixC = new int[2][2];

        String npmInput = JOptionPane.showInputDialog(null, "Masukkan NPM Anda:");
        long npm = Long.parseLong(npmInput);
        boolean isGanjil = (npm % 2 != 0);

        // Input Matrix A
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matrix A [" + i + "][" + j + "]:"));
            }
        }

        // Input Matrix B
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixB[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Matrix B [" + i + "][" + j + "]:"));
            }
        }

        // Operasi Matriks
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (isGanjil) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                } else {
                    matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
                }
            }
        }

        StringBuilder output = new StringBuilder("Hasil Matrix C (" + (isGanjil ? "Penjumlahan" : "Pengurangan") + "):\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                output.append(matrixC[i][j]).append(" ");
            }
            output.append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Hasil Matrix C", JOptionPane.INFORMATION_MESSAGE);
    }
}