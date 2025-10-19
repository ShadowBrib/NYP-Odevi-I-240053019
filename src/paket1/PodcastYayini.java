package paket1;

import java.time.LocalDate;

/**
 * Bir podcast yayınını modelleyen sınıf.
 * Başlık, sunucu, süre, yayın tarihi ve dinlenme sayısı gibi bilgileri tutar.
 */
public class PodcastYayini {

    private String baslik;
    private String sunucu;
    private int sureSaniye;
    private LocalDate yayinTarihi;
    private int dinlenmeSayisi;

    public PodcastYayini(String baslik, String sunucu, int sureSaniye, LocalDate yayinTarihi) {
        this.baslik = baslik;
        this.sunucu = sunucu;
        this.sureSaniye = sureSaniye;
        this.yayinTarihi = yayinTarihi;
        this.dinlenmeSayisi = 0;
    }

    /**
     * Süreyi saniye cinsinden alıp "X dakika Y saniye" formatında döndürür.
     * @return Formatlanmış süre metni.
     */
    public String sureyiDakikaCinsindenGetir() {
        int dakika = sureSaniye / 60;
        int saniye = sureSaniye % 60;
        return dakika + " dakika " + saniye + " saniye";
    }

    /**
     * Podcast'in dinlenme sayısını bir artırır.
     */
    public void dinle() {
        this.dinlenmeSayisi++;
    }

    /**
     * Podcast'in tüm bilgilerini konsola düzenli bir formatta yazdırır.
     */
    public void yayinBilgileriniGoster() {
        System.out.println("--- Podcast Bilgileri ---");
        System.out.println("Başlık: " + this.baslik);
        System.out.println("Sunucu: " + this.sunucu);
        System.out.println("Süre: " + sureyiDakikaCinsindenGetir());
        System.out.println("Yayın Tarihi: " + this.yayinTarihi);
        System.out.println("Dinlenme Sayısı: " + this.dinlenmeSayisi);
        System.out.println("-------------------------");
    }
}