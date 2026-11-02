package Tugas_BAB_4;

import javax.swing.JOptionPane;

public class Latihan04 {
    public static void main(String[] args) {
        String ukuran_Array = JOptionPane.showInputDialog(null, "Masukkan jumlah array:", "Data array", JOptionPane.QUESTION_MESSAGE);
        int ukuran = Integer.parseInt(ukuran_Array);

        int[] x = new int[ukuran];

        for (int i = 0; i < ukuran; i++) {
            String input_nilai = JOptionPane.showInputDialog(null, "Masukkan angka:", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            x[i] = Integer.parseInt(input_nilai);
        }

        int max = x[0];
        int min = x[0];

        StringBuilder output = new StringBuilder("Output Array\n");
        for (int i = 0; i < ukuran; i++) {
            output.append("x[").append(i).append("] = ").append(x[i]).append("\n");
            if (x[i] > max) max = x[i];
            if (x[i] < min) min = x[i];
        }

        output.append("\nNilai terbesar adalah ").append(max);
        output.append("\nNilai terkecil adalah ").append(min);

        JOptionPane.showMessageDialog(null, output.toString(), "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}