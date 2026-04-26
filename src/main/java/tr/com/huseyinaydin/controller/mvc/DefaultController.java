package tr.com.huseyinaydin.controller.mvc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tr.com.huseyinaydin.dto.product.ResultProductWithCategoryDto;
import tr.com.huseyinaydin.service.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class DefaultController {
    private final ProductService productService;
    private final WhoWeAreDetailService whoWeAreDetailService;
    private final ServiceService serviceService;
    private final TestimonialService testimonialService;
    private final PopularLocationService popularLocationService;
    private final BottomGridService bottomGridService;

    @GetMapping({"/", "/Default/Index", "/index"})
    public String index(Model model) {
        List<ResultProductWithCategoryDto> products = productService.getAllProductWithCategory();
        List<ResultProductWithCategoryDto> dealOfTheDayProducts = products.stream()
                .filter(ResultProductWithCategoryDto::isDealOfTheDay)
                .limit(3)
                .collect(Collectors.toList());

        model.addAttribute("products", products);
        model.addAttribute("dealOfTheDayProducts", dealOfTheDayProducts);
        model.addAttribute("whoWeAreDetails", whoWeAreDetailService.getAllWhoWeAreDetail());
        model.addAttribute("services", serviceService.getAllService());
        model.addAttribute("testimonials", testimonialService.getAllTestimonial());
        model.addAttribute("popularLocations", popularLocationService.getAllPopularLocations());
        model.addAttribute("bottomGrids", bottomGridService.getAllBottomGrid());

        return "default/index";
    }
}
