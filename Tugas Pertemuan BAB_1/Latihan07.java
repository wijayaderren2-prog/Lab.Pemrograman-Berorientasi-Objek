package Tugas_BAB_1;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = scanner.nextLine();

        String hasil = nama.replaceAll("[aiueoAIUEO]", "X");
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}