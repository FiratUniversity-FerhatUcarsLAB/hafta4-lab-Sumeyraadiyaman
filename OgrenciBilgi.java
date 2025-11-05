/*
 * Ad Soyad: SÜMEYRA ADIYAMAN
 * Ogrenci No:250541012
 * Tarih: 05.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) { 
        // değişkenler alınıyor
        Scanner input = new Scanner(System.in);


        System.out.print("Adınızı Giriniz: ");
        String ad = input.nextLine();

        System.out.print("Soyadınız Giriniz: ");
        String soyad = input.nextLine();

        System.out.print("Öğrenci Numaranız: ");
        int ogrenci_no = input.nextInt();

        System.out.print("Yaşınız Giriniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0,00-4,00): ");
        float gpa = input.nextFloat();

        //bilgiler ekrana bastırılıyor

        System.out.println("=====ÖĞRENCİ BİLGİ SİSTEMİ====");
        System.out.printf("AD-SOYAD : %s %s ", ad, soyad);
        System.out.printf("\nÖğrenci No : %d", ogrenci_no);
        System.out.printf("\nYaş : %d", yas);
        System.out.printf("\nGPA : %.2f", gpa);
    }
}





