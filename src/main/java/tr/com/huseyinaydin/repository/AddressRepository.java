package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import tr.com.huseyinaydin.dto.address.ResultAddressDto;
import tr.com.huseyinaydin.dto.address.UpdateAddressDto;
import java.util.List;

@Mapper
public interface AddressRepository {
    List<ResultAddressDto> getAllAddress();
    void updateAddress(UpdateAddressDto updateAddressDto);
    ResultAddressDto getAddress(int id);
}
