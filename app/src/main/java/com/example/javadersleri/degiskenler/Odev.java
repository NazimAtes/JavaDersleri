package com.example.javadersleri.degiskenler;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;


public class Odev {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) {
        String ilce="Beşiktaş";
        String kita="Avrupa";
        int posta_kodu=47000;
        String faksNumarası="0 482 318 24 3x";
        String instagramAdresi = "https://www.instagram.com/nazm.ates/";
        String calismaAlanin="Sosyal Hizmetler";
        int urun_adedi=100;
        String musteriSoyadi="ATEŞ";
        double odemeTutari=999.99;
        String dogum_tarihi="09.04.1988";
        float borc=10000.00f;
        String medeniHal="Bekar";
        String video_yorumu="Happy birthday to you";
        LocalTime odeme_saati= LocalTime.of(14,15); // benim istediğim zamanı yazar
        Date saat1= new Date(); // şimdiki zamanı yazar.
        double odeme_miktari=22.500;
        int satilan_miktar=100;
        String telefonModeli="Samsung A70";
        String dergi_adi="Kafa";
        String basimTarihi= "01.09.2014";
        float zam_miktari=5000.00f;
        int daire_sayisi=12;
        double enlem=36.000;
        double boylam=45.000;
        String yemek_adi="Kaburga dolması";
        int urun_fiyati=100;
        String sirket="Kızıltepe sosyal hizmet merkezi müdürlüğü";
        String video_adi="Ben Bertolt Brecht- Genco Erkal";
        Duration videoSuresi = Duration.ofMinutes(5).plusSeconds(30); // bunu da eğitimde görmedik.
        double mekan_puani= 7.2;
        String dosyaAdi= "Hikmet Kardeşler";
        String resimFormati="JPEG";
        String renk="Kırmızı";
        String renk_kodu="#ff0000";
        String bilgisayarModeli="Dell-Inspiron 15 3525";


        System.out.println("İlçe             :"+ilce);
        System.out.println("Kıta             :"+kita);
        System.out.println("Posta Kodu       :"+posta_kodu);
        System.out.println("Faks Numarası    :"+faksNumarası);
        System.out.println("İnstagram Adresi :"+instagramAdresi);
        System.out.println("Çalışma Alanı    :"+calismaAlanin);
        System.out.println("Ürün Adedi       :"+urun_adedi);
        System.out.println("Müşteri Soyadı   :"+musteriSoyadi);
        System.out.println("Ödeme Tutarı     :"+odemeTutari+"₺");
        System.out.println("Doğum Tarihi     :"+dogum_tarihi);
        System.out.println("Borç             :"+borc+"₺");
        System.out.println("Medeni Hali      :"+medeniHal);
        System.out.println("Video Yorumu     :"+video_yorumu);
        System.out.println("Ödeme Saati      :"+odeme_saati);
        System.out.println("Saat             :"+saat1);
        System.out.println("Ödeme Miktarı    :"+odeme_miktari);
        System.out.println("Satılan Miktar   :"+satilan_miktar+ "Adet");
        System.out.println("Telefon Modeli   :"+telefonModeli);
        System.out.println("Dergi Adı        :"+dergi_adi);
        System.out.println("Basım Tarihi     :"+basimTarihi);
        System.out.println("Zam Miktarı      :"+zam_miktari);
        System.out.println("Daire Sayısı     :"+daire_sayisi);
        System.out.println("Enlem            :"+enlem);
        System.out.println("Boylam           :"+boylam);
        System.out.println("Yemek Adı        :"+yemek_adi);
        System.out.println("Ürün Fiyatı      :"+urun_fiyati);
        System.out.println("Şirket           :"+sirket);
        System.out.println("Video Adı        :"+video_adi);
        System.out.println("Video Süresi     :"+videoSuresi);
        System.out.println("Mekan Puanı      :"+mekan_puani);
        System.out.println("Dosya Adı        :"+dosyaAdi);
        System.out.println("Resim Formatı    :"+resimFormati);
        System.out.println("Renk             :"+renk);
        System.out.println("Renk Kodu        :"+renk_kodu);
        System.out.println("Bilgisayar Modeli:"+bilgisayarModeli);

        //ÇIKTILAR;
        /*
        İlçe             :Beşiktaş
        Kıta             :Avrupa
        Posta Kodu       :47000
        Faks Numarası    :0 482 318 24 3x
        İnstagram Adresi :https://www.instagram.com/nazm.ates/
        Çalışma Alanı    :Sosyal Hizmetler
        Ürün Adedi       :100
        Müşteri Soyadı   :ATEŞ
        Ödeme Tutarı     :999.99₺
        Doğum Tarihi     :09.04.1988
        Borç             :10000.0 ₺
        Medeni Hali      :Bekar
        Video Yorumu     :Happy birthday to you
        Ödeme Saati      :14:15
        Saat             :Tue Sep 19 21:39:25 TRT 2023
        Ödeme Miktarı    :22.5
        Satılan Miktar   :100 Adet
        Telefon Modeli   :Samsung A70
        Dergi Adı        :Kafa
        Basım Tarihi     :01.09.2014
        Zam Miktarı      :5000.0
        Daire Sayısı     :12
        Enlem            :36.0
        Boylam           :45.0
        Yemek Adı        :Kaburga dolması
        Ürün Fiyatı      :100
        Şirket           :Kızıltepe sosyal hizmet merkezi müdürlüğü
        Video Adı        :Ben Bertolt Brecht- Genco Erkal
        Video Süresi     :PT5M30S
        Mekan Puanı      :7.2
        Dosya Adı        :Hikmet Kardeşler
        Resim Formatı    :JPEG
        Renk             :Kırmızı
        Renk Kodu        :#ff0000
        Bilgisayar Modeli:Dell-Inspiron 15 3525
         */












    }
}
