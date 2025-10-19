package paket1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Bir proje yönetim aracındaki görevi modeller.
 * Görev başlığı, sorumlusu, önceliği, son teslim tarihi ve tamamlama durumu tutulur.
 */

public class ProjeGorevi {
    private String gorevBasligi;
    private String sorumluKisi;
    private String oncelik; //Örn: "Yüksek", "Orta", "Düşük"
    private LocalDate sonTeslimTarihi;
    private boolean tamamlandiMi;

    public ProjeGorevi(String gorevBasligi, String sorumluKisi, String oncelik, LocalDate sonTeslimTarihi) {
        this.gorevBasligi =gorevBasligi;
        this.sorumluKisi =sorumluKisi;
        this.oncelik = oncelik;
        this.sonTeslimTarihi = sonTeslimTarihi;
        this.tamamlandiMi = false;
    }

    /**
     * Görevin tamamladiMi durumunu 'true' olarak işaretler.
     */
    public void goreviTamamla(){
        this.tamamlandiMi = true;
        System.out.println("'" + this.gorevBasligi + "' görevi tamamlandı olarak işaretlendi.");
    }

    /**
     * Görevin sorumlusunu günceller.
     * @param yeniSorumlu Görevin yeni sorumlusu.
     */
    public void sorumluDegistir(String yeniSorumlu){
        this.sorumluKisi = yeniSorumlu;
        System.out.println("Görevin yeni sorumlusu: " + this.sorumluKisi);
    }

    /**
     * Son teslim tarihine kaç gün kaldığını hesaplar ve döndürür.
     * @return Kalan gün sayısı (eğer tarih geçmişse negatife döner).
     */
    public long kalanGunSayisiniHesapla(){
        LocalDate bugun =LocalDate.now();
        return  ChronoUnit.DAYS.between(bugun, this.sonTeslimTarihi);
    }
}