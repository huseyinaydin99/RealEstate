package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.contact.CreateContactDto;
import tr.com.huseyinaydin.dto.contact.ResultContactDto;
import java.util.List;

@Mapper
public interface ContactRepository {
    List<ResultContactDto> getAllContact();
    void createContact(CreateContactDto createContactDto);
    void deleteContact(int id);
    ResultContactDto getContact(int id);
    List<ResultContactDto> getLast4Contact();
}
