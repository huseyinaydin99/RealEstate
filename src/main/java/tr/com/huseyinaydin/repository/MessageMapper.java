package tr.com.huseyinaydin.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tr.com.huseyinaydin.dto.message.CreateMessageDto;
import tr.com.huseyinaydin.dto.message.GetByIdMessageDto;
import tr.com.huseyinaydin.dto.message.ResultInBoxMessageDto;
import tr.com.huseyinaydin.dto.message.ResultSendBoxMessageDto;

import java.util.List;

@Mapper
public interface MessageMapper {
    List<ResultInBoxMessageDto> getInBoxLast3MessageListByReceiver(@Param("id") int id);
    List<ResultInBoxMessageDto> getAllMessageInBox(@Param("id") int id);
    List<ResultSendBoxMessageDto> getAllMessageSendBox(@Param("id") int id);
    void createMessage(CreateMessageDto createMessageDto);
    GetByIdMessageDto getMessage(@Param("messageId") int messageId);
    Integer findUserIdByEmail(@Param("email") String email);
}
