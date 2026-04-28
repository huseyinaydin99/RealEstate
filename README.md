# 🏠 Real Estate - Modern Gayrimenkul Yönetim Platformu 🚀

Bu proje, modern bir gayrimenkul yönetim sisteminin ihtiyaç duyduğu tüm dinamikleri bünyesinde barındıran, **SOLID** prensipleriyle harmanlanmış, performans ve estetiği odağına alan profesyonel bir çalışmadır. Mimari kurgusundan tasarım detaylarına kadar her aşamasında titizlikle çalışılmış, hem son kullanıcıya hem de admin paneli yönetimine hitap eden uçtan uca bir çözümdür. ✨

## 🎯 Projenin Amacı ve Çözüm Getirdiği Sorunlar
Geleneksel emlak yönetim sistemlerinin karmaşıklığını ve hantallığını ortadan kaldırmak amacıyla yola çıktım. Bu platform;
- **Hızlı ve Akıcı Deneyim:** Kullanıcıların ilanlar arasında kaybolmadan, aradıkları bilgiye en şık şekilde ulaşmalarını sağlar.
- **Yönetim Kolaylığı:** Admin paneli sayesinde tüm içeriklerin (ilanlar, kategoriler, mesajlar) merkezi ve estetik bir arayüzden yönetilmesini mümkün kılar.
- **Güvenli Altyapı:** Modern yetkilendirme ve kimlik doğrulama mekanizmalarıyla verilerin güvenliğini en üst düzeyde tutar.

### 📸Tanıtım Görselleri;

![1](ekran_goruntusu/1.png)

![2](ekran_goruntusu/2.png)

![3](ekran_goruntusu/3.png)

![4](ekran_goruntusu/4.png)

![5](ekran_goruntusu/5.png)

![6](ekran_goruntusu/6.png)

![7](ekran_goruntusu/7.png)

![8](ekran_goruntusu/8.png)

![9](ekran_goruntusu/9.png)

![10](ekran_goruntusu/10.png)

![11](ekran_goruntusu/11.png)

![12](ekran_goruntusu/12.png)

![13](ekran_goruntusu/13.png)

![14](ekran_goruntusu/14.png)

![15](ekran_goruntusu/15.png)

![16](ekran_goruntusu/16.png)

![17](ekran_goruntusu/17.png)

![18](ekran_goruntusu/18.png)

![19](ekran_goruntusu/19.png)

![20](ekran_goruntusu/20.png)

## 🏗️ Mimari Yapı ve Yazılım Prensipleri
Proje geliştirilirken sadece "çalışan" değil, "kaliteli çalışan" bir kod altyapısı hedeflenmiştir.

- **SOLID Prensipleri:** Her sınıfın tek bir sorumluluğu olması (**SRP**), genişlemeye açık ancak değişime kapalı olması (**OCP**) ve arayüzlerin doğru ayrıştırılması gibi prensipler mimarinin temelini oluşturur.
- **N-Tier Architecture (Çok Katmanlı Mimari):** 
  - **Controller Katmanı:** İsteklerin karşılandığı ve yönlendirildiği giriş kapısı.
  - **Service Katmanı:** İş mantığının (business logic) dış dünyadan izole edildiği, saf mantık katmanı.
  - **Data Access (Repository) Katmanı:** Veritabanı işlemlerinin soyutlandığı alan.
  - **DTO (Data Transfer Object) Deseni:** Verilerin katmanlar arasında güvenli ve sadece ihtiyaç duyulduğu kadar taşınması.

## 🛠️ Kullanılan Teknolojiler
Bu projede modern ekosistemin en güçlü oyuncularını bir araya getirdim:

- **Framework:** `Spring Boot` (Hızlı, güvenilir ve konfigürasyon dostu yapısı için).
- **ORM / Data Mapping:** `MyBatis` (SQL sorguları üzerinde tam kontrol sahibi olmak, nesnelere gereksiz row mapping yapmadan kodun şişmesini önlemek ve performansı maksimize etmek için tercih edildi).
- **Security:** `Spring Security & JWT` (Hem session tabanlı hem de token tabanlı güvenliğin kusursuz entegrasyonu).
- **View Engine:** `Thymeleaf` (Sunucu taraflı render işlemlerinde HTML yapısını bozmadan dinamik içerik üretmek için).
- **Database:** `H2 Database` & `MySQL` (Geliştirme aşamasında hız, canlı ortamda kararlılık).
- **Frontend:** `Bootstrap 4`, `jQuery`, `Owl Carousel`, `FontAwesome` (Görsel derinlik ve responsive uyumluluk için).
- **Build Tool:** `Maven` (Bağımlılık yönetimi ve proje yaşam döngüsü kontrolü).

## ✨ Öne Çıkan Özellikler

### 💎 "Sexy" ve Modern Arayüz
Tasarım, kullanıcıyı ilk bakışta etkileyecek şekilde dizayn edilmiştir.
- **İlan Detay Sayfası:** Geniş slider alanları, ikonlarla zenginleştirilmiş bilgi kartları ve kullanıcı dostu yerleşim.
- **Admin Paneli:** Karanlık/Aydınlık mod uyumlu, modern gölge efektleri ve tertemiz bir dashboard.
- **Giriş ve Kayıt Sayfaları:** Emlak temalı profesyonel arka planlar ve zarif form tasarımları.

### 📧 Gelişmiş Mesajlaşma Sistemi
Sistem içi iletişim kanalları (Gelen Kutusu, Giden Kutusu) ve yeni mesaj oluşturma özellikleri, adminlerin kullanıcılarla olan bağını koparmamasını sağlar.

### 📊 İstatistik ve Analiz
Admin panelindeki istatistik modülleri sayesinde platformun genel durumu (ilan sayıları, kullanıcı hareketleri vb.) grafiksel ve sayısal olarak takip edilebilir.

## ⚙️ Kurulum ve Çalıştırma
Projeyi kendi ortamınızda ayağa kaldırmak oldukça basittir:

1. Projeyi klonlayın: `git clone https://github.com/huseyinaydin99/RealEstate.git`
2. `application.properties` dosyasındaki veritabanı ayarlarını kontrol edin.
3. Maven bağımlılıklarını yükleyin: `mvn clean install`
4. Uygulamayı başlatın: `mvn spring-boot:run`
5. Tarayıcınızdan `http://localhost:8080` adresine gidin.

## 💡 Neden Bu Yapıyı Tercih Ettim?
Veritabanı erişiminde **MyBatis** kullanarak, otomatik üretilen hantal sorgular yerine, veri tabanı seviyesinde optimize edilmiş **SQL**'ler yazmayı tercih ettim. Bu, özellikle büyük veri setlerinde projenin nefes almasını sağlıyor. **Spring Security** ile birleşen mimari, kurumsal seviyede bir koruma kalkanı sunuyor.

---
*Bu proje, bir gayrimenkul platformundan çok daha fazlası; bir mühendislik vizyonunun ürünüdür.* 🏠✨

> 💻 Tüm sistem; yoğun backend mimari tasarım, güvenlik akışları ve rol tabanlı yönlendirme kurgusu ile bol kahve ☕ ve uykusuz geceler 🌙 eşliğinde, sürdürülebilir ve temiz mimari hedeflenerek Hüseyin AYDIN tarafından geliştirilmiştir, geliştirilmektedir... ⚡ *
