package paket2;

import java.util.ArrayList;
import java.util.List;

/**
 * E-ticaret sistemi kullanıcısının modelleyen sınıf.
 * Kullanıcısı bilgileri ve adres listesini tutar.
 */
public class Kullanici {
    private String kullaniciId;
    private String kullaniciAdi;
    private String sifre;
    private String email;
    private List<Adres> adresler; // Composition: Kullanici bir Adres listesi içerir

    public Kullanici(String kullaniciId, String kullaniciAdi, String sifre, String email) {
        this.kullaniciId = kullaniciId;
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
        this.email = email;
        this.adresler = new ArrayList<>(); // Liste başlatır
    }

    /**
     * Kullanıcının adres listesine yeni bir adres ekler.
     * @param yeniAdres Eklenecek Adres nesnesi.
     */
    public void adresEkle(Adres yeniAdres) {
        this.adresler.add(yeniAdres);
        System.out.println("'" + yeniAdres.getAdresBasligi() + "' başlıklı adres eklendi.");
    }

    /**
     * Kullanıcının adres listesinden bir adresi siler[cite: 65].
     * @param adres Silinecek Adres nesnesi.
     */
    public void adresSil(Adres adres){
        this.adresler.remove(adres);
        System.out.println("'" + adres.getAdresBasligi() + "' başlıklı adres silindi");
    }

    /**
     * Kullanıcının bilgilerini ve tüm adreslerini konsola yazdırır.
     */
    public void bilgileriGoster(){
        System.out.println("---Kullanıcı Bilgileri---");
        System.out.println("Kullanıcı Adı: " + this.kullaniciAdi);
        System.out.println("Email: " + this.email);
        System.out.println("Adresler:");
        if (adresler.isEmpty()){
            System.out.println(" (Kayıtlı adres yok) ");
        } else {
            for (Adres adres : adresler) {
                System.out.println(" - " + adres.adresBilgisiniDondur());
            }
        }
        System.out.println("---------------------------");
    }
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }
}
