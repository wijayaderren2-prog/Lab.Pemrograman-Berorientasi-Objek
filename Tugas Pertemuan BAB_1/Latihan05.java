package Tugas_BAB_1;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat/teks: ");
        String input = scanner.nextLine();
        
        System.out.println("Hasil: " + input.toUpperCase());
        scanner.close();
    }
}