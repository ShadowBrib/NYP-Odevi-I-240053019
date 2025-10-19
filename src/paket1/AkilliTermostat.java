package paket1;

/**
 * Bir akıllı termostat cihazını modelleyen sınıf.
 * Marka, mevcut sıcaklık, hedef sıcaklık ve çalışma modu bilgilerini tutar.
 */
public class AkilliTermostat {
    private String marka;
    private double mevcutSicaklik;
    private double hedefSicaklik;
    private String mod; //Örn: "Isıtma", "Soğutma", "Kapalı"

    public AkilliTermostat(String marka, double mevcutSicaklik){
        this.marka = marka;
        this.mevcutSicaklik = mevcutSicaklik;
        this.hedefSicaklik = mevcutSicaklik;
        this.mod = "Kapalı";
    }
    /**
     * Hedef sıcaklığığ belirtilen miktar kadar artırır.
     * @param artisMiktari Artış miktarı (derece).
     */
    public void sicakligiArtir(double artisMiktari){
        this.hedefSicaklik += artisMiktari;
        System.out.println("Yeni hedef sıcaklık: " + this.hedefSicaklik + "°C");
    }
    /**
     * Termostatın çalışma modunu değiştirir[cite: 45].
     * @param yeniMod Yeni çalışma modu (Örn: "Isıtma", "Soğutma").
     */
    public void modDegistir(String yeniMod) {
        this.mod = yeniMod;
        System.out.println("Mod değiştirildi: " + this.mod);
    }
    /**
     * Termostatın mevcut durumunu konsola yazdırır.
     */
    public void durumGoster(){
        System.out.println("--- Termostat Durumu (" + this.marka + ")");
        System.out.println("Mod: " + this.mod);
        System.out.println("Mevcut Sıcaklık: " + this.mevcutSicaklik + "°C");
        System.out.println("Hedef Sıcaklık: " + this.hedefSicaklik + "°C");
        System.out.println("---------------------------------");
    }
}
