package Tugas_BAB_1;

import java.util.Scanner;

public class Latihan03 {
    // Class Variables
    static double r, t, a, b, c, d, d1, d2;

    public static double luasKerucut(double r, double s) {
        return Math.PI * r * (r + s);
    }

    public static double volumeTabung(double r, double t) {
        return Math.PI * r * r * t;
    }

    public static double luasLayangLayang(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    public static double volumePrismaSegitiga(double alas, double tinggiAlas, double tinggiPrisma) {
        return (0.5 * alas * tinggiAlas) * tinggiPrisma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan digit terakhir NPM Anda: ");
        int npmDigit = scanner.nextInt();

        if (npmDigit % 2 != 0) { // NPM Ganjil (Kerucut & Tabung)
            System.out.println("\n--- Perhitungan NPM Ganjil ---");
            System.out.print("Masukkan jari-jari alas: ");
            r = scanner.nextDouble();
            System.out.print("Masukkan tinggi: ");
            t = scanner.nextDouble();
            double s = Math.sqrt((r * r) + (t * t)); // garis pelukis

            System.out.println("Luas Kerucut: " + luasKerucut(r, s));
            System.out.println("Volume Tabung: " + volumeTabung(r, t));
        } else { // NPM Genap (Layang-layang & Prisma Segitiga)
            System.out.println("\n--- Perhitungan NPM Genap ---");
            System.out.print("Masukkan Diagonal 1: ");
            d1 = scanner.nextDouble();
            System.out.print("Masukkan Diagonal 2: ");
            d2 = scanner.nextDouble();
            System.out.println("Luas Layang-layang: " + luasLayangLayang(d1, d2));

            System.out.print("Masukkan Alas Segitiga Prisma: ");
            a = scanner.nextDouble();
            System.out.print("Masukkan Tinggi Segitiga Prisma: ");
            b = scanner.nextDouble();
            System.out.print("Masukkan Tinggi Prisma: ");
            t = scanner.nextDouble();
            System.out.println("Volume Prisma Segitiga: " + volumePrismaSegitiga(a, b, t));
        }
        scanner.close();
    }
}