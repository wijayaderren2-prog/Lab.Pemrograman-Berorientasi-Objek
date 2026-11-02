package Tugas_BAB_1;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Memasukkan Usia: ");
        String usia = scanner.next();
        System.out.print("Memasukkan Firstname: ");
        String firstName = scanner.next();
        System.out.print("Memasukkan Lastname: ");
        String lastName = scanner.next();
        System.out.print("Memasukkan NPM: ");
        String npm = scanner.next();

        String result = usia.concat(firstName).concat(lastName).concat(npm);
        System.out.println("Output: " + result);

        scanner.close();
    }
}