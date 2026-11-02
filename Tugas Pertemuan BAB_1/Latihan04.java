package Tugas_BAB_1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah produk yang dibeli : ");
        int qty = input.nextInt();

        int hargaSatuan = 6300;
        int totalAwal = qty * hargaSatuan;
        
        // Diskon 5% untuk setiap kelipatan 3
        int kelipatan = qty / 3;
        double persenDiskon = kelipatan * 5;
        double diskon = totalAwal * (persenDiskon / 100);
        double subTotal = totalAwal - diskon;

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println("\nTOKO SERBAGUNA IBIK");
        System.out.println(now.format(formatter));
        System.out.println("===============================");
        System.out.printf("%-12s %-5s %-10s %-10s\n", "ITEM", "QTY", "HARGA", "TOTAL");
        System.out.println("===============================");
        System.out.printf("%-12s %-5d Rp%-8d Rp%-10d\n", "ROTI ENAK", qty, hargaSatuan, totalAwal);
        System.out.println("Diskon: " + (int)persenDiskon + "%");
        System.out.printf("Sub Total: Rp %.2f\n", subTotal);
        
        input.close();
    }
}