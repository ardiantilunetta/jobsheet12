import java.util.Scanner;

public class Kubus18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi : ");
        int sisi = sc.nextInt();
        System.out.println("Volume kubus = "+volume(sisi));
    }

    public static int volume(int s) {
        int volume = s*s*s;
        return volume;
    }
}
