package paket2;

/**
 * Satışta sunulan bir ürünü modelleyen sınıf.
 * Ürünün ID, ad, açıklama, fiyat, stok ve kategori bilgilerini tutar.
 */
public class Urun {

    private String urunId;
    private String ad;
    private String aciklama;
    private double fiyat;
    private int stokAdedi;
    private Kategori kategori; // Composition: Urun bir Kategori nesnesi içerir

    public Urun(String urunId, String ad, double fiyat, int stokAdedi, Kategori kategori) {
        this.urunId = urunId;
        this.ad = ad;
        this.aciklama = "";
        this.fiyat = fiyat;
        this.stokAdedi = stokAdedi;
        this.kategori = kategori;
    }

    /**
     * Ürünün stok adedini günceller.
     * @param miktar Yeni stok miktarı.
     */
    public void stokGuncelle(int miktar){
        this.stokAdedi = miktar;
        System.out.println(this.ad + " için yeni stok: " + this.stokAdedi);
    }

    /**
     * Ürünün fiyatını günceller.
     * @param yeniFiyat Yeni fiyat.
     */
    public void fiyatGuncelle(double yeniFiyat){
        this.fiyat = yeniFiyat;
        System.out.println(this.ad + " için yeni fiyat: " + this.fiyat);
    }
    //Diğer sınıfların erişimi için Getter'lar.
    public String getAd() { return ad; }
    public double getFiyat() { return fiyat; }
    public Kategori getKategori() { return kategori; }
}
