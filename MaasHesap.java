//AD SOYAD: SÜMEYRA ADIYAMAN
//ÖĞRENCİ NO: 250541012
//TARİH:05.11.2025
//Bu projede kullanıcıdan alınan bilgiler ile brüt maaş hesabı yaptık


import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıda veriler istenir

        System.out.print("Çalışan Bilgileri: ");
        String Calisan = input.nextLine();

        System.out.print("Brüt Maaşı Giriniz: ");
        float brut_maas = input.nextFloat();

        System.out.print("Mesai Saatini Giriniz: ");
        float mesai_saati = input.nextFloat();

        final double SGK_kesinti_orani = 0.14;
        final double gelir_vergisi_orani = 0.15;
        final double damga_vergisi_orani = 0.00759;
        final double mesai_ucreti_katsayisi = 1.5;

        // Hesaplamalr Yapılır

        double mesai_ucreti = (brut_maas/160) * mesai_saati * mesai_ucreti_katsayisi;
        System.out.printf("\nMesai Ücreti: %.2f " , mesai_ucreti );

        double toplam_gelir = brut_maas + mesai_ucreti;
        System.out.printf("\nToplam Gelir: %.2f " , toplam_gelir);

        //Kesintiler Hesaplanır

        double SGK_kesintisi = toplam_gelir * SGK_kesinti_orani;

        double gelir_vergisi = toplam_gelir * gelir_vergisi_orani;

        double damga_vergisi = toplam_gelir * damga_vergisi_orani;

        double toplam_kesinti = SGK_kesintisi + gelir_vergisi + damga_vergisi;
        System.out.printf("\nTOPLAM KESİNTİ: %.2f " , toplam_kesinti);

        double net_maas = toplam_gelir - toplam_kesinti;
        System.out.printf("\nNET MAAŞ: %.2f " , net_maas);

        double kesinti_orani = (toplam_kesinti/ toplam_gelir) * 100;
        System.out.printf("\nKESİNTİ: %.2f " , kesinti_orani);

        // Aylık Çalışma miktarı 20 gün,günde 8 saat olarak alınmıştır. 20 * 8 = 160 saat(aylık çalışma saati)

        double saatlik_net_kazanc = net_maas / 160;
        System.out.printf("\nSAATLİK NET MAAŞ: %.2f" , saatlik_net_kazanc);

        double gunluk_net_kazanc = net_maas / 20;
        System.out.printf("\nGÜNLÜK NET MAAŞ: %.2f " , gunluk_net_kazanc);


        //Ekrana Bastırma İşlemi Yapılır
        System.out.println("\n_________________________________________");
        System.out.print("             MAAŞ BODROSU                    ");
        System.out.print("\n___________________________________________");
        System.out.printf("\nÇalışan Bİlgileri: %s " ,Calisan );
        System.out.print("\nGELİRLER");
        System.out.printf("\nBrüt Maaş               :  %.2f    " ,brut_maas);
        System.out.printf("\nMesai Ücreti            :  %.2f    " ,mesai_ucreti);
        System.out.print("\n___________________________________________");
        System.out.printf("\nTOPLAM GELİR            :  %.2f    " ,toplam_gelir);
        System.out.print("\n___________________________________________");
        System.out.print("\nKESİNTİLER        ");
        System.out.printf("\nSGK Kesintisi    :  %.2f    " ,SGK_kesintisi);
        System.out.printf("\nGelir Vergisi    :  %.2f    " ,gelir_vergisi);
        System.out.printf("\nDamga Vergisi    :  %.2f    " ,damga_vergisi_orani);
        System.out.print("\n___________________________________________");
        System.out.printf("\nTOPLAM KESİNTİ          :  %.2f    " ,toplam_kesinti);
        System.out.printf("\nNET MAAŞ                :  %.2f    " ,net_maas);
        System.out.print("\n___________________________________________");

        input.close();

    }
}

