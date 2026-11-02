package Tugas_BAB_4;

public class Latihan08 {
    public static void main(String[] args) {
        String[][] data = {
            {"Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210"},
            {"Isnan Mulia", "JL Manunggal, Bogor", "+62 819-3208-0875"},
            {"Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"}
        };

        System.out.println("Nama Lengkap\t\tAlamat\t\t\t\tNo Telp");
        System.out.println("==========================================================================");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1] + "\t" + data[i][2]);
        }
    }
}