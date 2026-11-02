package Tugas_BAB_4;

public class Latihan02 {
    public static void main(String[] args) {
        int[] nomor = new int[5];

        // isi nilai array menggunakan looping
        for (int i = 0; i < nomor.length; i++) {
            nomor[i] = (i + 1) * 10;
        }

        // cetak nilai array
        System.out.println("= Menggunakan Looping =");
        
        for (int i = 0; i < nomor.length; i++) {
            System.out.println("x[" + i + "] = " + nomor[i]);
        }
    }
}