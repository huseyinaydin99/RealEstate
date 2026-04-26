package tr.com.huseyinaydin.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tr.com.huseyinaydin.dto.message.CreateMessageDto;
import tr.com.huseyinaydin.dto.message.GetByIdMessageDto;
import tr.com.huseyinaydin.dto.message.ResultInBoxMessageDto;
import tr.com.huseyinaydin.dto.message.ResultSendBoxMessageDto;
import tr.com.huseyinaydin.repository.MessageMapper;
import tr.com.huseyinaydin.service.MessageService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    private final MessageMapper messageMapper;

    public MessageServiceImpl(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @Override
    @Cacheable(value = "last3messages", key = "#id")
    public List<ResultInBoxMessageDto> getInBoxLast3MessageListByReceiver(int id) {
        return messageMapper.getInBoxLast3MessageListByReceiver(id);
    }

    @Override
    @Cacheable(value = "inbox", key = "#id")
    public List<ResultInBoxMessageDto> getAllMessageInBox(int id) {
        return messageMapper.getAllMessageInBox(id);
    }

    @Override
    @Cacheable(value = "sendbox", key = "#id")
    public List<ResultSendBoxMessageDto> getAllMessageSendBox(int id) {
        return messageMapper.getAllMessageSendBox(id);
    }

    @Override
    @CacheEvict(value = {"last3messages", "inbox", "sendbox"}, allEntries = true)
    public void createMessage(CreateMessageDto createMessageDto) {
        Integer receiverId = messageMapper.findUserIdByEmail(createMessageDto.getReceiverEmail());
        if (receiverId == null) {
            throw new RuntimeException("Kullanıcı bulunamadı");
        }
        createMessageDto.setReceiver(receiverId);
        createMessageDto.setSendDate(LocalDateTime.now());
        createMessageDto.setIsRead(false);
        messageMapper.createMessage(createMessageDto);
    }

    @Override
    public GetByIdMessageDto getMessage(int messageId) {
        return messageMapper.getMessage(messageId);
    }
}
