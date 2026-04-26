CREATE TABLE ProductDetails (
    ProductDetailID INT AUTO_INCREMENT PRIMARY KEY,
    ProductSize INT,
    BedroomCount INT,
    BathCount INT,
    RoomCount INT,
    GarageSize INT,
    BuildYear CHAR(4),
    Price DECIMAL(18,2),
    Location VARCHAR(255),
    VideoUrl VARCHAR(255),
    ProductID INT NOT NULL,
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID)
);
