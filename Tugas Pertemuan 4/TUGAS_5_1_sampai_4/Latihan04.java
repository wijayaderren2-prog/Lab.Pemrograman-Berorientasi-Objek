package TUGAS_5_1_sampai_4;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Latihan04 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> dataList = new ArrayList<>();

        // Input Data
        for (int i = 0; i < 3; i++) {
            dataList.add(new ArrayList<>());
            
            String nama = JOptionPane.showInputDialog("Masukkan Nama Lengkap (Data ke-" + (i + 1) + "):");
            String alamat = JOptionPane.showInputDialog("Masukkan Alamat (Data ke-" + (i + 1) + "):");
            String telp = JOptionPane.showInputDialog("Masukkan No Telp (Data ke-" + (i + 1) + "):");

            dataList.get(i).add(nama);
            dataList.get(i).add(alamat);
            dataList.get(i).add(telp);
        }

        // Sorting Ascending Berdasarkan Nama Lengkap (Indeks 0)
        Collections.sort(dataList, new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                return o1.get(0).compareToIgnoreCase(o2.get(0));
            }
        });

        // Output Data Terurut
        StringBuilder output = new StringBuilder("=== DATA SETELAH DI-SORTING (ASCENDING) ===\n\n");
        for (int i = 0; i < dataList.size(); i++) {
            output.append("Data ").append(i + 1).append(":\n");
            output.append("Nama    : ").append(dataList.get(i).get(0)).append("\n");
            output.append("Alamat  : ").append(dataList.get(i).get(1)).append("\n");
            output.append("No Telp : ").append(dataList.get(i).get(2)).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, output.toString());
        System.exit(0);
    }
}