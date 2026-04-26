CREATE TABLE Category (
    CategoryID INT AUTO_INCREMENT PRIMARY KEY,
    CategoryName VARCHAR(100) NOT NULL,
    CategoryStatus BIT NOT NULL
);

CREATE TABLE AppRole (
    RoleId INT AUTO_INCREMENT PRIMARY KEY,
    RoleName VARCHAR(50) NOT NULL
);

CREATE TABLE AppUser (
    UserId INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    UserName VARCHAR(100) NOT NULL,
    Password VARCHAR(100) NOT NULL,
    UserRole INT NOT NULL,
    Email VARCHAR(100),
    PhoneNumber VARCHAR(20),
    UserImageUrl VARCHAR(255),
    FOREIGN KEY (UserRole) REFERENCES AppRole(RoleId)
);

CREATE TABLE Product (
    ProductID INT AUTO_INCREMENT PRIMARY KEY,
    Title VARCHAR(255) NOT NULL,
    Price DECIMAL(18,2) NOT NULL,
    City VARCHAR(100) NOT NULL,
    District VARCHAR(100) NOT NULL,
    CoverImage VARCHAR(255),
    Address VARCHAR(500),
    Description TEXT,
    Type VARCHAR(50),
    DealOfTheDay BIT DEFAULT 0,
    AdvertisementDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    ProductStatus BIT DEFAULT 1,
    ProductCategory INT NOT NULL,
    AppUserId INT NOT NULL,
    SlugUrl VARCHAR(255),
    FOREIGN KEY (ProductCategory) REFERENCES Category(CategoryID),
    FOREIGN KEY (AppUserId) REFERENCES AppUser(UserId)
);

CREATE TABLE ProductImage (
    ProductImageId INT AUTO_INCREMENT PRIMARY KEY,
    ImageUrl VARCHAR(255) NOT NULL,
    ProductId INT NOT NULL,
    FOREIGN KEY (ProductId) REFERENCES Product(ProductID)
);

CREATE TABLE WhoWeAreDetail (
    WhoWeAreDetailId INT AUTO_INCREMENT PRIMARY KEY,
    Title VARCHAR(255),
    SubTitle VARCHAR(255),
    Description1 TEXT,
    Description2 TEXT
);

CREATE TABLE Service (
    ServiceID INT AUTO_INCREMENT PRIMARY KEY,
    ServiceName VARCHAR(100) NOT NULL,
    ServiceStatus BIT NOT NULL
);

CREATE TABLE Testimonial (
    TestimonialID INT AUTO_INCREMENT PRIMARY KEY,
    NameSurname VARCHAR(100),
    Title VARCHAR(100),
    Comment TEXT,
    Status BIT
);
