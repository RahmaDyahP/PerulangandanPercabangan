
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Rahma Dyah
 */
public class percabanganSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("==Balok==");
        System.out.println("1. Luas Permukaan \n2. Volume\n Pilih");
        int pilih = scan.nextInt();
        System.out.println("Masukkan panjang");
        int panjang = scan.nextInt();
        System.out.println("Masukkan lebar");
        int lebar = scan.nextInt();
        System.out.println("Masukkan tinggi");
        int tinggi = scan.nextInt();
        int hasil = 0;

        switch (pilih) {
            case 1:
                //proses luas permukaan 
                hasil = 2 * (panjang * lebar) + (lebar * tinggi) + (tinggi * panjang);
                break;
                
            case 2:
                //proses volume 
                hasil = panjang * tinggi * lebar;
                break;

        }

        System.out.println("Hasil: " + hasil);

    }

}

