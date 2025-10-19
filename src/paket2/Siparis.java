package paket2;

import java.time.LocalDate;
import java.util.List;

/**
 * Müşterinin verdiği siparişi modelleyen sınıf[cite: 79].
 * Sipariş detaylarını, sipariş kalemlerini (ürün listesi) ve teslimat adresini tutar[cite: 80].
 */
public class Siparis {

    private String siparisId;
    private LocalDate siparisTarihi;
    private double toplamTutar;
    private String siparisDurumu;
    private List<SiparisKalemi> siparisKalemleri; // Composition: Siparis, SiparisKalemi listesi içerir [cite: 80]
    private Adres teslimatAdresi; // Composition: Siparis bir Adres nesnesi içerir [cite: 80]

    public Siparis(String siparisId, List<SiparisKalemi> siparisKalemleri, Adres teslimatAdresi) {
        this.siparisId = siparisId;
        this.siparisKalemleri = siparisKalemleri;
        this.teslimatAdresi = teslimatAdresi;
        this.siparisTarihi = LocalDate.now();
        this.siparisDurumu = "Onay Bekliyor"; // Varsayılan durum [cite: 80]

        // Toplam tutarı hesapla
        this.toplamTutar = 0;
        for (SiparisKalemi kalem : siparisKalemleri) {
            this.toplamTutar += kalem.kalemToplamTutariHesapla();
        }
    }

    /**
     * Siparişin durumunu günceller[cite: 81].
     * @param yeniDurum Yeni durum (Örn: "Kargoda").
     */
    public void siparisDurumunuGuncelle(String yeniDurum) {
        this.siparisDurumu = yeniDurum;
        System.out.println("Sipariş " + this.siparisId + " durumu güncellendi: " + yeniDurum);
    }

    /**
     * Siparişin özet bilgilerini konsola yazdırır[cite: 81].
     */
    public void siparisOzetiniGoster() {
        System.out.println("--- Sipariş Özeti (" + this.siparisId + ") ---");
        System.out.println("Tarih: " + this.siparisTarihi);
        System.out.println("Durum: " + this.siparisDurumu);
        System.out.println("Teslimat Adresi: " + this.teslimatAdresi.adresBilgisiniDondur());
        System.out.println("Sipariş Kalemleri:");
        for (SiparisKalemi kalem : siparisKalemleri) {
            System.out.printf("  - %s (%d adet x %.2f TL) = %.2f TL\n",
                    kalem.getUrun().getAd(),
                    kalem.getAdet(),
                    kalem.getBirimFiyatOAnki(),
                    kalem.kalemToplamTutariHesapla()
            );
        }
        System.out.printf("Toplam Tutar: %.2f TL\n", this.toplamTutar);
        System.out.println("---------------------------------");
    }

    public double getToplamTutar() {
        return toplamTutar;
    }

    public String getSiparisDurumu() {
        return siparisDurumu;
    }
}