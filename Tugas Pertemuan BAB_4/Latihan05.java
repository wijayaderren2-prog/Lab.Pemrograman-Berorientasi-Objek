package Tugas_BAB_4;

import javax.swing.JOptionPane;

public class Latihan05 {
	
    public static void main(String[] args) {
        String[] field = {"Nama Lengkap", "Alamat", "No Telp"};
        String[] values = new String[field.length];

        for (int i = 0; i < field.length; i++) {
            values[i] = JOptionPane.showInputDialog(null, "Masukkan " + field[i] + ":", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < field.length; i++) {
            output.append(field[i]).append(": ").append(values[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}