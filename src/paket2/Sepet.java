package paket2;

import java.util.HashMap;
import java.util.Map;

/**
 * Bir kullanıcısnın sepetini modelleyen sınıf.
 * Hangi kullanıcıya ait olduğunu, sepetteki ürünleri ve adetlerini tutar.
 */
public class Sepet {
    private Kullanici kullanici; //Sepet bir Kullanici nesnesine aittir
    // Ödevde belirtildiği gibi bir Map yapısı kullanıyoruz: Urun -> Adet
    private Map<Urun, Integer> urunler;

    public Sepet(Kullanici kullanici) {
        this.kullanici = kullanici;
        this.urunler = new HashMap<>();
    }
    /**
     * Sepete belirtilen adette ürün ekler.
     * Eğer ürün zaten varsa, adedini günceller.
     *
     * @param urun Eklenecek Urun nesnesi.
     * @param adet Eklenecek adet.
     */
    public void sepetEkle(Urun urun, int adet){
        this.urunler.merge(urun, adet, Integer::sum);
        System.out.println(adet + " adet " + urun.getAd() + " sepete eklendi.");
    }

    /**
     * Sepetten bir ürünü tamamen çıkarır.
     *
     * @param urun Çıkarılacak Urun nesnesi.
     */
    public void sepettenCikar(Urun urun){
        if (this.urunler.remove(urun) != null) {
            System.out.println(urun.getAd() + " sepetten çıkarıldı.");
        }else {
            System.out.println(urun.getAd() + " sepette bulunamadı.");
        }
    }

    /**
     * Sepetteki tüm ürünlerin toplam tutarını hesaplar.
     *
     * @return Sepetin toplam tutarı.
     */
    public  double toplamTutarHesapla() {
        double toplamtutar = 0;
        for (Map.Entry<Urun, Integer> entry : urunler.entrySet()) {
            Urun urun = entry.getKey();
            Integer adet = entry.getValue();
            toplamtutar += (urun.getFiyat() * adet);
        }
        return toplamtutar;
    }
}
