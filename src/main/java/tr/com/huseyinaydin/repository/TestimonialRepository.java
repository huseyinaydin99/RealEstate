package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.testimonial.ResultTestimonialDto;
import java.util.List;

@Mapper
public interface TestimonialRepository {
    List<ResultTestimonialDto> getAllTestimonial();
}
