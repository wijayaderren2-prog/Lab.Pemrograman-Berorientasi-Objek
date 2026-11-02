package Tugas_BAB_4;

import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
    	
        String inputangka = JOptionPane.showInputDialog(null, "Masukkan jumlah array:", "Data array", JOptionPane.QUESTION_MESSAGE);
        
        int jumlah_angka = Integer.parseInt(inputangka);

        int[] x = new int[jumlah_angka];

        for (int i = 0; i < jumlah_angka; i++) {
            String inputnilai = JOptionPane.showInputDialog(null, "Masukkan angka:", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            x[i] = Integer.parseInt(inputnilai);
        }

        StringBuilder output = new StringBuilder("Output Array\n");
        for (int i = 0; i < jumlah_angka; i++) {
            output.append("x[").append(i).append("] = ").append(x[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Output Array", JOptionPane.INFORMATION_MESSAGE);
    }
}