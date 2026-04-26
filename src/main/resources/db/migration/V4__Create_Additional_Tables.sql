CREATE TABLE Address (
    AddressID INT AUTO_INCREMENT PRIMARY KEY,
    AddressTitle1 VARCHAR(255),
    Description VARCHAR(500),
    AddressTitle2 VARCHAR(255),
    Phone1 VARCHAR(20),
    Phone2 VARCHAR(20),
    Email VARCHAR(100),
    Location VARCHAR(255)
);

CREATE TABLE BottomGrid (
    BottomGridID INT AUTO_INCREMENT PRIMARY KEY,
    Icon VARCHAR(100),
    Title VARCHAR(100),
    Description VARCHAR(255)
);

CREATE TABLE Contact (
    ContactID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    Subject VARCHAR(100),
    Email VARCHAR(100),
    Message TEXT,
    SendDate DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE PopularLocation (
    LocationID INT AUTO_INCREMENT PRIMARY KEY,
    CityName VARCHAR(100),
    ImageUrl VARCHAR(255)
);

CREATE TABLE SubFeature (
    SubFeatureID INT AUTO_INCREMENT PRIMARY KEY,
    Icon VARCHAR(100),
    Title VARCHAR(100),
    Description VARCHAR(255)
);

CREATE TABLE ToDoList (
    ToDoListID INT AUTO_INCREMENT PRIMARY KEY,
    Description VARCHAR(255),
    ToDoListStatus BIT DEFAULT 0
);

CREATE TABLE Amenity (
    AmenityId INT AUTO_INCREMENT PRIMARY KEY,
    Title VARCHAR(100)
);

CREATE TABLE PropertyAmenity (
    PropertyAmenityId INT AUTO_INCREMENT PRIMARY KEY,
    PropertyId INT NOT NULL,
    AmenityId INT NOT NULL,
    Status BIT DEFAULT 1,
    FOREIGN KEY (PropertyId) REFERENCES Product(ProductID),
    FOREIGN KEY (AmenityId) REFERENCES Amenity(AmenityId)
);
