package paket2;

/**
 * Her bir siparişin içindeki ürün satırlarını temsil ederç
 * Hangi üründen kaç adet ve sipariş anındaki fiyatıyla alındığını tutar.
 */
public class SiparisKalemi {
    private Urun urun; // SiparisKalemi bir Urun nesnesi içerir
    private int adet;
    private double birimFiyatOAnki; // Sipariş anındaki ürün fiyatı

    public SiparisKalemi(Urun urun,int adet){
        this.urun = urun;
        this.adet = adet;
        this.birimFiyatOAnki = urun.getFiyat(); // Fiyatı o anki değerden kopyala
    }

    /**
     * Bu kalem (satır) için toplam tutarı hesaplar (adet * birimFiyatOAnki)[cite: 86].
     * @return Kalemin toplam tutarı.
     */
    public double kalemToplamTutariHesapla() {
        return this.adet * this.birimFiyatOAnki;
    }

    // Siparis sınıfının özeti için Getter'lar
    public Urun getUrun() { return urun; }
    public int getAdet() { return adet; }
    public double getBirimFiyatOAnki() { return birimFiyatOAnki; }
}
