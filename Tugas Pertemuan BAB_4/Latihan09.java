package Tugas_BAB_4;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Latihan09 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        String inputSize = JOptionPane.showInputDialog(null, "Masukkan jumlah array:", "Data array", JOptionPane.QUESTION_MESSAGE);
        int size = Integer.parseInt(inputSize);
        

        for (int i = 0; i < size; i++) {
            String inputVal = JOptionPane.showInputDialog(null, "Masukkan angka:", "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE);
            list.add(Integer.parseInt(inputVal));
        }
        

        StringBuilder output = new StringBuilder("Output ArrayList\n");
        for (int i = 0; i < list.size(); i++) {
            output.append("x[").append(i).append("] = ").append(list.get(i)).append("\n");
        }
        
        
        int jumlah_total = 0; 
        
        for (int i = 0; i < list.size(); i++) { 
            jumlah_total+= list.get(i); 
        } 
        
        double average = (double) jumlah_total / list.size();

        int max = Collections.max(list);
        int min = Collections.min(list);

        output.append("\nNilai terbesar adalah ").append(max);
        output.append("\nNilai terkecil adalah ").append(min);
        output.append("\nNilai rata-rata adalah ").append(average); 

        JOptionPane.showMessageDialog(null, output.toString(), "Output ArrayList", JOptionPane.INFORMATION_MESSAGE);
    }
}