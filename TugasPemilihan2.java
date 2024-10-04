import java.util.Scanner;

public class TugasPemilihan2 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.print("masukkan bilangan 1 = ");
        bil1 = input22.nextInt();
        System.out.print("masukkan bilangan 2 = ");
        bil2 = input22.nextInt();
        System.out.print("masukkan bilangan 3 = ");
        bil3 = input22.nextInt();

        if (bil1 >= bil2) {
        } if (bil1 >= bil3) {
            System.out.println("bilangan 1 adalah bilangan terbesar");
        }

        else if (bil2 >= bil1) {
        } if (bil2 >= bil3) {
            System.ou
            t.println("bilangan 2 adalah bilangan terbesar");
        }
        else {
            System.out.println("bilangan 3 adalah bilangan terbesar");
        }
    }
}