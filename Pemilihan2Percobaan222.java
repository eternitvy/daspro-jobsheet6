import java.util.Scanner;  
  
public class Pemilihan2Percobaan222 {  
  
   public static void main(String[] args) {  
      Scanner input22 = new Scanner(System.in);  
  
      int pilihan_menu;  
      String member, jenisPembayaran;  
      int harga = 0, potonganQris = 1000;  
      double diskon = 0.0;  
      double total_bayar;  
  
      System.out.println("------------------------");  
      System.out.println("==== MENU KAFE JTI ====");  
      System.out.println("------------------------");  
      System.out.println("1. Ricebowl");  
      System.out.println("2. Ice Tea");  
      System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");  
      System.out.println("------------------------");  
  
      System.out.print("masukkan angka dari menu yang dipilih = ");  
      pilihan_menu = input22.nextInt();  
      input22.nextLine();  
  
      System.out.print("Apakah punya member (y/n) ? ");  
      member = input22.nextLine();  
      System.out.println("------------------------");

      if (member.equals("y")) {  
        diskon = 0.10;  
        System.out.println("Besar diskon = 10% ");  

     }   if (pilihan_menu == 1) {  
        harga = 14000;  
        System.out.println("Harga ricebowl = " + harga);  

     }  else if (pilihan_menu == 2) {  
        harga = 3000;  
        System.out.println("Harga ice tea = " + harga);  

     }  else if (pilihan_menu == 3) {  
        harga = 15000;  
        System.out.println("Harga Bunding = " + harga);  

     }  else {  
        System.out.println("Masukkan pilihan menu dengan benar");  
     }  
       
     total_bayar = harga - (harga * diskon);  
     System.out.println("Total bayar setelah diskon = " + total_bayar);
     
     if (member.equals("y")) {  
        if (pilihan_menu == 1) {  
           harga = 14000;  
           System.out.println("Harga ricebowl = " + harga);  
        } else if (pilihan_menu == 2) {  
           harga = 8000;  
           System.out.println("Harga ice tea = " + harga);  
        } else if (pilihan_menu == 3) {  
           harga = 15000;  
           System.out.println("Harga Bunding = " + harga);  
        } else {  
           System.out.println("Masukkan pilihan menu dengan benar");  
        }  
        System.out.println("Total bayar = " + harga);  
     }  
       
     System.out.println("Total bayar akhir = " + total_bayar);  
       
     System.out.println("*------------------------------------*");

            System.out.print("pilih jenis pembayaran (cash/QRIS) = ");
            jenisPembayaran = input22.nextLine();
            
            if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= potonganQris;
                System.out.println("potongan yang didapatkan adalah 1000");
            }
    }
}