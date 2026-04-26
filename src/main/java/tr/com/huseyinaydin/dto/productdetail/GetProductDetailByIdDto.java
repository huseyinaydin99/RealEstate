package tr.com.huseyinaydin.dto.productdetail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductDetailByIdDto {
    private Integer productDetailID;
    private Integer productSize;
    private Integer bedroomCount;
    private Integer bathCount;
    private Integer roomCount;
    private Integer garageSize;
    private String buildYear;
    private BigDecimal price;
    private String location;
    private String videoUrl;
    private Integer productID;

    public Integer getProductDetailID() {
        return productDetailID;
    }

    public void setProductDetailID(Integer productDetailID) {
        this.productDetailID = productDetailID;
    }

    public Integer getProductSize() {
        return productSize;
    }

    public void setProductSize(Integer productSize) {
        this.productSize = productSize;
    }

    public Integer getBedroomCount() {
        return bedroomCount;
    }

    public void setBedroomCount(Integer bedroomCount) {
        this.bedroomCount = bedroomCount;
    }

    public Integer getBathCount() {
        return bathCount;
    }

    public void setBathCount(Integer bathCount) {
        this.bathCount = bathCount;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getGarageSize() {
        return garageSize;
    }

    public void setGarageSize(Integer garageSize) {
        this.garageSize = garageSize;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }
}
