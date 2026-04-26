package tr.com.huseyinaydin.dto.testimonial;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultTestimonialDto {
    private int testimonialID;
    private String nameSurname;
    private String title;
    private String comment;
    private boolean status;
}
