package paket1;

import java.util.UUID;

/**
 * Bir dijital sanat eserini (NFT gibi) modelleyen sınıf[cite: 36].
 * Eserin adını, sanatçısını, yılını, tekniğini ve benzersiz bir kimliğini tutar[cite: 37].
 */
public class DijitalSanatEseri {
    private String eserAdi;
    private String sanatci;
    private int yapimYili;
    private String teknik;
    private String benzersizId;

    public DijitalSanatEseri(String eserAdi, String sanatci, int olusturmaYili, String teknik){
        this.eserAdi = eserAdi;
        this.sanatci = sanatci;
        this.yapimYili = yapimYili;
        this.teknik = teknik;
        this.idYenile(); //Başlangıçta bir ID ata
    }

    /**
     * Sanat eserinin künye bilgilerini konsola yazdırır.
     */
    public void eserKunyesiniGoster(){
        System.out.println("---Eser Künyesi---");
        System.out.println("Eser Adı" + this.eserAdi);
        System.out.println("Snataçı " + this.sanatci);
        System.out.println("Yapım Yılı " + this.yapimYili);
        System.out.println("Teknik: " + this.teknik);
        System.out.println("ID " + this.benzersizId);
        System.out.println("----------------------");
    }
    /**
     * Eser için yeni bir benzersiz ID (UUID) oluşturur ve atar.
     */
    public final void idYenile(){
        this.benzersizId = UUID.randomUUID().toString();
    }
}
