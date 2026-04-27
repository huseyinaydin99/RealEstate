package tr.com.huseyinaydin.dto.product;

import java.math.BigDecimal;

public class ResultProductAdvertListWithCategoryByEmployeeDto {
    private int productID;
    private String title;
    private BigDecimal price;
    private String city;
    private String district;
    private String categoryName;
    private String coverImage;
    private String type;
    private String address;
    private boolean dealOfTheDay;

    public ResultProductAdvertListWithCategoryByEmployeeDto() {
    }

    public ResultProductAdvertListWithCategoryByEmployeeDto(int productID, String title, BigDecimal price, String city, String district, String categoryName, String coverImage, String type, String address, boolean dealOfTheDay) {
        this.productID = productID;
        this.title = title;
        this.price = price;
        this.city = city;
        this.district = district;
        this.categoryName = categoryName;
        this.coverImage = coverImage;
        this.type = type;
        this.address = address;
        this.dealOfTheDay = dealOfTheDay;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDealOfTheDay() {
        return dealOfTheDay;
    }

    public void setDealOfTheDay(boolean dealOfTheDay) {
        this.dealOfTheDay = dealOfTheDay;
    }
}
