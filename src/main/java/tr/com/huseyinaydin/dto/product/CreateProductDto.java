package tr.com.huseyinaydin.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductDto {
    private String title;
    private BigDecimal price;
    private String city;
    private String district;
    private String coverImage;
    private String address;
    private String description;
    private String type;
    private boolean dealOfTheDay;
    private LocalDateTime advertisementDate;
    private boolean productStatus;
    private int productCategory;
    private int appUserId;

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

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDealOfTheDay() {
        return dealOfTheDay;
    }

    public void setDealOfTheDay(boolean dealOfTheDay) {
        this.dealOfTheDay = dealOfTheDay;
    }

    public LocalDateTime getAdvertisementDate() {
        return advertisementDate;
    }

    public void setAdvertisementDate(LocalDateTime advertisementDate) {
        this.advertisementDate = advertisementDate;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    public int getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(int productCategory) {
        this.productCategory = productCategory;
    }

    public int getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(int appUserId) {
        this.appUserId = appUserId;
    }
}
