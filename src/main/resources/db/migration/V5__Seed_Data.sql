INSERT INTO AppRole (RoleName) VALUES ('Admin');
INSERT INTO AppRole (RoleName) VALUES ('Manager');
INSERT INTO AppRole (RoleName) VALUES ('Member');
INSERT INTO AppRole (RoleName) VALUES ('Employee');

INSERT INTO AppUser (Name, UserName, Password, UserRole, Email, PhoneNumber, UserImageUrl) 
VALUES ('Hüseyin Aydın', 'huseyinaydin', '123456', 1, 'huseyin@gmail.com', '05555555555', '/AdminPanel/img/user.jpg');
INSERT INTO AppUser (Name, UserName, Password, UserRole, Email, PhoneNumber, UserImageUrl) 
VALUES ('Ali Veli', 'aliveli', '123456', 4, 'ali@gmail.com', '05555555556', '/AdminPanel/img/user.jpg');

INSERT INTO Category (CategoryName, CategoryStatus) VALUES ('Konut', TRUE);
INSERT INTO Category (CategoryName, CategoryStatus) VALUES ('İşyeri', TRUE);
INSERT INTO Category (CategoryName, CategoryStatus) VALUES ('Arsa', TRUE);
INSERT INTO Category (CategoryName, CategoryStatus) VALUES ('Devre Mülk', TRUE);

INSERT INTO Product (Title, Price, City, District, CoverImage, Address, Description, Type, DealOfTheDay, ProductStatus, ProductCategory, AppUserId, SlugUrl) 
VALUES ('Lüks Villa - Deniz Manzaralı', 5500000.00, 'İstanbul', 'Beşiktaş', '/RealEstatePanel/images/1.jpg', 'Bebek Mah. No:1', 'Harika deniz manzaralı lüks villa.', 'Satılık', TRUE, TRUE, 1, 1, 'luks-villa-deniz-manzarali');
INSERT INTO Product (Title, Price, City, District, CoverImage, Address, Description, Type, DealOfTheDay, ProductStatus, ProductCategory, AppUserId, SlugUrl) 
VALUES ('Modern Daire - Şehir Merkezi', 2500000.00, 'Ankara', 'Çankaya', '/RealEstatePanel/images/2.jpg', 'Bahçelievler Mah. No:15', 'Şehrin kalbinde modern yaşam.', 'Kiralık', FALSE, TRUE, 1, 1, 'modern-daire-sehir-merkezi');
INSERT INTO Product (Title, Price, City, District, CoverImage, Address, Description, Type, DealOfTheDay, ProductStatus, ProductCategory, AppUserId, SlugUrl) 
VALUES ('Geniş Bahçeli Müstakil Ev', 3800000.00, 'İzmir', 'Çeşme', '/RealEstatePanel/images/3.jpg', 'Alaçatı Mah. No:5', 'Doğa ile iç içe huzurlu bir yaşam.', 'Satılık', TRUE, TRUE, 1, 2, 'genis-bahceli-mustakil-ev');

INSERT INTO ProductDetails (ProductSize, BedroomCount, BathCount, RoomCount, GarageSize, BuildYear, Price, Location, VideoUrl, ProductID) 
VALUES (250, 4, 2, 5, 2, '2020', 5500000.00, '41.0422, 29.0433', 'https://www.youtube.com/embed/dQw4w9WgXcQ', 1);
INSERT INTO ProductDetails (ProductSize, BedroomCount, BathCount, RoomCount, GarageSize, BuildYear, Price, Location, VideoUrl, ProductID) 
VALUES (120, 2, 1, 3, 1, '2022', 2500000.00, '39.9334, 32.8597', 'https://www.youtube.com/embed/dQw4w9WgXcQ', 2);
INSERT INTO ProductDetails (ProductSize, BedroomCount, BathCount, RoomCount, GarageSize, BuildYear, Price, Location, VideoUrl, ProductID) 
VALUES (180, 3, 2, 4, 1, '2018', 3800000.00, '38.3229, 26.3031', 'https://www.youtube.com/embed/dQw4w9WgXcQ', 3);

INSERT INTO ProductImage (ImageUrl, ProductId) VALUES ('/RealEstatePanel/images/4.jpg', 1);
INSERT INTO ProductImage (ImageUrl, ProductId) VALUES ('/RealEstatePanel/images/5.jpeg', 1);
INSERT INTO ProductImage (ImageUrl, ProductId) VALUES ('/RealEstatePanel/images/6.jpg', 2);

INSERT INTO PopularLocation (CityName, ImageUrl) VALUES ('İstanbul', '/RealEstatePanel/images/1.jpg');
INSERT INTO PopularLocation (CityName, ImageUrl) VALUES ('Ankara', '/RealEstatePanel/images/2.jpg');
INSERT INTO PopularLocation (CityName, ImageUrl) VALUES ('İzmir', '/RealEstatePanel/images/3.jpg');

INSERT INTO Service (ServiceName, ServiceStatus) VALUES ('Güvenlik', TRUE);
INSERT INTO Service (ServiceName, ServiceStatus) VALUES ('Otopark', TRUE);
INSERT INTO Service (ServiceName, ServiceStatus) VALUES ('Yüzme Havuzu', TRUE);

INSERT INTO Testimonial (NameSurname, Title, Comment, Status) VALUES ('Ahmet Yılmaz', 'Yatırımcı', 'Gerçekten çok profesyonel bir ekip.', TRUE);
INSERT INTO Testimonial (NameSurname, Title, Comment, Status) VALUES ('Ayşe Demir', 'Ev Hanımı', 'Hayalimizdeki evi bulmamıza yardımcı oldular.', TRUE);

INSERT INTO WhoWeAreDetail (Title, SubTitle, Description1, Description2) 
VALUES ('Biz Kimiz?', 'Emlak Sektöründe 20 Yıllık Tecrübe', 'Müşterilerimize en iyi hizmeti sunmak için buradayız.', 'Güven ve şeffaflık ilkemizdir.');

INSERT INTO BottomGrid (Icon, Title, Description) VALUES ('fa fa-home', 'Geniş Portföy', 'Binlerce ilan arasından size en uygununu bulun.');
INSERT INTO BottomGrid (Icon, Title, Description) VALUES ('fa fa-handshake-o', 'Güvenli Hizmet', 'Alım-satım süreçlerinizde yanınızdayız.');

INSERT INTO ToDoList (Description, ToDoListStatus) VALUES ('Emlakçı görüşmesi ayarla', FALSE);
INSERT INTO ToDoList (Description, ToDoListStatus) VALUES ('Yeni ilanları kontrol et', TRUE);
