package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.testimonial.ResultTestimonialDto;
import tr.com.huseyinaydin.repository.TestimonialRepository;
import tr.com.huseyinaydin.service.TestimonialService;

import java.util.List;

@Service
public class TestimonialServiceImpl implements TestimonialService {
    private final TestimonialRepository testimonialRepository;

    public TestimonialServiceImpl(TestimonialRepository testimonialRepository) {
        this.testimonialRepository = testimonialRepository;
    }

    @Override
    public List<ResultTestimonialDto> getAllTestimonial() {
        return testimonialRepository.getAllTestimonial();
    }
}
