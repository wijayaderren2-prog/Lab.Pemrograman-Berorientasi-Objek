package Tugas_BAB_4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan10 {
    public static void main(String[] args) {
        ArrayList<String> field = new ArrayList<>();
        
        field.add("Nama Lengkap");
        field.add("Alamat");
        field.add("No Telp");

        ArrayList<String> values = new ArrayList<>();

        for (int i = 0; i < field.size(); i++) {
            String val = JOptionPane.showInputDialog(null, "Masukkan " + field.get(i) + ":", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            values.add(val);
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < field.size(); i++) {
            output.append(field.get(i)).append(": ").append(values.get(i)).append("\n");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}