# NYP-Odevi-I Projesi

**Enes Çalış** 
**240053019** 

## Ödev Açıklaması
Bu proje, Nesne Yönelimli Programlama dersi Ödev I kapsamında Java dili kullanılarak hazırlanmıştır. Proje, `paket1` altında 5 adet bağımsız modern konsept sınıfı ve `paket2` altında "Composition" ilişkisiyle tasarlanmış 8 adet E-Ticaret sistemi sınıfını içermektedir.

## Sınıf Açıklamaları

### paket1 Sınıfları 

* **PodcastYayini:** Tek bir podcast bölümünü modeller. Başlık, sunucu, süre, yayın tarihi ve dinlenme sayısı gibi bilgileri tutar.
* **DijitalSanatEseri:** Bir NFT'yi veya dijital sanat eserini temsil eder. Eserin adını, sanatçısını, yılını, tekniğini ve rastgele oluşturulmuş benzersiz bir kimliği yönetir.
* **AkilliTermostat:** Bir akıllı termostat cihazını simüle eder. Marka, mevcut sıcaklık, hedef sıcaklık ve çalışma modu ("Isıtma", "Soğutma" vb.) durumlarını yönetir.
* **RenkPaleti:** Bir tasarım paletini modeller. Paletin adını ve HEX kodlarından oluşan bir renk listesini yönetir (ekleme, çıkarma, gösterme).
* **ProjeGorevi:** Trello/Jira kartı gibi bir proje görevini temsil eder. Görev başlığı, sorumlusu, önceliği, son teslim tarihi ve tamamlanma durumunu takip eder.

### paket2 Sınıfları 

* **Adres:** Bir kullanıcıya ait adres (ev, iş vb.) bilgilerini tutar. `Kullanici` ve `Siparis` sınıfları tarafından kullanılır.
* **Kategori:** Ürünlerin ait olduğu kategoriyi (Elektronik, Giyim vb.) modeller. `Urun` sınıfı tarafından kullanılır.
* **Urun:** Satılacak bir ürünü temsil eder. Ad, fiyat, stok ve hangi `Kategori`ye ait olduğu bilgilerini içerir.
* **Kullanici:** Sisteme üye olan kullanıcıyı modeller. Temel kullanıcı bilgilerini ve bir `Adres` listesini (`List<Adres>`) tutar.
* **Sepet:** Bir `Kullanici`ya ait alışveriş sepetini temsil eder. İçerisinde `Urun` ve adet bilgilerini bir Map yapısında tutar.
* **SiparisKalemi:** Bir siparişin içindeki her bir ürün satırını temsil eder. Hangi `Urun`'den kaç adet alındığını ve sipariş anındaki birim fiyatını (`birimFiyatOAnki`) kaydeder.
* **Siparis:** Kullanıcının verdiği siparişin tamamını modeller. Siparişin durumunu, teslimat adresini (`Adres`) ve içindeki ürünleri (`List<SiparisKalemi>`) tutar.
* **Odeme:** Bir `Siparis` için yapılan ödeme işlemini temsil eder. Ödeme yöntemi, tutar ve onay durumu gibi bilgileri yönetir.