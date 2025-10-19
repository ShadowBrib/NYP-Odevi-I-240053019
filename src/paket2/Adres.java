package paket2;

/**
 * Bşr adres bilgisini modelleyen sınıf.
 * Adres başlığı (Ev, İş), il, ilçe ve açık adres bilgilerini tutar.
 */
public class Adres {

    private String adresBasligi;
    private String il;
    private String ilce;
    private String acikAdres;

    public  Adres(String adresBasligi, String il, String ilce, String acikAdres){
        this.adresBasligi = adresBasligi;
        this.il =il;
        this.ilce =ilce;
        this.acikAdres = acikAdres;
    }

    /**
     * Tüm adres bilgilerini birleştirip tek bir metin olarak döndürür.
     * @return Formatlanmış tam adres metni.
     */
    public String adresBilgisiniDondur(){
        return  this.adresBasligi + ": " + this.acikAdres + " " + this.ilce + "/" + this.il;
    }

    public  String getAdresBasligi(){
        return  adresBasligi;
    }
}
