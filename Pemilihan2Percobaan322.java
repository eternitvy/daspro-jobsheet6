import java.util.Scanner;

public class Pemilihan2Percobaan322 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("masukkan kategori : ");
        kategori = input22.nextLine();
        System.out.print("masukkan besarnya penghasilan : ");
        penghasilan = input22.nextInt();

    if (kategori.equals("pekerja")) {
        if (penghasilan <= 2000000)
            pajak = 0.1;
        else if (penghasilan <= 3000000)
            pajak = 0.15;
        else
            pajak = 0.2;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Penghasil bersih : " + gajiBersih);
    
    } else if (kategori.equals("pebisnis")) {
        if (penghasilan <= 2500000)
            pajak = 0.15;
        else if (penghasilan <= 3500000)
            pajak = 0.2;
        else
            pajak = 0.25;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("penghasil bersih : " + gajiBersih);

    } else
        System.err.println("masukkan kategori salah ");
    }
}