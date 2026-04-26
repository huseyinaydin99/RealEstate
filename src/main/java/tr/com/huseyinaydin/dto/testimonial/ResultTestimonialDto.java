package tr.com.huseyinaydin.dto.testimonial;

import lombok.Data;

@Data
public class ResultTestimonialDto {
    private int testimonialID;
    private String nameSurname;
    private String title;
    private String comment;
    private boolean status;
}
