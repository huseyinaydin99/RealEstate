package tr.com.huseyinaydin.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tr.com.huseyinaydin.dto.product.GetProductByProductIdDto;
import tr.com.huseyinaydin.dto.product.ResultProductWithSearchListDto;
import tr.com.huseyinaydin.dto.productdetail.GetProductDetailByIdDto;
import tr.com.huseyinaydin.service.*;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Controller
@RequestMapping("/property")
public class PropertyController {
    private final ProductService productService;
    private final ProductDetailService productDetailService;
    private final ProductImageService productImageService;
    private final PropertyAmenityService propertyAmenityService;
    private final AppUserService appUserService;

    public PropertyController(ProductService productService, ProductDetailService productDetailService, ProductImageService productImageService, PropertyAmenityService propertyAmenityService, AppUserService appUserService) {
        this.productService = productService;
        this.productDetailService = productDetailService;
        this.productImageService = productImageService;
        this.propertyAmenityService = propertyAmenityService;
        this.appUserService = appUserService;
    }

    @GetMapping("/{id}")
    public String propertySingle(@PathVariable int id, Model model) {
        GetProductByProductIdDto product = productService.getProductByProductId(id);
        GetProductDetailByIdDto productDetail = productDetailService.getProductDetailByProductId(id);

        long datediff = ChronoUnit.DAYS.between(product.getAdvertisementDate(), LocalDateTime.now());

        model.addAttribute("productID", id);
        model.addAttribute("title1", product.getTitle());
        model.addAttribute("price", product.getPrice());
        model.addAttribute("city", product.getCity());
        model.addAttribute("district", product.getDistrict());
        model.addAttribute("address", product.getAddress());
        model.addAttribute("type", product.getType());
        model.addAttribute("description", product.getDescription());
        model.addAttribute("date", product.getAdvertisementDate());
        model.addAttribute("datediff", datediff);
        model.addAttribute("slugUrl", product.getSlugUrl());

        if (productDetail != null) {
            model.addAttribute("bedCount", productDetail.getBedroomCount());
            model.addAttribute("bathCount", productDetail.getBathCount());
            model.addAttribute("size", productDetail.getProductSize());
            model.addAttribute("roomCount", productDetail.getRoomCount());
            model.addAttribute("garageCount", productDetail.getGarageSize());
            model.addAttribute("buildYear", productDetail.getBuildYear());
            model.addAttribute("location", productDetail.getLocation());
            model.addAttribute("videoUrl", productDetail.getVideoUrl());
        }

        model.addAttribute("productImages", productImageService.getProductImageByProductId(id));
        model.addAttribute("propertyAmenities", propertyAmenityService.getPropertyAmenityByStatusTrue(id));
        model.addAttribute("appUser", appUserService.getById(product.getAppUserId()));

        return "property/property_single";
    }

    @GetMapping
    public String index(Model model) {
        List<ResultProductWithSearchListDto> values = productService.resultProductWithSearchList("", 0, "");
        model.addAttribute("products", values);
        return "property/property_list_with_search";
    }

    @GetMapping("/search")
    public String propertyListWithSearch(@RequestParam(required = false, defaultValue = "") String searchKeyValue,
                                         @RequestParam(required = false, defaultValue = "0") int propertyCategoryId,
                                         @RequestParam(required = false, defaultValue = "") String city,
                                         Model model) {
        List<ResultProductWithSearchListDto> values = productService.resultProductWithSearchList(searchKeyValue, propertyCategoryId, city);
        model.addAttribute("products", values);
        return "property/property_list_with_search";
    }
}
