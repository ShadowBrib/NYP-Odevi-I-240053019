package paket1;

import  java.util.ArrayList;
import java.util.List;

/**
 * Bir renk paletini modelleyen sınıf.
 * Paletin adını veren ve HEX kodlarından oluşan bir renk listesini tutar.
 */
public class RenkPaleti {

    private String paletAdi;
    private List<String> renkler; //HEX kodlarını tutan bir String listesi.

    public RenkPaleti(String hexkodu){
        this.renkler.add(hexkodu);
        System.out.println(hexkodu + " palete eklendi.");
    }

    /**
     * Paletten belirtilen renk HEX kodunu siler.
     * @param hexKodu Silinecek renk kodu.
     */
    public void  renkCikar(String hexKodu){
        boolean cikarildiMi = this.renkler.remove(hexKodu);
        if (cikarildiMi) {
            System.out.println(hexKodu + " paletten çıkarıldı.");
        } else {
            System.out.println(hexKodu + "palette bulunamadı.");
        }
    }

    /**
     * Paletin adını ve içerdiği tüm renk kodlarını listeler.
     */
    public void paletiGoster(){
        System.out.println("---Palet: " + this.paletAdi + " ---");
        if (renkler.isEmpty()){
            System.out.println("Palet boş.");
        } else {
            for (String renk : renkler) {
                System.out.println("- " + renk);
            }
        }
        System.out.println("--------------------------");
    }
}
