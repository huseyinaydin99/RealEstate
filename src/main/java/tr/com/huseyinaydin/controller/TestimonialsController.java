package tr.com.huseyinaydin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.huseyinaydin.dto.testimonial.ResultTestimonialDto;
import tr.com.huseyinaydin.service.TestimonialService;

import java.util.List;

@RestController
@RequestMapping("api/testimonials")
@RequiredArgsConstructor
public class TestimonialsController {
    private final TestimonialService testimonialService;

    @GetMapping
    public ResponseEntity<List<ResultTestimonialDto>> testimonialList() {
        return ResponseEntity.ok(testimonialService.getAllTestimonial());
    }
}
