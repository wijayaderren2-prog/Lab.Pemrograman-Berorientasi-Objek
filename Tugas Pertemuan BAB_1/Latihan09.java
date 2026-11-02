package Tugas_BAB_1;

import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Students myBio = new Students();

        System.out.print("Masukkan NPM: ");
        int npmInput = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Masukkan Nama Lengkap: ");
        String nameInput = scanner.nextLine();

        System.out.print("Masukkan Class Name: ");
        String classInput = scanner.nextLine();

        System.out.print("Masukkan Semester: ");
        int semInput = scanner.nextInt();

        System.out.print("Masukkan GPA: ");
        float gpaInput = scanner.nextFloat();

        System.out.println("\n--- Data Mahasiswa ---");
        System.out.println("NPM      : " + myBio.getNPM(npmInput));
        System.out.println("Fullname : " + myBio.getFullname(nameInput));
        System.out.println("Class    : " + myBio.getClassName(classInput));
        System.out.println("Semester : " + myBio.getSemester(semInput));
        System.out.println("GPA      : " + myBio.getGPA(gpaInput));

        scanner.close();
    }
}