package paket2;

/**
 * Ürün kategorisini modelleyen sınıf.
 * Kategori ID'si ve adını tutar.
 */
public class Kategori {

    private String kategoriId;
    private String ad;

    public Kategori(String kategoriId, String ad) {
        this.kategoriId = kategoriId;
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }
}
