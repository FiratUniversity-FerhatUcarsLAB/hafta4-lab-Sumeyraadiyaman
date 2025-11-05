//AD SOYAD: SÜMEYRA ADIYAMAN
//ÖĞRENCİ NO: 250541012
//TARİH:05.11.2025
//GÖREV: Kullanıcıdan daireni yarıçapını alarak matematiksel hesplamalar yaptık

  

import java.util.Scanner;

public class GeometrikHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //yaricap bilgisi al
        System.out.print("\nDaire'nin Yarıçapını Giriniz :");
        double yaricap = input.nextDouble();

        //pi sayisi tanimla
        float pi = 3.14159f;


        //matematiksel işlemler
        System.out.println("\nSONUÇLAR: ");
        System.out.print("------------------");
        double alan = pi * yaricap * yaricap;
        System.out.printf("\nDaire Alan: %.2f cm^2", alan);

        double cevre = 2 * pi * yaricap;
        System.out.printf("\nDaire Çevresi: %.2f cm", cevre);

        double cap = 2 * yaricap;
        System.out.printf("\nDaire Çapı: %.2f cm " , cap);

        double kure_hacim = 4.0/3.0 * pi * Math.pow(yaricap, 3);
        System.out.printf("\nKüre Hacim: %.2f cm^3", kure_hacim);

        double kure_yuzey_alani = 4 * pi *  Math.pow(yaricap, 2);
        System.out.printf("\nKüre Yüzey Alanı: %.2f cm^2", kure_yuzey_alani);
    }
}

