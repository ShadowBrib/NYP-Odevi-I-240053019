package paket2;

import java.time.LocalDate;

/**
 * Bir sipariş için yapılan ödemeyi modelleyen sınıf.
 * İlişkili siparişi, ödeme yöntemini, tutarı ve onay durumunu tutar.
 */
public class Odeme {

    private String odemeld;
    private Siparis siparis; // Odeme bir Siparis nesnesine bağlıdır
    private String odemeYontemi;
    private double tutar;
    private LocalDate odemeTarihi;
    private boolean onaylandiMi;

    public Odeme(String odemeld, Siparis siparis, String odemeYontemi) {
        this.odemeld = odemeld;
        this.siparis = siparis;
        this.odemeYontemi = odemeYontemi;
        this.tutar = siparis.getToplamTutar(); // Tutar siparişten alınır [cite: 89]
        this.onaylandiMi = false;
        this.odemeTarihi = null;
    }

    /**
     * Ödemeyi onaylar, onay durumunu 'true' yapar ve tarih atar.
     */
    public void odemeOnayla() {
        this.onaylandiMi = true;
        this.odemeTarihi = LocalDate.now();
        System.out.println(this.odemeld + " ID'li ödeme onaylandı.");
        // Ödeme onaylanınca siparişin durumunu da güncellemek mantıklıdır.
        this.siparis.siparisDurumunuGuncelle("Hazırlanıyor");
    }

    /**
     * Ödeme bilgilerini konsola yazdırır.
     */
    public void odemeBilgileriniGoster() {
        System.out.println("--- Ödeme Bilgileri (" + this.odemeld + ") ---");
        System.out.println("Ödeme Yöntemi: " + this.odemeYontemi);
        System.out.printf("Tutar: %.2f TL\n", this.tutar);
        System.out.println("Durum: " + (this.onaylandiMi ? "Onaylandı" : "Onay Bekliyor"));
        if (this.onaylandiMi) {
            System.out.println("Ödeme Tarihi: " + this.odemeTarihi);
        }
        System.out.println("---------------------------------");
    }
}