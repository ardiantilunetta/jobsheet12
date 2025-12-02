import java.util.Scanner;

public class NilaiMahasiswa18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int n = sc.nextInt();
        int[] nilai = new int[n];
        isianArray(n, nilai);
        tampilArray(nilai);
    }

    public static void isianArray (int jumlah, int[] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < jumlah ; i++) {
            System.out.print("Masukkan nilai mahasiswa "+(i+1)+" : ");
            nilai[i] = sc.nextInt();
        }
    }

    public static void tampilArray (int[] nilai) {
        System.out.print("Nilai mahasiswa : ");
        for (int i = 0 ; i < nilai.length ; i++) {
            System.out.print(nilai[i]+", ");
        }
    }
}