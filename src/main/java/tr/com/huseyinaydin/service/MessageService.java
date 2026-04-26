package tr.com.huseyinaydin.service;

import tr.com.huseyinaydin.dto.message.CreateMessageDto;
import tr.com.huseyinaydin.dto.message.GetByIdMessageDto;
import tr.com.huseyinaydin.dto.message.ResultInBoxMessageDto;
import tr.com.huseyinaydin.dto.message.ResultSendBoxMessageDto;

import java.util.List;

public interface MessageService {
    List<ResultInBoxMessageDto> getInBoxLast3MessageListByReceiver(int id);
    List<ResultInBoxMessageDto> getAllMessageInBox(int id);
    List<ResultSendBoxMessageDto> getAllMessageSendBox(int id);
    void createMessage(CreateMessageDto createMessageDto);
    GetByIdMessageDto getMessage(int messageId);
}
